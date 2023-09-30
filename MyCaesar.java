package TH1;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F',
			'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
			private int n;// shift steps (right shift)
			public MyCaesar(int shiftSteps) {
			this.n = shiftSteps;
			}
			// Mã hóa ký tự
			public char encryptChar(char c) {
			    int index = indexOf(c);
			    return ALPHABET[(index + n) % ALPHABET.length];
			}

			// Giải mã ký tự
			public char decryptChar(char c) {
			    int index = indexOf(c);
			    return ALPHABET[(index - n) % ALPHABET.length];
			}

			// Mã hóa văn bản
			public String encrypt(String input) {
			    char[] encryptedText = new char[input.length()];
			    for (int i = 0; i < input.length(); i++) {
			        char c = input.charAt(i);
			        encryptedText[i] = encryptChar(c);
			    }
			    return new String(encryptedText);
			}

			// Giải mã văn bản
			public String decrypt(String input) {
			    char[] plainText = new char[input.length()];
			    for (int i = 0; i < input.length(); i++) {
			        char c = input.charAt(i);
			        plainText[i] = decryptChar(c);
			    }
			    return new String(plainText);
			}
	
}
