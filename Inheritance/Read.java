public class Read 
{
    public static void main(String args[])
    {
        Book_1 ob1 = new Book_1();
        Book_2 ob2 = new Book_2();
        Book_3 ob3 = new Book_3();

        ob1.input();
        ob2.input();
        ob3.input();
        
        ob1.display();
        ob2.display();
        ob3.display();
    }

}
