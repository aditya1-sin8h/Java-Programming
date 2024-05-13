public class thread
{
    public static void main(String[] args)
    {
        for(int i=1;i<=20;i++)
        {
            Thread th=new Thread();
            System.out.println("Thread id for "+i+"th thread is: "+th.getId());
        }
    }
}