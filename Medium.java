import java.util.*;
    public class Medium
    {
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if(a>b)
            {
              if(b>c)
               System.out.println(b);
               else if(a>c)
               System.out.println(c);
               else
               System.out.println(a);
            }
            else{
                if(a>c)
                System.out.println(a);
                else if(b>c)
                System.out.println(c);
                else
                System.out.println(b);
            }
        
        }
    }

    