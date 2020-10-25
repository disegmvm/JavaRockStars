
public class FirstTasks9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Create an array of countries: north america countries, 
//south america countries, europe countries, asian countries, african countries.
	//Then print all values from that array using 2 different loops 
//and calculate how many total countries been stored
				String [][] contries={
						{"USA","Canada","Mexico"},
						{"Argentina","Brasil","Peru"},
						{"France","England","Russia"},
						{"Korea","Japan","Kazakhstan"},
						{"Egypt","Nigeria","Morocco"}
					};
				int sum=0;
				System.out.println("****2D Array 1 way*****");
				System.out.println();
				for(String[] loop:contries) {
					for (String lo:loop) {
						System.out.print(lo+"   ");
					}System.out.println();
				}		
				System.out.println("****2D Array 2 way*****");
				System.out.println();
				for (int i=0;i<contries.length;i++) {
					
					for (int j=0;j<contries[i].length;j++) {				
						
						System.out.print(contries[i][j]+"  ");
						sum++;
				}System.out.println();
				}System.out.println("Contries "+sum);
	}

}
