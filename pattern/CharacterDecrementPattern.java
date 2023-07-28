class CharacterDecrementPattern {
	public static void main(String... args) {
		char ch = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((char) (ch + i + j));
			}
			System.out.println();
		}
	}
}