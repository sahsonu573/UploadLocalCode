package expection;


public class DemoCustomException {
	public static void main(String[] args) {

		try {
			int i = 3;
			String str;
			if (i<9) {
				//throw new Exception();	Default exception
				throw new CustomException("Error i value is less than 9 ");
			}
		}
		catch (CustomException e) {
			System.out.println(e);
		}

	}
}

class CustomException extends Exception{
	CustomException(String ErrorMessage){
		super(ErrorMessage);
	}
}