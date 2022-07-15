public class Book_3 extends Books
{
    public void input()
    {
        System.out.println(" EVERYMAN'S WAR ");
        chapters();
        pages();
        genre();
        
    }
    public void display()
    {
        System.out.println("\n EVERYMAN'S WAR ");
        System.out.println(" Number of chapters : "+ch);
        System.out.println(" Number of pages : "+pg);
        System.out.println(" Genre : "+gnre);
    }
    
}
