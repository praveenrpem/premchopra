package Insta;
import java.util.Scanner;
public class Dec_To_Bin {
	  static void pra()
	    {
	
	        int dec_num, quot, i=1, j;
	        int bin_num[] = new int[100];
	        Scanner sc = new Scanner(System.in);
			
	       System.out.print("Input a Decimal Number : ");
	       
	        dec_num = sc.nextInt();
			
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            bin_num[i++] = quot%2;
	            quot = quot/2;
	        }
			
	        System.out.print("Binary number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(bin_num[j]);
	        }
	        System.out.print("\n");
	        
	     pra();
	       System.out.print("\n");
	    }
	 public static void main(String args[] )
	 {
		 System.out.println("Execution ::");
		 pra();
	 }
	        
	    }
	    
