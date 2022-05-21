import java.util.Scanner;

public class fibonacci 
{
    int n;
    fibonacci() 
    {
        n = 0;
    }

    void accept() 
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i == 0) 
        {
            System.out.print(" Enter number : ");
            n = sc.nextInt();

            if (n <= 0)
                System.out.println(" Invalid Input!!!!!");
            else
                i = 1;
        }

        sc.close();
    }

    void fibo() 
    {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(" " + a);
            c = a + b;
            a = b;
            b = c;

        }

    }

    public static void main(String args[]) 
    {
        fibonacci ob = new fibonacci();
        ob.accept();
        ob.fibo();

    }

}
