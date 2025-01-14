import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person("Aamna", "322456");
        Address address = new Address("shahdara", "Lahore", "1560");
        PharmacyShop pharmacyShop = new PharmacyShop(owner, address);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
          
            System.out.println("1-Display all medicines");
            System.out.println("2-Search  medicine");
            System.out.println("3-Sell  medicine");
            System.out.println("4-Update medicine ");
            System.out.println("5-Display total revenue");
            System.out.println("6-Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    pharmacyShop.displayAllMedicines();
                    break;
                case 2:
                    System.out.print("Enter Medicine ID to search: ");
                    String searchId = scanner.nextLine();
                    pharmacyShop.searchMedicine(searchId);
                    break;
                case 3:
                    System.out.print("Enter Medicine ID to sell: ");
                    String sellId = scanner.nextLine();
                    System.out.print("Enter quantity to sell: ");
                    int quantitySold = scanner.nextInt();
                    pharmacyShop.sellMedicine(sellId, quantitySold);
                    break;

                case 4:
                    System.out.print("Enter Medicine ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    pharmacyShop.updateMedicine(updateId, newQuantity, newPrice);
                    break;

                case 5:
                    pharmacyShop.printTotalProfit();
                    break;
                case 6:
                    System.out.println("yes");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
