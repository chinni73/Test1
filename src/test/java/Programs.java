import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Programs {

	public static void main(String[] args) 
	{
//		
//		//String[] valu={"abc","xyz","abc","xyz","jio"};
//		String setval1="AutomationTesting";
//		char[] chararray=setval1.toCharArray();
//		//HashMap<String,Integer> hm=new HashMap<String,Integer>();
//		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//		
//	for(Character input:chararray)
//	{
//	           Integer count=hm.get(input);
//	          if(count == null)
//	          {
//		            hm.put(input,1);
//	          }
//	          else
//	        	  
//	
//		hm.put(input, hm.get(input)+1);
//	   }
//		
//	System.out.println(hm);
//	
//	System.out.println("-----------------------------------------------");
//	
//	//reading the duplicate strings
//	
//	             Set<Character> setval=hm.keySet();
//	             for(Character values: setval)
//	             {
//	            	 if(hm.get(values)>1)
//	            	 {
//	            		 System.out.println(values+":"+hm.get(values));
//	            	 }
//	             }
//		
//
		
	/*System.out.println("-----------------------------------------------------");	
		//find large number
		int[] num={1,10,78,07,70,90};
		int lenght=num.length;
		for(int i=0;i<lenght;i++)
		{
				if(num[0]>num[i])
					
				{
					num[0]=num[i];
				}
					
		}
		System.out.println(num[0]);
		
	System.out.println("-------------------------------------------------------------------");
	
	int[] unsortedarry={90,78,60,100,6,3,8};
	int length=unsortedarry.length;
	for(int i=0;i<lenght;i++)
	{
		for(int j=i+1;j<lenght;j++)
		{
			if(unsortedarry[i]>unsortedarry[j])
			{
				int temp=unsortedarry[i];
				unsortedarry[i]=unsortedarry[j];
				unsortedarry[j]=temp;
				
			}
		}
		
		System.out.println(unsortedarry[i]);
	}
		
		System.out.println("----------------------------------------------------");
		String[] unsort={"sony","LG","LCD","dell","pen","pencil","ODC"};
		int len=unsort.length;
		for(int i=0;i<lenght;i++)
		{
			for(int j=i+1;j<lenght;j++)
			{
				if(unsort[i].compareToIgnoreCase(unsort[j])>0)
				{
					String temp1=unsort[i];
					unsort[i]=unsort[j];
					unsort[j]=temp1;
					
				}
			}
			
			System.out.println(unsort[i]);
		}
			
		
*/	int num=1;
		
		for(int i=0;i<=5;i++)
        {
			
            for(int j=0;j<=i;j++)
            {
            	
                System.out.print(i);
                num++;
                
            }
            System.out.println();
        }
	
	
	}

}
