package marvenfirst;

public class newyear extends sweets implements choco{

			public int weight_of_chocolates(int no_chocos,int w) {
				return(no_chocos*w);
			
			}

			public static void main (String[] args) {
			
				int[] array_chocolatesweight=new int[3];
				int total_gift;
				
				
				sweets kulfi=new sweets();
				choco hersheys=new newyear();
				array_chocolatesweight[0]=hersheys.weight_of_chocolates(10,6);
				total_gift=array_chocolatesweight[0]+kulfi.sweets_total_weight(10,20);
				
				System.out.println("total weight of gift_1 is:"+total_gift);
				
				sweets basundi=new sweets();
				choco munch=new newyear();
				array_chocolatesweight[1]=munch.weight_of_chocolates(10,5);
				total_gift=array_chocolatesweight[1]+basundi.sweets_total_weight(10,20);
				
		        System.out.println("total weight of gift_2 is:"+total_gift);
		        
		        sweets laddu=new sweets();
				choco dairymilk=new newyear();
				array_chocolatesweight[2]=dairymilk.weight_of_chocolates(10,4);
				total_gift=array_chocolatesweight[2]+laddu.sweets_total_weight(10,20);
				
				 System.out.println("total weight of gift_3 is:"+total_gift);
				
		        
		        for(int i=0;i<array_chocolatesweight.length;i++)
		        {
		        	for(int j=i+1;j<array_chocolatesweight.length;j++)
		        	{
		        		if(array_chocolatesweight[i]>array_chocolatesweight[j])
		        		{
		        			int temp=array_chocolatesweight[i];
		        			array_chocolatesweight[i]=array_chocolatesweight[j];
		        			array_chocolatesweight[j]=temp;
		        		}
		        	}
		        }
		        System.out.println("printing in ascending order of chocolates");
		        for(int i=0;i<array_chocolatesweight.length;i++)
		        {
		        	System.out.print(array_chocolatesweight[i]+" ");
		        }
		        System.out.println();
		        		
			}

		}