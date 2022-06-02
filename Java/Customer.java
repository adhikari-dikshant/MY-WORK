public class Customer {
    public static void main(String[] args) {
        String customerType = "Regular";
        int quantity = 2;
        int unitPrice = 10;
        int discount = 5;
        int totalCost;
        totalCost = unitPrice * quantity;
        if (customerType == "Regular") {
            totalCost = totalCost - ((totalCost * discount) / 100);
            System.out.println("you're a regular customer");
        }
        System.out.println("bill: " + totalCost);
    }
}
