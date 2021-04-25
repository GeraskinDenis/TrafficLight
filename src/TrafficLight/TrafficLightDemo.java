package TrafficLight;

public class TrafficLightDemo
{
    public static void main(String[] args)
    {
        TrafficLightSimulator tl = new TrafficLightSimulator();
        Thread thread1 = new Thread(tl);
        thread1.start();
        for (int i = 0; i < 9; i++)
        {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
