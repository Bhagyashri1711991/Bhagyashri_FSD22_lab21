package Project2counting;

public class NotesCount {
	
	
	

		public void counting(int[] curr, int amount) {
			int qty[]=new int[curr.length];
			int i;
			int sum=0;
			for(i=0;i<curr.length;i++)
			{
				qty[i]=amount/curr[i];
				sum=sum+qty[i];
				amount=amount%curr[i];
			}
			for(i=0;i<curr.length;i++)
			{
				if(qty[i]!=0)
				System.out.println( curr[i] +  "X"  + qty[i]+  "\n");
			}
			System.out.println("Total Number of Notes: "  + sum);
			
			
		}

	}

