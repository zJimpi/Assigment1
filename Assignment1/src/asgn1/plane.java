package asgn1;
import java.util.Scanner;

public class plane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int row=sc.nextInt();
        int sum=0,pass=0;
        for(int i=1;i<=row;i++)
        {
            System.out.print("enter number of passenger in row no "+i+": ");
            pass=sc.nextInt();
            sum=sum+pass;
        }
        
        System.out.println("no of passengers = "+sum);
        sc.close();
	}

}
