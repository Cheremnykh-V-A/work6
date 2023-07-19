import Work3.Greeter;
import Work3.Greeter.DefaultGreeting;
import Work3.Greeter.CasualGreeting;
import Work3.Greeter.FormalGreeting;
import Work3.Greeter.IntimateGreeting;

public class Main {
    public static void main(String[] args) {
        DefaultGreeting dGreeting = new DefaultGreeting();
        CasualGreeting cGreeting = new CasualGreeting();
        FormalGreeting fGreeting = new FormalGreeting();
        IntimateGreeting iGreeting = new IntimateGreeting();


        String dString = dGreeting.greet();
        String cString = cGreeting.greet();
        String fString = fGreeting.greet();
        String iString = iGreeting.greet();

        System.out.println("-" + dString);
        System.out.println("-" + cString);
        System.out.println("-" + fString);
        System.out.println("-" + iString);

    }
}