package asahi;

import lombok.Getter;
import lombok.Setter;

public class Dog {
	
	private String name;

	@Setter @Getter
	private int age;
	
	//名前のset
	public void SetName(String name) {
		this.name = name;
	}
	
	//名前のget
	public String ShowProfile() {
		return this.name;
	}
	

	//コンストラクタ今回はなしで
	//public Dog() {
	//}
	
	
}
