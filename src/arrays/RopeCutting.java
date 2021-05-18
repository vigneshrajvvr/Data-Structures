package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RopeCutting {

	public static ArrayList<Integer> ropeCutting(int arr[], int n) {
		ArrayList<Integer> result = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			int count = 0;
			int min = arr[i];
			for (int j = i; j < arr.length; j++) {
				arr[j] -= min;
				if (arr[j] != 0) {
					count++;
				}
			}
			if (count != 0) {
				result.add(count);
			}
		}
		return result;
	}

	public static void main(String args[]) {
		ArrayList<Integer> result = ropeCutting(new int[] { 5, 1, 1, 2, 3, 5 }, 6);
		for (int value : result) {
			System.out.println(value);
		}
	}

}
