package week5ObjectsAndDataTypes;

public class Div2 {
	public static void main(String args[]) {
		int first = Integer.parseInt(args[0]);
		int last = Integer.parseInt(args[1]);
		if (first <= last) {
			for (int i = first; i <= last; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println(first + " cannot be greater than " + last);
		}
	}

}
