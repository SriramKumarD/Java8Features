package JavaQuestions;

public class ExceptionHandling {

	public static void main(String[] args) throws CustomException {
		String name = "Sriram";
		try {
			if("Sriram".equalsIgnoreCase(name)) {
				throw new CustomException("Not a valid person to access the data...");
			}
		}
		catch(CustomException e) {
			throw e;
		}
	}
}
class CustomException extends Exception {
	public CustomException(String errorMessage) {  
	    super(errorMessage);  
	}  
	
}
