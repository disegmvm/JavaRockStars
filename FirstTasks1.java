
public class FirstTasks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] sArray = { { "Ocean", "Lake", "Sea", }, 
				{ "Town", "Village", "Country", },
				{ "Horse", "Bear", "Whale", }, };
		System.out.println("Tables before swaps:");
		System.out.println();
		int[][] iArray = { { 54, 127, 9500, }, 
				{ -27000, 1444, 8, }, 
				{ 34634, -62356, 0, }, };
		// Printing original numbers table
		for (int aiArray[] : iArray) {
			for (int biArray : aiArray) {
				System.out.print(biArray + " ");
			}
			System.out.println();
		}
		System.out.println();
		// Printing original strings table
		for (String asArray[] : sArray) {
			for (String bsArray : asArray) {
				System.out.print(bsArray + " ");
			}
			System.out.println();
		}
		iArray[0][0] = iArray[0][0] + iArray[2][1];
		iArray[2][1] = iArray[0][0] - iArray[2][1];
		iArray[0][0] = iArray[0][0] - iArray[2][1];
		System.out.println("________________________________________________");
		System.out.println("Tables after swaps:");
		System.out.println("");
		// Printing numbers table after swapping
		for (int line[] : iArray) {
			for (int num : line) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
		sArray[0][1] = sArray[0][1] + sArray[2][1];
		sArray[2][1] = sArray[0][1].substring(0, sArray[0][1].length() - sArray[2][1].length());
		sArray[0][1] = sArray[0][1].substring(sArray[2][1].length());
		// Printing strings table after swapping
		for (String strLine[] : sArray) {
			for (String word : strLine) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
	}
}