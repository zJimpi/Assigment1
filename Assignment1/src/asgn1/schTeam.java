package asgn1;
import java.util.Scanner;

public class schTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("enter roll number: ");
        int roll=sc.nextInt();
        String team="none";
        sc.close();
        int n= roll % 4;
        if ( n==0)
            team="emrald";
        if ( n==1)
            team="shapire";
        if ( n==2)
            team="pearl";
        if ( n==3)
            team="ruby";
		
        System.out.println("team: "+team);

	}

}
