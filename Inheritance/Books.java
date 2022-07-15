import java.util.*;

public class Books 
{
    int ch, pg; String gnre;
    Books()
    {
        ch=0;
        pg=0;
        gnre="";
    }

    public void chapters() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of chapters : ");
        ch = sc.nextInt();
        sc.close();
    }

    public void pages()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of pages : ");
        pg = sc.nextInt();
        sc.close();
    }

    public void genre() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the genre of the book : ");
        sc.nextLine();
        gnre = sc.nextLine();
        sc.close();
    }
}
