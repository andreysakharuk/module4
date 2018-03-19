package module4;

public class Task2 {

	public static void main(String[] args) {
		
		int k = 2;
		int[] massivA = {0,3,3,4,5,8,-22};
		int sum = 0;
		
		for (int index: massivA) {
			if (index % k == 0) {
				sum = index + sum;
			}
		}
		System.out.print("Сумма чисел кратных числу 2 = " + sum);
	}

}
