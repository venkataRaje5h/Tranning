package tranning;

import java.util.Scanner;

public class DataType {

	public void findDatatypesFits(long val) {
		if (val == 0) {

			return;
		}
		boolean check = false;
		if (val > Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
			System.out.println("* BYTE");
			check = true;
		}
		if (check || val > Short.MIN_VALUE && val <= Short.MAX_VALUE) {
			System.out.println("* Short");
			check = true;
		}
		if (check || val > Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
			System.out.println("* Int");
			check = true;
		}
		if (check || val > Long.MIN_VALUE && val <= Long.MAX_VALUE) {
			System.out.println("* Long");
		} else {
			System.out.println("value can't be fitted anywhere");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DataType dt = new DataType();
		System.out.println("Enter the number of input : ");
		int len = scanner.nextInt();
		String[] arr = new String[len];
		for (int index = 0; index < len; index++) {
			arr[index] = scanner.next();
		}
		scanner.close();
		long value;
		for (int index = 0; index < len; index++) {
			try {
				value = Long.parseLong(arr[index]);
			} catch (Exception e) {
				System.out.println(arr[index] + " can't be fitted anywhere");
				continue;
			}
			System.out.println(arr[index] + " can be fitted in :");
			dt.findDatatypesFits(value);
		}

	}

}
