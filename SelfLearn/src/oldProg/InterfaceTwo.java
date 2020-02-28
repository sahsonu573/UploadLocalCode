package oldProg;
 interface Interface2 {
	default void show () {
System.out.println("2nd Interface");
	}
	
}


 interface Interface3 {
	default void show () {
System.out.println("3rd Interface");
	}
}
 
 /*interface Interface4 {
		default boolean equals (Object obj) { 			// Can't modify the already defined Object class
return true;
		}
	}*/
 
 interface Interface4 {
	 static void display() {
			System.out.println("static method in interface");
		}
 }