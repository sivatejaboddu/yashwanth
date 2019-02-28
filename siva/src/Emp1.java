
public class Emp1 
{
	int eno;
	String ename;
	float sal;

	
	public Emp1()
	{
		System.out.println("i am a default Constructor");
	}
	
	public Emp1(int eno,String ename)
	{
		
		this.eno=eno;
		this.ename=ename;
		
	}
	
	
		public Emp1(int eno,String ename,float f)
		{
			this(200,"ram");
			this.eno=eno;
			this.ename=ename;
			this.sal=sal;
			
			System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
	
		}

	public static void main(String[] args) {
		Emp1 e1=new Emp1(100,"siva",200000.00f);
	}

}
