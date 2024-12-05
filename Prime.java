import java.util.*;
public class Prime {
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=0;
    for(int i=1;i*i<=n;++i)
    {
        if((n%i)==0)
        {
            c+=1;
            if((i*i)!=n)
            {
                c+=1;
            }
        }
    }
    System.out.println((c==2)?"prime":"not prime");
    
}
    
}
