package encoding.affine;

import java.math.BigInteger;

public class Decoding {
	private static String base = AffineMain.base;
	public static String encodeBase = Encoding.encoding(base);//base encoding!
	private static int a = AffineMain.a;
	private static int b = AffineMain.b;
	private static int m = AffineMain.m;
	
	public static String decoding(String text) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			BigInteger inverse = BigInteger.valueOf(a).modInverse(BigInteger.valueOf((long) m));
			int aInv = inverse.intValue();
			
			if (Character.isLetter(ch)) {
				int x = base.indexOf(ch);
				int indDecod =	( aInv )* ( x - b + m)% m;
				ch = base.charAt(indDecod);
				
			//	ch = (char) (( aInv )* ( x - b + m)% m + 'А');
				//ch = (char) (( aInv )* ( ch - 'А' - b + m)% m + 'А');
			}
			builder.append(ch);
		}
		String decodeText =  builder.toString();
		return decodeText;
	}
}
