package TH1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyCaesarTest {
	@Test
	public void testEncryptChar() {
		MyCaesar caesarCipher = new MyCaesar(3);

		// Mã hóa ký tự 'A'
		char encryptedChar = caesarCipher.encryptChar('A');

		// Ký tự được mã hóa phải là 'D'
		assertEquals('D', encryptedChar);
	}

	@Test
	public void testDecryptChar() {
		MyCaesar caesarCipher = new MyCaesar(3);

		// Giải mã ký tự 'D'
		char decryptedChar = caesarCipher.decryptChar('D');

		// Ký tự được giải mã phải là 'A'
		assertEquals('A', decryptedChar);
	}

	@Test
	public void testEncryptText() {
		MyCaesar caesarCipher = new MyCaesar(3);

		// Mã hóa văn bản "HELLO WORLD"
		String encryptedText = caesarCipher.encrypt("HELLO WORLD");

		// Văn bản được mã hóa phải là "KHOOR ZRUOG"
		assertEquals("KHOOR ZRUOG", encryptedText);
	}

	@Test
	public void testDecryptText() {
		MyCaesar caesarCipher = new MyCaesar(3);

		// Giải mã văn bản "KHOOR ZRUOG"
		String decryptedText = caesarCipher.decrypt("KHOOR ZRUOG");

		// Văn bản được giải mã phải là "HELLO WORLD"
		assertEquals("HELLO WORLD", decryptedText);
	}
}
