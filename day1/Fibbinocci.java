package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0, secNum=1, sum = 0;
		System.out.println(firstNum +"  "+ secNum);
		for (int n=2; n<11; n++)
		{
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}

	}

}
