package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5, count=0;
		if (num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0) 

					count++;
			}
			if(count==2)
			{
				System.out.println("Number is Prime Number");
			}
			else
			{
				System.out.println("Number is not Prime Number");
			}
		}
		else
		{
			System.out.println("Number is not Prime Number");
		}

	}

}
