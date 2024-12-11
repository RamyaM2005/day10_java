public class Method_Overloading 
{
    static void a()
    {
        System.out.println("Hello");
    }
    static void a(int b)
    {
        System.out.println("Hello"+b);
    }
    static void a(int b,String c)
    {
        System.out.println("hello"+" "+b+" "+c);
    }
    public static void main(String args[])
    {
        a();
        a(7);
        a(4,"Morning");
    }
}
