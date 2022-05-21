import java.util.*;
public class table 
{
    int n, i;
    table()
    {
        n=0;
        i=0;
    }

    int accept()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter number : ");
        n=sc.nextInt();

        sc.close();
        return n;
    }

    void multiply(int num)
    {
        for(i=1; i<=10; i++)
            System.out.println(" "+num+"X"+i+"="+(num*i));
    }
    public static void main(String args[])
    {
        table ob = new table();
        ob.multiply(ob.accept());
    }
}
