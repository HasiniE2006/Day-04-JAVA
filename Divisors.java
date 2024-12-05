import java.util.*;
public class Divisors {
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    for(int j=0;j<t;j++)
    {
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}
    
}
