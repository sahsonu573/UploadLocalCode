package oldProg;
public class LoopClass {

	public static void main(String[] args) {
		/*// While Loop 
while (i<10) {
	System.out.println(i);
	i++;
}*/
		/*	// Do While Loop
int i = 8;
do {
	System.out.println(i);
	i++;
}	while (i<10);
		 */

		// for loop
		/*for (int i= 1; i<10; i++) {
	System.out.println(i);
}*/
		// aski number
		/*for (int i=0; i<127;i++) {
	System.out.printf("%d : %c \n",i,i);
}*/
		// pattern loop
		// * scenario
		/*for (int i =1; i<=4; i++) {
	for (int j = 1; j<=4; j++) {
		if (i==1 || i== 4 || j==1 || j==4) {
		System.out.print("*");
		}
		else {
			System.out.print(" ");
			}
	}
	System.out.println();
}*/
		/* number pattern
		 1 2 3 4
		 2 3 4 1
		 3 4 1 2
		 4 1 2 3
		 */
/*
		for (int i = 1; i<=4;i++) {
			for (int j = 1; j<=4; j++) {
				int k = i+j-1;
				if (k>4)
					System.out.print(k-4 + " ");
				else 
					System.out.print(k + " ");
			}
			System.out.println();
		}*/
		/*
		 number format
		 1
		 0 1
		 1 0 1
		 0 1 0 1
		 1 0 1 0 1
		 */
		/*for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				if ((i+j)%2==0) {
					System.out.print("0 ");
				}
				else
					System.out.print("1 ");
				
			}
			System.out.println();
		}*/
		/*
		 number format
		 1
		 2 2
		 3 3 3
		 4 4 4 4
		 5 5 5 5 5
		 */
		/*for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for(int i=6; i<=9; i++) {
			for (int j=9; j>=i; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		// or
		System.out.println("======================Same pattern in different way========================");
		for (int i=1; i<=9;i++) {
			for (int j=1; j<=i; j++ ) {
				if(i+j>10) {
					break;
				}
					
				System.out.print(i + " ");
			}
			System.out.println();
		}*/
		/*
		 * another pattern
		        1 
              2 2 
            3 3 3 
          4 4 4 4 
        5 5 5 5 5 
      6 6 6 6 6 6 
    7 7 7 7 7 7 7 
  8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9
		 */
		for (int i=1; i<=8; i++) {
			for (int k=7; k>=i;k--) {
				System.out.print("  "); // Double sapce
			}
			for(int j=1; j<=i; j++) {
				
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		/*
		 * another pattern
		1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9
		 */
		for (int i=1; i<=9; i++) {
			for (int k=8; k>=i;k--) {
				System.out.print(" "); // Single sapce
			}
			for(int j=1; j<=i; j++) {
				
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
