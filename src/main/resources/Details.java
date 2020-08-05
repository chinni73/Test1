import java.util.ArrayList;

public class Details {

	public static void main(String[] args) 
	
	{

          Employee e1=new Employee("abc",10,20000);
          Employee e1=new Employee("xyz",30,600000);
          Employee e1=new Employee("vtu",50,220000);
          
          ArrayList<Employee> al=new ArrayList<Employee>();
          al.add(e1);
          al.add(e2);
          al.add(e3);
           
          collection.sort(al);
          
          for(Employee el:al)
          {
        	  
        	  System.out.println(el.name+"----"+el.id+"---"+el.salary);
          }
          
		
		
		

	}

}
