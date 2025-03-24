public class PracticeProblem {

	public static void main(String args[]) {
		// visualization test case
		// bubbleSortString(new String[] {"zZ","q","c","b","a","y","z","j"});
	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

	// public static void print(String[] yo) {
	// 	for (int i = 0; i < yo.length; i++) {
	// 		System.out.print(yo[i] + " ");
	// 	}
	// 	System.out.println();
	// }
	public static void bubbleSortString(String[] strings) {

		int finalIteration = strings.length - 1;
		for (int i = 0; i < finalIteration; i++) {
			for (int n = 0; n < finalIteration - i; n++) {
				// visualize the bubbling
				// print(strings);

				String bubble = strings[n];
				String water = strings[n + 1];
				
				if (bubble.toLowerCase().compareTo(water.toLowerCase()) > 0) {
					strings[n] = water;
					strings[n + 1] = bubble;
				// } else {
				// 	break;
				}
			}
		}
	}
}

/*
Create a method called bubbleSortString(String[] strings) which takes in a string array and sorts it in alphabetical order.  Your bubble sort should ignore casing.  return nothing.
*/