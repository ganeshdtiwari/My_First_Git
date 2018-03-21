package myStretchTask;

public class Tricky {
	static int va1, va2, va3;

	public static void main(String[] args) {

		while (va2 < 10) {
			va3 = va2 + va1;
			va2 = 4;
			va1 = va2 + 1;
			System.out.println(va3);
			if (va1 == 5) {
				System.out.println(va1);

			} else  {
				System.out.println(va1 + 1);
			}
			va2=va2+1;

		}
		System.out.println("Wow-that was tricky!");
		System.out.println("But hte answer is...");
		System.out.println(va2+va1);

	}

}
