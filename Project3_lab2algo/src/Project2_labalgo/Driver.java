package Project2_labalgo;
import java.util.Scanner;
public class Driver {
	

	
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);					
		System.out.println("Enter No.of transactions:");	
		int size=sc.nextInt();
		System.out.println("Enter Transactions:");
		int transact[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			
			transact[i]=sc.nextInt();
		}

		System.out.println("Enter Number of test cases");
		int test=sc.nextInt();
		int target;
		int j,total,flag;
		for(int i=1;i<=test;i++)
		{
			total=0;
			flag=0;
			System.out.println("Enter the Target Amount of " + i + "case");  
			target=sc.nextInt();
			for(j=0;j<transact.length;j++)
			{
				total=total+transact[j];
				if(total>=target)
				{
					System.out.println("Target is completed on "+ ++j + "day" );
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.println("Target is not fulfilled" );
		}
		}
	}
	

