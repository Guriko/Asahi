package asahi;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
	public static void main(String[] args) {
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty(" "));
		
		System.out.println();
		
		System.out.println(StringUtils.isBlank(null));
		System.out.println(StringUtils.isBlank(""));
		System.out.println(StringUtils.isBlank(" "));
		
		System.out.println();
		
		System.out.println(StringUtils.equals(null, null));
		System.out.println(StringUtils.equals(null, "a"));
		
		System.out.println();
		
		System.out.println(StringUtils.indexOf("aba", "a"));
	}
}
