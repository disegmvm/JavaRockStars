
public class FirstTasks5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest = 0;
		int secondLargest = 0;
		int[] array = { 99999, 999, 50999, 999, -1, 80, 20, 56, };
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println("The 2nd Largest number is: " + secondLargest);
	}

}
