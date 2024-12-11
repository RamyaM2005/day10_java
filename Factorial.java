public class Factorial 
{
    int sum(int n)
    {
        if(n==0) return 1;
        return n*sum(n-1);
    }
    public static void main(String args[])
    {
        Factorial ob=new Factorial();
        int res=ob.sum(5);
        System.out.println(res);
    }
}
