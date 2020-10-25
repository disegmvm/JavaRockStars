
public class FirstTasks4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maximum and minimum number in the array?
				
				 int maximumArray[] = {8,11,12,13,1,25,62,34,54,100,76,87,10,54};
				 int minimum = maximumArray[0];
				 int maximum = maximumArray[0];
				 for(int i = 0; i<13; i++) {
					 
					 if (maximumArray[i] < minimum) minimum = maximumArray[i];
					 if (maximumArray[i] > maximum) maximum = maximumArray[i];
					 
					
				 }
					System.out.println("The mininum value in the Array is: "+minimum);
					System.out.println("The maximum value in the Array is: "+maximum);
					}
				}
	


