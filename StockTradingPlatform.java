import java.util.HashMap;
import java.util.Scanner;

class Stock {
    String name;
    double price;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Stock> market = new HashMap<>();
        market.put("TCS", new Stock("TCS", 3500));
        market.put("INFY", new Stock("INFY", 1500));

        HashMap<String, Integer> portfolio = new HashMap<>();

        while (true) {
            System.out.println("\n1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                for (Stock s : market.values())
                    System.out.println(s.name + " : ₹" + s.price);

            } else if (choice == 2) {
                System.out.print("Enter stock name: ");
                String name = sc.next();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                portfolio.put(name, portfolio.getOrDefault(name, 0) + qty);
                System.out.println("Stock bought successfully!");

            } else if (choice == 3) {
                System.out.println("Your Portfolio:");
                for (String key : portfolio.keySet())
                    System.out.println(key + " : " + portfolio.get(key) + " shares");

            } else {
                break;
            }
        }
        sc.close();
    }
}