import java.text.NumberFormat;

/********************************************************************
 * Programmer: Ruhani
 * Class:  CS30S
 *
 * Assignment: A2
 *
 * Description: A2 Class 
 *              Employee Payroll
 ***********************************************************************/

// import libraries as needed here

public class Employee{
    //*** Class Variables ***
    // a new line character that works on every computer system
    String nl = System.lineSeparator();

    final int REGHOURS = 40;           //max hours in reg pay before it becomes overtime
    final int MINWAGE = 15;            // minimum wage
    
    private static int nextID = 1000;            // use to autogenerate unique id numbers
    
    //*** Instance Variables ***

    private double regPay;
    private double otPay;
    private double grossPay;
    private double wage;
    private int hours;
    
    private int id;                              // id number for specific employee
    

    //*** Constructors ***

    /*****************************************
     * Description: brief description of the methods purpose
     * 
     * Interface:
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    public Employee(int h, double w) {
        hours = h;
        wage = w;
    }
    
    public Employee() {
        hours = REGHOURS;
        wage = MINWAGE;
    }
    
    private int getNextID(){
        return nextID++;                        //increment and return id 
    } //end next id

    //*** Getters ***

    public int getID(){
        return this.id;    
    }

    public double getRegPay(){
        if (hours<=40){
            regPay = wage * hours;
        }
        else{ 
            regPay = wage * REGHOURS;  
        }
        return regPay;
    }//end regpay
    
    public double getOverPay(){
        if (hours>=40){
            otPay = wage * (hours-REGHOURS);
        }
        else{ 
            otPay = 0;  
        }
        return otPay;
    }//end overpay
    
    public double getGrossPay(){
        grossPay = otPay + regPay;
        return grossPay;
    }//end grosspay
    
    //*** Setters ***

    public void setRegPay(double regPay){
        this.regPay = regPay;
    } //end regpay
    
    public void setOverPay(double otPay){
        this.otPay = otPay;
    } //end overpay
    
    public void setGrossPay(double grossPay){
        this.grossPay = grossPay;
    } //end grosspay
    
    // *** override ***
    
    @Override
    public String toString() {
        String st;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        st = "ID: " + getNextID() + nl;
        st += "Hours: " + hours + nl;
        st += "Wage: " + currency.format(wage) + nl; 
        st += "Regular Pay: " + currency.format(getRegPay()) + nl;
        st += "Overtime Pay: " + currency.format(getOverPay()) + nl;
        st += "Gross Pay: " + currency.format(getGrossPay()) + nl;

        return st;
    } // end toString
    
    public boolean equals(Employee oc) {
        boolean equal;

        equal = grossPay == ( oc.getGrossPay());

        return equal;
    } // end equals
    
} // end of public class
