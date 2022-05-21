import java.util.Scanner;

public class fibonacci 
{
    int n, i, a, b, c;

    fibonacci() 
    {
        n = 0;
        a = 0;
        b = 0;
        c = 0;
        i = 0;
    }

    int accept() 
    {
        Scanner sc = new Scanner(System.in);
        while (i == 0) 
        {
            System.out.print(" Enter number : ");
            n = sc.nextInt();

            if (n <= 0) 
            {
                System.out.println(" Invalid Input!!!!!");
                i = 0;
            } else
                i = 1;
        }

        sc.close();
        return n;
    }

    void fibo(int num) 
    {
        b = 1;
        for (i = 1; i <= num; i++) 
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
        ob.fibo(ob.accept());

    }

}
