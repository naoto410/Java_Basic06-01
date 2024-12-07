package mypackage;

public class Main {
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
	    sb.reverse();
	    return sb.toString();
	}
	public static void main(String[] args) {
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
			    String originalString = args[i];
			    String reversedString = reverseString(originalString);

			    System.out.println("元の文字列： " + originalString);
			    System.out.println("逆順の文字列： " + reversedString);
			}
		} else {
			System.out.println("エラー：文字を入力してください。");
		}
	}
}