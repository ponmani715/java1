package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num=36;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
			
			}
			if(!flag)
				System.out.println(num+" Prime");
			else
				System.out.println(num+" not Prime");
		}
		// TODO Auto-generated method stub

	}

}
