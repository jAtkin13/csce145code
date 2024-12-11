//Jack Atkinson

public class Apple {

    //instance vars
    private String type;
    private double weight;
    private double price;

    //default constructor
    public Apple(){
        this.type = "Gala";
        this.weight = 0.5;
        this.price = 0.88;
    }

    //parameterized constructor
    public Apple(String type, double weight, double price){
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    //getters
    public String getType() {
        return this.type;
    }
    public double getWeight() {
        return this.weight;
    }
    public double getPrice() {
        return this.price;
    }

    //setters
    public void setType(String xType) {
        if (xType.equalsIgnoreCase("Red Delicious")
        || xType.equalsIgnoreCase("Golden Delicious")
        || xType.equalsIgnoreCase("Gala")
        || xType.equalsIgnoreCase("GrannySmith")) {
            this.type = xType;
        } else {
            System.out.println("Invalid type.");
        }
    }

    public void setWeight(double xWeight) {
        if (0 < xWeight && xWeight < 2) {
            this.weight = xWeight;
        } else {
            System.out.println("Invalid value for weight.");
        }
    }

    public void setPrice(double xPrice) {
        if (xPrice > 0) {
            this.price = xPrice;
        } else {
            System.out.println("Invalid value for price.");
        }
    }

    //output string
    public String toString(){
        return "Type: " + this.type + " \nWeight: " + this.weight + "kg \nPrice: $" + this.price;
    }
}
