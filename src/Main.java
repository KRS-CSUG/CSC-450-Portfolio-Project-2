public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread upThread = new Thread(() ->
        {
            for (int countNumber = 0; countNumber <= 20; countNumber++)
            {
                System.out.println("Counting up: " + countNumber);
            }
        });

        Thread downThread = new Thread(() ->
        {
            for (int countNumber = 20; countNumber >= 0; countNumber--)
            {
                System.out.println("Counting down: " + countNumber);
            }
        });

        upThread.start();
        upThread.join();
        downThread.start();
        downThread.join();
    }
}