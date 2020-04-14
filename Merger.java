
public class Merger {
	public int[] doMerge(int[] a, int[] b) {
		if (a != null && b != null) {
			int[] newArray = new int[a.length + b.length];
			int currentA = 0; int currentB = 0; int currentIndex = 0;
			while (currentA != a.length || currentB != b.length) {
				if (currentA == a.length) {
					newArray[currentIndex] = b[currentB];
					currentB++;
				} else if (currentB == b.length) {
					newArray[currentIndex] = a[currentA];
					currentA++;
				} else if (a[currentA] <= b[currentB]) {
					newArray[currentIndex] = a[currentA];
					currentA++;
				} else {
					newArray[currentIndex] = b[currentB];
					currentB++;
				}
				currentIndex++;
			}
			return newArray;
		} else if (a == null && b == null) {
			return new int[] {};
		} else if (a == null) {
			return b;
		} else {
			return a;
		}
	}
}
