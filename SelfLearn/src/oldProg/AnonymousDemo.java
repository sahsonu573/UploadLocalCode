package oldProg;
public class AnonymousDemo {

	public static void main(String[] args) {
		/*AnoyOne a= new AnoyOne();
		a.oneM();*/
		// Just to do one thing why to create obj, As it will create memory in stack and give reference in the heap memory.
		// 1000 line of code and assume the above code is there in line 20-21 then laster we are not using that obj ref. So instead of simply
		// creating obj ; use anonymous object which will do the work and will get removed by the garbage collection in heap memory.
		
		new AnoyOne().oneM();   		// Anonymous object creation
	}

}

class AnoyOne{
	int i =7;
	public void oneM() {
		System.out.println(i);
	}
}
