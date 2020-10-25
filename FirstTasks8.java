
public class FirstTasks8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] number={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
			int sum=0;
			System.out.println("****2D Array*****");
			for(int[] original:number) {
				for (int orig:original) {
					System.out.print(orig+" ");
				}System.out.println();
			}				
			System.out.println("****2D Array Odd number*****");
			for (int i=0;i<number.length;i++) {
				
				for (int j=0;j<number[i].length;j++) {				
					
					if ((number[i][j]%2)!=0) {
					     System.out.print(number[i][j]+"  ");
					     sum=sum+number[i][j];
				}
				
			}System.out.println();
			
			}System.out.println("Sum of all odd numbers "+sum);
	}

}
