//Jack Atkinson

public class Coffee {

    //instance vars
    private String name;
    private double caffeine;
    private double riskAmount;

    //default constructor
    public Coffee(){
        this.name = "None";
        this.caffeine = 50;
    }

    //parameterized constructor
    public Coffee(String name, double caffeine){
        this.name = name;
        this.caffeine = caffeine;
    }

    //getters
    public String getName() {
        return this.name;
    }
    public double getCaffeine() {
        return this.caffeine;
    }

    //setters
    public void setName(String xName) {
        this.name = xName;
    }

    public void setCaffeine(double xCaffeine) {
        if (xCaffeine >= 50 && xCaffeine <= 300) {
            this.caffeine = xCaffeine;
        } else {
            System.out.println("Invalid value for caffeine.");
        }
    }

    //logic
    public double RiskyAmount(){
        return 180 / ((this.caffeine / 100.0) * 6.0);
    }

    public boolean equals(Coffee c){
        return c.getName().equals(this.name) && c.getCaffeine() == this.caffeine;
    }

    public String toString() {
        return "Name: " + this.name + "\nCaffeine: " + this.caffeine + "mg";
    }
}
