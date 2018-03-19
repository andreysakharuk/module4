package module4;

public class Task3 {

	public static void main(String[] args) {
		
		double[] massiv1 = {1.2, 9.3, 30.4, 33.4, 49.4};
		double[] massiv2 = {9.3, 8.2, 30.6, 33.5, 49.6};
		double[] massiv3 = {1.8, 8.8, 30.2, 33.2, 31.2};
		
		for (int i = 0; i < (massiv1.length - 1); i++) {
			if (massiv1[i] < massiv1[i+1]) {
				System.out.println(massiv1[i] + " меньше " + massiv1[i+1] + " ");
				System.out.println(" - Последовательность возрастающая ");
			} else {
				System.out.println(massiv1[i] + " не меньше " + massiv1[i+1] + " ");
				System.out.println(" - Последовательность не возрастающая ");
				break;
			}	
		}
	}
}
