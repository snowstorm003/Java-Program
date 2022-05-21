import java.util.Scanner;

public class sumbetween 
{
    int m, n, s;

    sumbetween() 
    {
        m = 0;
        n = 0;
        s = 0;
    }

    void accept() 
    {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        while (i == 1) 
        {
            System.out.print(" Enter 1st number : ");
            m = sc.nextInt();
            System.out.print(" Enter 2nd number : ");
            n = sc.nextInt();

            if (Math.abs(m - n) < 2)
                System.out.println(" Invalid Input!!!!!");
            else
                i = 0;
        }

        if (m > n) 
        {
            int temp = m;
            m = n;
            n = temp;

        }

        sc.close();

    }

    void sum() 
    {
        m++;

        for (int i = m; i < n; i++)
            s = s + i;

    }

    void print() 
    {
        System.out.println((" Sum : " + s));
    }

    public static void main(String args[]) 
    {
        sumbetween ob = new sumbetween();

        ob.accept();
        ob.sum();
        ob.print();

    }
}
