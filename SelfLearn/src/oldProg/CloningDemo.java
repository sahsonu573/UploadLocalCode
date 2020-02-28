package oldProg;

public class CloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		TestShallowDeepClone obj = new TestShallowDeepClone();
		obj.i=5;
		obj.j=8;
	//	TestShallowDeepClone obj1 = obj ;	//	For Shallow copy of object we don't need to create the object.
											//	As we are not refering to new object hence even we are updating the value of j in obj1 is is updating in obj as well.
		/*Deep Copy of object
		 * TestShallowDeepClone obj1 = new TestShallowDeepClone();
		obj1.i=obj.i;
		obj1.j= obj.j;*/
		
		TestShallowDeepClone obj1= (TestShallowDeepClone) obj.clone();
		//obj1.j =6;
		System.out.println(obj);
		System.out.println(obj1);
	}
}

class TestShallowDeepClone extends Object {
	int i;
	int j;
	@Override
	public String toString() {
		return "TestShallow [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}