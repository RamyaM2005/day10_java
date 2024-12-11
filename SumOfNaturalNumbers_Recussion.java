public class SumOfNaturalNumbers_Recussion 
{
    int sum(int n)
    {
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String args[])
    {
        SumOfNaturalNumbers_Recussion ob=new SumOfNaturalNumbers_Recussion();
        int res=ob.sum(10);
        System.out.println(res);
    }
}
