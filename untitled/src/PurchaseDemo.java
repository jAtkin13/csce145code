public class PurchaseDemo {
    Purchase pc1 = new Purchase();
    Purchase pc2 = new Purchase();
    Purchase pc3 = new Purchase();

    public static void main(String[] args) {
        System.out.println("The total cost of the second object is $" + pc2.totalCost());

        Purchase pc4 = new Purchase("Headphones", 50, 3);

        System.out.println("The total cost of the fourth object is $" + pc4.totalCost());
        System.out.println("Updated Total Cost for 4 units: $" + pc4.totalCost(4));
        System.out.println("Updated the second time: \nTotal Cost is $" + pc4.totalCost(5, 55));

    }
}
