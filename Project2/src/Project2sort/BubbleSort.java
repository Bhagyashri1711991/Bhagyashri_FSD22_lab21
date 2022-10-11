package Project2sort;

public class BubbleSort {
	
	
	

		public void sort(int[] curr) {
			int i,j,mid;
			for(i=0;i<curr.length-1;i++)
			{
				for(j=0;j<curr.length-1-i;j++)
				{
					if(curr[j]<curr[j+1])
					{		
							mid=curr[j];
							curr[j]=curr[j+1];
							curr[j+1]=mid;
					}
				}
			}
			
		}

	}


