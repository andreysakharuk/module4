package module4;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		int[] massiv = {0, 2, 32, 0, 32, 9, 0, 4, 0 };
		ArrayList<Integer> arrayOfIndexes = new ArrayList<Integer>();
		int indexOfArray = 0;

		for (int i = 0; i < massiv.length; i++) {
			if (massiv[i] == 0) {
				arrayOfIndexes.add(indexOfArray, i);
				indexOfArray = indexOfArray + 1;
			}
		}

		System.out.println("Номера элеменов massiv, в которых храниться 0");

		for (int j : arrayOfIndexes) {
			System.out.println(j);
		}
	}
}