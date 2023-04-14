package asgn1;
import java.util.Scanner;

public class eleBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter unit: ");
        double unit=s.nextInt();
        double charge=0;
        
        if(unit<=100)
        {
            charge = 1.20 * unit;
        }
        else if(unit>100 && unit <=300)
        {
            charge = 2 * unit; 
        }
        else{
            charge = 3 * unit;
        }
        System.out.println("charge= "+charge);
        s.close();
	}

}
