import java.util.*;

public class sumbetween 
{
    int N, s, i;

    sumbetween() 
    {
        N = 0;
        s = 0;
        i = 0;
    }

    int accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter number : ");
        N = sc.nextInt();

        sc.close();
        return N;

    }

    int sum(int a, int b)
    {
        a++;
        for(i=a; i<b; i++)
        {
            s=s+i;
        }
        return s;

    }

    void print(int result)
    {
        System.out.println((" Sum : "+s));
    }

    public static void main(String args[]) 
    {
        sumbetween ob = new sumbetween();
        sumbetween ob1 = new sumbetween();
        sumbetween ob2 = new sumbetween();

        int a=ob1.accept();
        int b=ob2.accept();

        ob.print(ob.sum(a,b));

    }
}
