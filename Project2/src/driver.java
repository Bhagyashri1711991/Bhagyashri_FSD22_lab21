
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import Project2counting.NotesCount;
import Project2sort.BubbleSort;




public class driver {

                public static void main(String[] args) {
				Scanner sc=new Scanner(System.in); 
				System.out.println("Kindly Enter Number of Currency Notes in your Country :");
				
				int size=sc.nextInt();
				
				int curr[]=new int[size];
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter the Currency Denomination: "+i);
					curr[i]=sc.nextInt();
				}
			
				BubbleSort bs=new BubbleSort();
				bs.sort(curr);
		     //	System.out.println("AF" +Arrays.toString(curr));
				
				
				System.out.println("Please Enter the amount you want to pay:"  );
				int payment=sc.nextInt();
				
				NotesCount nc=new NotesCount();
				nc.counting(curr,payment);

			}

		
		// TODO Auto-generated method stub

	}


