
public class FirstTasks6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] [] sumNumber = {
                 {100,88,74},
                 {99,120,45},
                 {88,33,1000},
                 };
		 
                 int sum = 0;
                 for (int i = 0; i < sumNumber.length; i++) {
                          for (int j = 0; j < sumNumber[i].length; j++)
                                   sum = sum + sumNumber[i][j];
                 }
                 System.out.println("The sum of all numbers is " + sum);
	}

}
