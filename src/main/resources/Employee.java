
public class Employee implements Comparable<Employee>
{
      int id,salary;
      String name;
      
      Emplyoee(String name,int id,int salary)
      {
    	  this.name=name;
    	  this.id=id;
    	  this.salary=salary;
    	
      }
      
     public int CompareTo(Employee el)
     {
    	 if(id==el.id)
    	 {
    		 return 0;
    	 }
    	 else if(id>el.id)
    	 {
    		 return 1;
    	 }else
    	 {
    		 return -1;
    	 }
    	 
     }	
	
}
