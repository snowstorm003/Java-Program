import java.util.*;
public class Add 
{
    int sum,a, b;
    Add()
    {
        sum=0;
        a=0;
        b=0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
    }
    public void addition()
    {
        sum=a;
        for(int i=1; i<=b; i++)
            sum++;
        
    }
    public void print()
    {
        System.out.println(" Sum : "+sum);
    }
}


    


