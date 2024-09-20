public class Main
{
    public static void main(String[] args)
    {
        Feeder g = new Feeder(500);
        g.simulateOneDay(12);
        System.out.println("First Feeder: " + g.getCurrentFood());

        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println("Second Feeder " + i);

        Feeder a = new Feeder(1500);
        System.out.println("Days: " + a.simulateManyDays(11, 5));
        System.out.println("Third Feeder " + a);
    }
}
