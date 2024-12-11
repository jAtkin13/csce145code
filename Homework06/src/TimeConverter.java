//Jack Atkinson
public class TimeConverter {

    //vars
    public int hours;
    public int minutes;
    public int seconds;
    public boolean notPM;

    //default constructor
    public TimeConverter(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true;
    }

    //parameterized constructor
    public TimeConverter(int xhours, int xminutes, int xseconds){
        this.hours = xhours;
        this.minutes = xminutes;
        this.seconds = xseconds;
        this.notPM = true;
    }

    //getters
    public int getHours(){
        return this.hours;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public int getSeconds(){
        return this.seconds;
    }

    public boolean getNotPM(){
        return this.notPM;
    }

    //setters
    public void setHours(int xhours){
        if (xhours >= 0 && xhours <= 23){
            this.hours = xhours;
        } else {
            System.out.println("Invalid hours entered.");
        }
    }

    public void setMinutes(int xminutes){
        if (xminutes >= 0 && xminutes <= 59){
            this.minutes = xminutes;
        } else {
            System.out.println("Invalid minutes entered.");
        }
    }

    public void setSeconds(int xseconds){
        if (xseconds >= 0 && xseconds <= 59){
            this.seconds = xseconds;
        } else {
            System.out.println("Invalid seconds entered.");
        }
    }

    public void setNotPM(boolean xnotPM){
        this.notPM = xnotPM;
    }

    //methods

    //updateTime method w/ int parameters
    public void updateTime(int xhours, int xminutes, int xseconds) throws TimeException {
        if (xhours < 0 || xhours > 23) {
            throw new TimeException("Invalid hours entered.");
        } else {
            this.hours = xhours;
        }

        if (xminutes < 0 || xminutes > 59) {
            throw new TimeException("Invalid minutes entered.");
        } else {
            this.minutes = xminutes;
        }

        if (xseconds < 0 || xseconds > 59) {
            throw new TimeException("Invalid seconds entered.");
        } else {
            this.seconds = xseconds;
        }

        if (this.hours >= 12){
            this.notPM = false;
            if (this.hours > 12){
                this.hours = this.hours - 12;
            };
        } else {
            this.notPM = true;
            if (this.hours == 0){
                this.hours = 12;
            }
        }
    }
    //updateTime method w/ string parameter
    public void updateTime(String xValue) throws TimeException {
             String[] time = xValue.split(":");
        try {

            int xhours = Integer.parseInt(time[0]);
            int xminutes = Integer.parseInt(time[1]);
            int xseconds = Integer.parseInt(time[2]);

            if (xhours < 0 || xhours > 23) {
                throw new TimeException("Invalid hours entered.");
            } else {
                this.hours = xhours;
            }

            if (xminutes < 0 || xminutes > 59) {
                throw new TimeException("Invalid minutes entered.");
            } else {
                this.minutes = xminutes;
            }

            if (xseconds < 0 || xseconds > 59) {
                throw new TimeException("Invalid seconds entered.");
            } else {
                this.seconds = xseconds;
            }

            if (this.hours >= 12){
                this.notPM = false;
                if (this.hours > 12){
                    this.hours = this.hours - 12;
                };
            } else {
                this.notPM = true;
                if (this.hours == 0){
                    this.hours = 12;
                }
            }



        } catch (Exception e){
            throw new TimeException("Invalid time entered.");
        }
    }

    public String displayTime(){
       if (this.notPM){
           return this.hours + ":" + this.minutes + ":" + this.seconds + " AM";
       } else {
           return this.hours + ":" + this.minutes + ":" + this.seconds + " PM";
       }
    }
}
