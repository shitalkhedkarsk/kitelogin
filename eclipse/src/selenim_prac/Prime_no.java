package selenim_prac;

public class Prime_no {

	public static void main(String[] args) {
		//prime no /by 1 and itself
		int a=89;
		int counter=0;
		for(int i=2;i<a;i++)
		{
			 if(a%i==0)
			
			{
				counter++;
				//System.out.println(counter);
				break;
			}
		}
		if(counter==1)
			{
				System.out.println(a +" not  prime no");	
			}
			 else
			{
				System.out.println(a+" prime no");
			}
		

		

	}

}
