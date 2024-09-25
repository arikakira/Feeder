public class Main
{
    public static void main(String[] args)
    {
        Feeder g = new Feeder(500);
        g.simulateOneDay(12);
        System.out.println("First One Day Feeder Current Food: " + g.getCurrentFood());

        Feeder i = new Feeder(1000);
        i.simulateOneDay(22);
        System.out.println("Second One Day Feeder " + i);

        Feeder o = new Feeder(100);
        o.simulateOneDay(5);
        System.out.println("Third One Day Feeder " + o);

        System.out.println();

        Feeder a = new Feeder(2400);
        System.out.println("Days: " + a.simulateManyDays(10, 4));
        System.out.println("First Multi-Day Feeder " + a);

        Feeder c = new Feeder(250);
        System.out.println("Days: " + c.simulateManyDays(10, 5));
        System.out.println("Second Multi-Day Feeder " + c);

        Feeder s = new Feeder(0);
        System.out.println("Days: " + s.simulateManyDays(5, 10));
        System.out.println("Third Multi-Day Feeder " + s);
    }
}
