public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Smartphone", 150, 25000));
        inventory.addProduct(new Product(102, "Tablet", 80, 18000));
        inventory.addProduct(new Product(103, "Monitor", 50, 12000));
        inventory.addProduct(new Product(104, "Printer", 30, 9000));
        inventory.addProduct(new Product(105, "Headphones", 200, 2500));

        System.out.println("Initial Inventory:");
        inventory.displayProduct();

        System.out.println("\nAfter Updating Product:");
        inventory.updateProduct(
                new Product(105, "Wireless Headphones", 180, 3000)
        );
        inventory.displayProduct();

        System.out.println("\nAfter Removing Product:");
        inventory.removeProduct(104);
        inventory.displayProduct();
    }
}