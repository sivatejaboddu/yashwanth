
public class ChildSuper extends Employee
{
	
	int x;
	

	public ChildSuper(int x)
	{
		super(2,"abc",12.12f);
		this.x=x;
		System.out.println(this.x);
	}//Constructors calls through class object


	public static void main(String[] args) {

		ChildSuper obj=new ChildSuper(1);
		System.out.println(obj.x);
		
		//here Employee class default constructor calls with child class constuctor
		
	}

}
