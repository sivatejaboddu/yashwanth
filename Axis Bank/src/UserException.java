	import java.util.Scanner;

public class UserException extends Exception
{
	

	public UserException(String string)
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("enter the alphanumeric value");
			String val=sc.nextLine();
			//UserException e;
			try {
				if (val.length() != 10) 
				{
					try 
					{
						throw new UserException("valsue should be 10 digit alpha numeric");
					} 
					catch (UserException e)
					{
						e.printStackTrace();
					}
					
				} 
				else 
				{
					System.out.println(val);
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}
			  finally
				{
					System.out.println("iam final block....");
				}
		}
		
	
	}

}
