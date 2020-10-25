
public class FirstTasks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, k = 0, num = 0;
        int j = 3;
        k = j / 2;
        if (j == 0 || j == 1) {
              System.out.println(j + " is not a prime number.");
        } else {
              for (i = 2; i <= k; i++) {
                   if (j % i == 0) {
                         System.out.println(j + " is not a prime number.");
                         num = 1;
                         break;
                   }
              }
              if (num == 0) {
                   System.out.println(j + " is a prime number.");
              }
        }
	}

}
