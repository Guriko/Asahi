package asahi;

import lombok.Getter;
import lombok.Setter;

public class Dog {
	
	private String name;

	/**
	 * Javaのスタンダードではメソッド名は小文字で始まる
	 * Getter, Setterはそれぞれ
	 * 
	 * getName, setName とする。
	 * 
	 * ほんでGetterとSetterはlombokに自動生成させると良い。
	 * アノテーションでgetAge, setAgeが自動生成される。
	 * @Getterのみ、@Setterのみも勿論可能。
	 */
	@Getter @Setter
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
