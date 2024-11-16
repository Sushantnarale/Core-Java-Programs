package corePrograms;

public class Bottle
{
    public static void main(String[] args)
    {
            new Bottle().water();
    }
    public void water()
    {    int i = 5;
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                for(int j = 0; j <= i; j++)
                {
                    System.out.print(j + " ");
                }
            }
        });
        t.start();
    }
}
