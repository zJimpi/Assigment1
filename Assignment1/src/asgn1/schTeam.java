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
        int s=1,p=2,r=3,e=4;
        for(s=1;s<=roll;s+=4)
        {
            if(s==roll)
            {
                team="Sapphire";
            }
        }
        for(p=2;p<=roll;p+=4)
        {
            if(p==roll)
            {
                team="Pearl";
            }
        }
        for(r=3;r<=roll;r+=4)
        {
            if(r==roll)
            {
                team="Ruby";
            }
        }
        for(e=4;e<=roll;e+=4)
        {
            if(e==roll)
            {
                team="Emerald";
            }
        }
        
        System.out.println("team: "+team);
        

	}

}
