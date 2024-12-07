import java.util.*;
public class Reversenaturalnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        while(i>-1)
        {
            System.out.println(i);
            i-=1;
        }
    }
}
