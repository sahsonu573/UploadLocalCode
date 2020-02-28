package oldProg;
import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		/*	int a[]= new int [5];
	a[0]= 2;
	a[1]= 23;
	a[2]= 434;
	a[3]= 9;
	a[4]=23;

	for (int i=0; i<5; i++) {
		System.out.print(a[i] + " ");
	}

	System.out.println();
	int value []= {5,6,343,3231123,23};
	for (int i : value) {
		System.out.print(i + " ");

	}
	System.out.println(value.length);*/
		/*Random r = new Random();
	int a[]= new int[20];
	for ( int i=0; i<a.length; i++) {
		a[i]=r.nextInt(9);
	}
	System.out.println(a[0]);
	try {
			System.out.println(a[67]);	
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	for (int j : a)
		System.out.print(j+ " ");*/
		// 2D array

		int p[][]= {
				{5,6,8,0,1},
				{4,8},
				{9,7,6,0,4,4,1}
		};
		for (int i[] : p) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// 3D array
		int a[]= new int[5];
		int b[][]= new int[4][4];
		int c[][][]= new int [4][4][4];
		for (int i=0; i<4; i++) {
			for (int j=0; j<4;j++) {
				for (int k=0;k<4;k++) {
					c[i][j][k]=i+j+k;
				}
			}
		}
		for (int x [][]: c) {
			for (int y [] : x) {
				for (int z : y) {
					System.out.print(" "+z+ " ");
				}
				System.out.println();
			}
		}
	}
}
