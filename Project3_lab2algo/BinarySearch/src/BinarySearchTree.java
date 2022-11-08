

import java.util.ArrayList;
import java.util.Scanner;



public class BinarySearchTree {
	
	
	ArrayList<Integer> nodelist = new ArrayList<>();
	private static NodeNew CreateNode(int n)
	{
		NodeNew temp = new NodeNew();
		temp.left= null;
		temp.data=n;
		temp.right= null;
		return temp;
	}
	
	private void insert(NodeNew root, NodeNew nn)
	{
		if(nn.data < root.data)
		{
			if (root.left== null)
			{
				root.left= nn;
			}
			else
			{
				insert(root.left, nn);
			}
		}
		else 
		{
			if (root.right== null)
			{
				root.right= nn;
			}
			else
			{
				insert(root.right, nn);
			}
		}
	     
	}
	
	private void traversegl(NodeNew root)
	{
		if(root!=null)
		{
			traversegl(root.left);
			nodelist.add(root.data);
			traversegl(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BinarySearchTree bst = new BinarySearchTree();
		NodeNew root = null;
		NodeNew nn = null;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter no.of nodes:");
		int a =sc.nextInt();

		for(int i=0; i<a; i++)
		{
			System.out.println("Enter Values of Node:");
			int n= sc.nextInt();
			nn= CreateNode(n);
			if(root==null)
			{
				root=nn;
			}
			else
			{
				bst.insert(root, nn);
			}
		}
		
		bst.traversegl(root);
		System.out.println(bst.nodelist);
		
		System.out.println("Enter the sum to check :");
		
		int sum= sc.nextInt();
		int flag=0;
		for(int j=0;j<bst.nodelist.size();j++)
		{
			int n1=bst.nodelist.get(j);
			int n2= sum-n1;
			if (bst.nodelist.contains(n2))
					{
				      System.out.println("Numbers found");
				      System.out.println(n1); 
				      System.out.println(n2);
				      flag=1;
				      break;
					}
			
		}
			
			if(flag==0)
			{
				System.out.println("Not found");
			}
	
		
		
		
		
		

	}

}
