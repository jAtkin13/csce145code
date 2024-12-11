public class Purchase {
    private int itemQuantity;
    private double itemPrice;

    public String toString(){
        return "Quantity: " + this.itemQuantity + " Price: " + this.itemPrice;
    }

    public double totalCost(){
        return this.itemPrice*this.itemQuantity;
    }

    //method overloading (allows multiple here)
    public double totalCost(int xCount){
        return this.itemPrice*xCount;
    }

    public double totalCost(int xCount, double xPrice){
        return xPrice*xCount;
    }
}

