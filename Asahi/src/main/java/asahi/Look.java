package asahi;

	import static java.nio.file.StandardWatchEventKinds.*;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;

import lombok.val;
	//@Slf4j
	public class Look {

		public static void main(String[] args) throws Exception {
			//親ディレクトリWatchKKey
			WatchKey parentKey;
			
			//比べる拡張子
			val IND = "ind";
			
			//Path指定
			val dir = Paths.get("C:\\location");
			
			//インスタンス作成
			//WatchService watcher = FileSystems.getDefault().newWatchService();
			val watcher = FileSystems.getDefault().newWatchService();
			
			//監視スタート
			parentKey = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE);

			for (;;) {
				
				//イベント発火まで待機
				val watchKey = watcher.take();
				
				//イベント発火で、watchKeyにregisterからの情報を取得
				for (WatchEvent<?> event: watchKey.pollEvents()) {
					
					//"OVERFLOW"はイベントが消失or破棄の監視
					if (event.kind() == OVERFLOW) {
						continue;
					}

					WatchEvent<Path> ev = cast(event);
					WatchEvent.Kind<?> kind = event.kind();
					
					val name = ev.context();
					val child = dir.resolve(name);
					
					//PathからFileにキャストする
					File file = child.toFile();

					//親ディレクトリ化の確認
					if(parentKey.equals(watchKey)) {
						System.out.println("親ディレクトリで作業しています");
						if(file.isDirectory()) {
							
							//サブフォルダも監視対象にする
							//System.out.println("dir：" + name + "を監視します");
							//log.info(name + "の監視を止めます");
							child.register(watcher, ENTRY_CREATE, ENTRY_DELETE);
						}
					}else {
						
						//ファイルの拡張子確認
						String extension = name.toString();
						String incl =  getSuffix(extension);
						
						//拡張子が「.ind」の場合、監視を止める
						if(incl.equals(IND)) {
							System.out.println(name + "の監視を止めます");
							watchKey.cancel();
						}
						
						//CREATE若しくはDELETEの出力
						System.out.println("kind=" + kind + ", context=" + name);
					}
				}
				watchKey.reset();
			}
		}
		//拡張子確認メソッド
		public static String getSuffix(String fileName) {
			if (fileName == null) {
				return null;
			}
			int point = fileName.lastIndexOf(".");
			if (point != -1) {
				return fileName.substring(point + 1);
			}
			return fileName;
		}

		@SuppressWarnings("unchecked")
		static <T> WatchEvent<T> cast(WatchEvent<?> event) {
			return (WatchEvent<T>)event;
		}
	}


