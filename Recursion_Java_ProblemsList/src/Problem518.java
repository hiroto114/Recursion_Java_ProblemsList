
/*
 * 二つの文字列を一文字ずつ XOR で暗号化する encryptionText という関数を作成してください。
 * 
 * encryptionText("cryption","GMWAGVfFHHbWeRI") --> $?.13? (+:';&
 * encryptionText("abc","ZKGQKLZTUJfPCFY") --> ;)$0)/;66+3"$:
 * encryptionText("rtccd","KKJJDSOkKdbnmaJdklQQWeeE") --> 9?)) !;(.25%&
 */
public class Problem518 {
	public static String encryptionText(String key, String message) {
		StringBuilder result = new StringBuilder(message.length());

		for (int i = 0; i < message.length(); i++) {
			result.append((char) (message.charAt(i) ^ key.charAt(i % key.length())));
		}

		return result.toString();
	}
}
