
public class Sorter {
	private int currentReads = -1;
	private int currentWrites = -1;
	public void reset() {
		currentReads = 0;
		currentWrites = 0;
	}
	public void doBubbleSort(int[] sortMe) {
		if (sortMe == null) {return;}
		int n = sortMe.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				currentReads += 2;
				if (sortMe[j] < sortMe[j-1]) {
					currentWrites += 2;
					currentReads += 2;
					int temp = sortMe[j];
					sortMe[j] = sortMe[j-1];
					sortMe[j-1] = temp;
				}
			}
		}
	}
	public void doSelectionSort(int[] sortMe) {
		for (int n = sortMe.length, i = 0; i < n; i++) {
			int current = i;
			for (int j = i+1; j < n; j++) {
				currentReads += 2;
				if (sortMe[j] < sortMe[current]) {
					current = j;
				}
			}
			currentReads += 2;
			currentWrites += 2;
			int temp = sortMe[i];
			sortMe[i] = sortMe[current];
			sortMe[current] = temp;
		}
	}
	public void doInsertionSort(int[] sortMe) {
		for (int n = sortMe.length, i = 0; i < n; i++) {
			int current = i;
			while (current != 0 && sortMe[current] <= sortMe[current-1]) {
				currentReads += 4;
				currentWrites += 2;
				int temp = sortMe[current];
				sortMe[current] = sortMe[current-1];
				sortMe[current-1] = temp;
				current--;
			}
		}
	}
	public int getReads() {
		return currentReads;
	}
	public int getWrites() {
		return currentWrites;
	}
}
