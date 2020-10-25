
public class FirstTasks7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbersTable = { { 54, 27, -75, 0, }, 
				{ 154, 9999, -228, 1000, }, 
				{ 87553, -5, 5000, 10154, }, };
		System.out.println("Original 2D array with numbers:");
		for (int origLine[] : numbersTable) {
			for (int origNumber : origLine) {
				System.out.print(origNumber + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("2D array with even numbers only:");
		for (int evenNumLine[] : numbersTable) {
			for (int evenNum : evenNumLine) {
				if (evenNum % 2 == 0) {
					System.out.print(evenNum + " ");
				}
			}
			System.out.println();
		}
	}

}
