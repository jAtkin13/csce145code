//Jack Atkinson

public class Concert {

    //primary vars
    private String bandName;
    private int capacity;
    private double phonePrice;
    private double venuePrice;
    private int phoneTicketSold;
    private int venueTicketSold;




    //constructors
    public Concert() {
        this.bandName = "Unknown";
        this.capacity = 0;
        this.phonePrice = 0.0;
        this.venuePrice = 0.0;
        this.phoneTicketSold = 0;
        this.venueTicketSold = 0;
    }

    public Concert(String bandName, int capacity, double phonePrice, double venuePrice) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.phonePrice = phonePrice;
        this.venuePrice = venuePrice;
        this.phoneTicketSold = 0;
        this.venueTicketSold = 0;
    }

    public Concert(String bandName, int capacity, int phoneTicketSold, int venueTicketSold, double phonePrice, double venuePrice) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.phonePrice = phonePrice;
        this.venuePrice = venuePrice;
        this.phoneTicketSold = phoneTicketSold;
        this.venueTicketSold = venueTicketSold;
    }

    //getters
    public String getBandName() {
        return this.bandName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getPhonePrice() {
        return this.phonePrice;
    }

    public double getVenuePrice() {
        return this.venuePrice;
    }

    public int getNumTicketsSoldByPhone() {
        return this.phoneTicketSold;
    }

    public int getNumTicketsSoldAtVenue() {
        return this.venueTicketSold;
    }

    //setters

    public void setBandName(String xBandName) {
        this.bandName = xBandName;
    }

    public void setCapacity(int xCapacity) {
        this.capacity = xCapacity;
    }

    public void setPriceByPhone(double xPhonePrice) {
        this.phonePrice = xPhonePrice;
    }

    public void setPriceAtVenue(double xVenuePrice) {
        this.venuePrice = xVenuePrice;
    }

    public void setPhoneTicketSold(int xPhoneTicketSold) {
        this.phoneTicketSold = xPhoneTicketSold;
    }

    public void setVenueTicketSold(int xVenueTicketSold) {
        this.venueTicketSold = xVenueTicketSold;
    }


    //methods

    public int totalNumberOfTicketsSold() {
        return this.phoneTicketSold + this.venueTicketSold;
    }

    public int ticketsRemaining() {
        return this.capacity - this.totalNumberOfTicketsSold();
    }

    public void buyTicketsByPhone(int xPhoneTicketSold) {
        this.phoneTicketSold += xPhoneTicketSold;
    }

    public void buyTicketsAtVenue(int xVenueTicketSold) {
        this.venueTicketSold += xVenueTicketSold;
    }

    public double totalSales() {
        return (this.phoneTicketSold * this.phonePrice) + (this.venueTicketSold * this.venuePrice);
    }
}
