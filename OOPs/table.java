import java.util.*;
public class table 
{
    int n;
    table()
    {
        n=0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter number : ");
        n=sc.nextInt();

        sc.close();
    }

    void multiply()
    {
        for(int i=1; i<=10; i++)
            System.out.println(" "+n+"X"+i+"="+(n*i));
    }
    public static void main(String args[])
    {
        table ob = new table();
        ob.accept();
        ob.multiply();
    }
}
