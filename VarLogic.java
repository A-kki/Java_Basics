import static java.lang.System.out;
class Data
{
           void set(int...ar)
	{
             System.out.println("elements are");
             for(int data:ar)
		{
              		System.out.println(data);
                }
		int EVEN = 0;
		int ODD =0;
		for(int data:ar)
		{
       			if(data%2==0)
			{
                		EVEN++;
                	}
                	else
			{
                 		ODD++;
   			} 
		}
	    System.out.println("even elements are "+EVEN+ "\n odd elements are "+ODD) ;          
	}
}

class VarLogic
{
         static public void main(String[] args)
	{
        	Data ref=new Data();
                ref.set(10,3,4,5,6,7);
        }

}