package Association;

public class Aggregation_MainClass {
    public static void main(String arg[])
    {
        Bank bank = new Bank("OOPS", 12345);
        Customer customer = new Customer("Ram", 123456789, 100000);
        bank.displayAllDetails(customer);
    }
}
