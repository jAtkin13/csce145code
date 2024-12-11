import java.util.Scanner;

public class Calculator {
    private double result;

    private final double precision = 0.000001;

    //default constructor
    public Calculator{
        this.result = 0;
    }
    
    public Calculator(double xresult){
        this.result = xresult;
    }

    //accessor
    public double getResult() {
        return this.result;
    }

    //mutator
    public void setResult(double xresult){
        this.result = xresult;
    }

    public void calculate(){
        boolean done = false;

        Scanner scan = new Scanner(System.in);

        while(!done){
            System.out.println("Result = " + this.result);

            char op = scan.next().charAt(0);

            if (op == 'E' || op == 'e'){
                System.out.println("Exiting the program...");

                done = true;
            } else {
                double num2 = scan.nextDouble();

                try {
                    this.result = evaluate (op, this.result, num2);
                }
                catch (DivisionByZeroException e){
                    System.out.println(e.getMessage());
                }
                catch (UnknownOperatorException e){
                    System.out.println(e.getMessage());
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                finally{
                    //code that always runs
                }
            //end of while loop
            }
        }
    }
    public double evaluate (char op, double num1, double num2) throws DivisionByZeroException, UnknownOperatorException {
        double answer = 0;

        switch(op){
            case '+': //addition
                answer = num1 + num2;
                break;

            case '-': //subtract
                answer = num1 - num2;
                break;

            case '*': //multiply
                answer = num1 * num2;
                break;

            case '/': //divide
                if (num2 < precision && num2 > -precision){
                    throw new DivisionByZeroException();
                } else {
                    answer = num1 / num2;
                }
                break;

            default:
                throw new UnknownOperatorException();
        }
        return answer;
    }
}
