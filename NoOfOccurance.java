package week2.day2;

public class NoOfOccurance {

	public static void main(String[] args) {

		int[] str = { 10, 21, 32, 32, 10 };

		// int len = str.length;
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {

					count++;
					System.out.println(str[i]);

				}

			}

		}
		System.out.println(count);

	}

}
