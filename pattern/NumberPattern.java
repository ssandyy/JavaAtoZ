class NumberPattern {
	public static void main(String... args) {
		for (int i = 1; i <= 25; i++) {
			if (i % 5 == 0) {
				System.out.print(i);
				System.out.println();
			} else
				System.out.print(i);
		}
	}
}