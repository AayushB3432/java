 public class fibonacci
{
    public static void main(String[]args)
    {
        int a=1;
        int b=2;
        int c;
        int count=20;
        for(int i=0;i<=count;i++)
        {
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }

}
