package asahi;

public class DogUse {
	public static void main(String[] args) {
		//インスタンス作成
		Dog dog = new Dog();
		
		//nameをsetする
		dog.SetName("ポメラニアン");
		
		//setした名前を表示する
		System.out.println(dog.ShowProfile());
	}
}
