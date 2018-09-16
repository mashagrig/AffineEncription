package encoding.affine;

import java.math.BigInteger;
import java.util.Scanner;

public class AffineMain {
	public static String base = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
	public static int a = 4;
	public static int b = 3;
	public static int m = base.length();
	
	public static void main(String args[]) {
		String encod = "";
		String decod = "";
		System.out.println("Чтобы произвести шифрование, нажмите Ш, чтобы произвести дешифрование, нажмите Д: ");
		Scanner inEnter = new Scanner(System.in);
		String textEnter = inEnter.nextLine();
		
		if (textEnter.equalsIgnoreCase("Ш")) {
			System.out.println("Введите слово для шифрования: ");
			Scanner inEncod = new Scanner(System.in);
			String text = inEncod.nextLine();
			encod = Encoding.encoding(text);
			decod = Decoding.decoding(encod);
			
			System.out.println("Вы ввели: " + text);
			System.out.println("Ваше слово зашифровано: " + encod);
			System.out.println("Ваше слово дешифровано: " + decod);
		}
		if (textEnter.equalsIgnoreCase("Д")) {
			System.out.println("Введите слово для шифрования: ");
			Scanner inDecod = new Scanner(System.in);
			String text = inDecod.nextLine();
			decod = Decoding.decoding(text);
			
			System.out.println("Вы ввели: " + text);
			System.out.println("Ваше слово дешифровано: " + decod);
		}
		
		System.out.println("----------------------");
		System.out.println("Длина алфавита: " + m);
		System.out.println("Возможные значения а: " + aSet.aSimlpeSet(m).toString());
		System.out.println("Количество возможных значений а: " + aSet.aSimlpeSet(m).size());
	}
	
/*
	public static String encoding(String text) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if (Character.isLetter(ch)) {
			//	ch = (char) ((a * (ch - 'А') + b) % m + 'А');
				int indEncode =( a * (base.indexOf(ch)) + b)% m;
				ch = base.charAt(indEncode);
			}
			builder.append(ch);
		}
		return builder.toString();
	}
	
	public static String decoding(String text) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			BigInteger inverse = BigInteger.valueOf(a).modInverse(BigInteger.valueOf((long) m));
			
			if (Character.isLetter(ch)) {
				int inv = inverse.intValue() * (ch - 'А' - b + m);
				ch = (char) (inv % m + 'А'); //a^-1 * (x - b) mod m
			}
			builder.append(ch);
		}
		return builder.toString();
	}*/
}
