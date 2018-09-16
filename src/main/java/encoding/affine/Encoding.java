package encoding.affine;

public class Encoding {
	private static String base = AffineMain.base;
	private static int a = AffineMain.a;
	private static int b = AffineMain.b;
	private static int m = AffineMain.m;
	
	public static String encoding(String text) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if (Character.isLetter(ch)) {
				int indEncode =( a * base.indexOf(ch) + b)% m;
				ch = base.charAt(indEncode);
			}
			builder.append(ch);
		}
		String encodeText =  builder.toString();
		return encodeText;
	}
}
