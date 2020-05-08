package asahi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest extends Dog {

	/**
	 * 単体テストでは以下のように日本語のメソッド名を用いるとテスト項目が分かりやすい。
	 * プレフィックスとして「test_」をつけて「test_年齢の設定と取得」でも良い。
	 * 
	 * 通常、メソッドのテストを書く場合はtestGetAge, testSetAgeという命名を使うのが標準だが、
	 * いくつかのメソッドを使った一連のテストの場合は内容がわかりやすいように日本語で書いてやっていい。
	 * testコードは納品されない。(jarに入らない)
	 * 
	 * IDEから実行させる場合は右クリックして[Run As]->[JUnit test]か、
	 * ショートカットキーAlt+Shift+'X', 'T'
	 * 
	 * gradleでUTを走らせるのは以下のコマンド
	 * 
	 * ./gradle test
	 */
	@Test
	void 年齢の設定と取得() {
		setAge(0);
		assertEquals(0, getAge());
	}
}
