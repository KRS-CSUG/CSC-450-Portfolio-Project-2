class UpCounter implements Runnable
{
    public void run()
    {
        for (int countNumber = 0; countNumber <= 20; countNumber++)
        {
            System.out.println("Counting up: " + countNumber);
        }
    }
}

class DownCounter implements Runnable
{
    public void run()
    {
        for (int countNumber = 20; countNumber >= 0; countNumber--)
        {
            System.out.println("Counting down: " + countNumber);
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        UpCounter upCounter = new UpCounter();
        DownCounter downCounter = new DownCounter();

        upCounter.run();
        downCounter.run();
    }
}