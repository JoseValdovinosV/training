package training;

public class Patterns {

	/*
	 FIRST PATERN
	    ****O
	    ***EE
	    **OOO
	    *EEEE
	    OOOOO 
	*/
	private static void OddEvenPatern() {
		System.out.println("\nPattern 1");
		int k = 4;
		for (int i = 1; i <= 5; i++) {
			int lastJCount = -1; // Change the value of 0 to -1 to get the correct output
			for (int j = 0; j < k; j++) {
				System.out.print("*");
				lastJCount = j;
			}

			for (int a = lastJCount + 1; a < 5; a++) {
				if (i % 2 == 0)
					System.out.print("E");
				else
					System.out.print("O");
			}
			k--;
			System.out.println("");
		}
	}

	
	/*
	 SECOND PATERN
	 	******
	 	 ****
	 	******
	 	 ****
	 	******
	*/
	public static void pattern2() {
		System.out.println("\nPattern 2");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= 5; j++) {
				if(i%2 == 0) {
					System.out.print("*");
				} else {
					if (j==0 || j == 5) 
						System.out.print(" ");
				    else 
				    	System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	
	/*
	 THIRTH PATERN
	 	OO**OO
	  	**EE**
	  	OO**OO
	  	**EE**
	  	OO**OO
	*/
	public static void pattern3() {
		System.out.println("\nPattern 3");
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j <= 5; j++) {
				if(i%2 == 0) {
					if(j==2 || j==3) 
						System.out.print("*");
					 else 
						System.out.print("O");
				} else {
					if(j==2 || j==3) 
						System.out.print("E");
					else 
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		OddEvenPatern();
		pattern2();
		pattern3();
	}//main
}//class