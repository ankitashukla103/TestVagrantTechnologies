package ExpensesSystem;

enum TypeofExpenses {
	  Daily,
	  Monthly,
	  Yearly
	}  

public class TypeofWays {
	
		TypeofExpenses expenses; 
		
		public TypeofWays(TypeofExpenses expenses) 
	    { 
	        this.expenses = expenses; 
	    } 
	  
	public void expenseWays()
	{	   
		TypeofExpenses expense = TypeofExpenses.Monthly;
	   
		   switch(expense) {
		      case Daily:
		        System.out.println("Total daily expenses are - ");
		        break;
		      case Monthly:
		         System.out.println("Total monthly expenses are - ");
		        break;
		      case Yearly:
		        System.out.println("Total yearly expenses are - ");
		        break;
		    }
	    }
	}  
	  
	
