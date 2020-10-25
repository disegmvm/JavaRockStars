
public class FirstTasks4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maximum and minimum number in the array?
				
				 int maximumArray[] = {99999,11,12,13,-456876,25,62,34,54,100,76,87,10,54};
				 int minimum = maximumArray[0];
				 int maximum = maximumArray[0];
				 for(int i = 1; i<maximumArray.length; i++) {
					 
					 if (maximumArray[i] < minimum) minimum = maximumArray[i];
					 if (maximumArray[i] > maximum) maximum = maximumArray[i];
					 
					
				 }
					System.out.println("The mininum value in the Array is: "+minimum);
					System.out.println("The maximum value in the Array is: "+maximum);
					}
				}
	


