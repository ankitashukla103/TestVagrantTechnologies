package ExpensesSystem;

public class TypeofMode {
	
	public int n;
	
	public void TypeofMode(int n)
	{
		this.n = n;
	}
	
	public int typeofMode()
	{
		System.out.println("1. Same newspaper throughout month");
		System.out.println("2. Different newspaper throughout month");
		
		System.out.println("Enter your type of newspaper selection mode - " + n);
		
		switch (n) {
		  case 1:
		    
		    break;
		  case 2:
		    
		    break;		  
		}
		return 0;
	}

}
