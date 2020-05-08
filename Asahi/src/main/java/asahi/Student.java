package asahi;

public class Student {
	/**
	 * 名前。
	 */
	private String name;
	/**
	 * 英語の点数。
	 */
	private int english;
	/**
	 * 数学の点数。
	 */
	private int math;
	/**
	 * 理科の点数。
	 */
	private int science;
	
	/**
	 * コンストラクタ。
	 * @param name 名前
	 */
	public Student(String name) {
		this(name, 0, 0, 0);
	}
	
	/**
	 * コンストラクタ。
	 * @param name 名前
	 * @param english 英語の点数
	 * @param math 数学の点数
	 * @param science 理科の点数
	 */
	public Student(String name, int english, int math, int science) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	/**
	 * 名前を返します。
	 * @return 名前
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 英語の点数を返します。
	 * @return 英語の点数
	 */
	public int getEnglish() {
		return this.english;
	}
	
	/**
	 * 数学の点数を返します。
	 * @return 数学の点数
	 */
	public int getMath() {
		return this.math;
	}
	
	/**
	 * 理科の点数を返します。
	 * @return 理科の点数
	 */
	public int getScience() {
		return this.science;
	}
	
}