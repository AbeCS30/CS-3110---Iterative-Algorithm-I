
public class Searcher {
	private int currentReads = -1;
	public int getReads() {
		return currentReads;
	}
	public int doBinarySearch(int[] array, int value) {
		int top = array.length-1;
		int bottom = 0;
		currentReads = 0;
		int index = -1;
		while (bottom <= top) {
			currentReads++;
			int mid = (top + bottom)/2;
			if (array[mid] == value) {
				index = mid;
				top = mid-1;
			} else if (array[mid] > value) {
				top = mid-1;
			} else {
				bottom = mid+1;
			}
		}
		return index;
	}
}
