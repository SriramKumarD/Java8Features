package java8features;

public class ExceptionCheck 
{
	
	public static Integer check() 
	{
		try {
			
			return 1;
		}
		catch(Exception e) {
			return 2;
		}
		
		finally {
			return 3;
		}
	}

	public static void main(String[] args) {
	
		System.out.println(ExceptionCheck.check());
	}

}
