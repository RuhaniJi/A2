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

    //*** Instance Variables ***

    int id = 0;                     //unique employee number
    private int regPay;
    private int overPay;
    private int grossPay;
    private int wage;
    private int hours;

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

    public Employee() {
        this.id = getID(id);
    }

    public Employee(int h, int w) {
        hours = h;
        wage = w;
    }

    //*** Getters ***

    public static int getID(int id){
        id = 1000;
        return id;
    } // end id

    public int getRegPay(){
        if (hours<=40){
            regPay = wage * hours;
        }
        else{ 
            regPay = wage * REGHOURS;  
        }
        return regPay;
    }//end regpay
    
    public int getOverPay(){
        if (hours>=40){
            overPay = wage * (hours-REGHOURS);
        }
        else{ 
            overPay = 0;  
        }
        return overPay;
    }//end overpay
    
    public int getGrossPay(){
        grossPay = overPay + regPay;
        return grossPay;
    }//end grosspay
    
    //*** Setters ***

    public void setRegPay(int regPay){
        this.regPay = regPay;
    } //end regpay
    
    public void setOverPay(int overPay){
        this.overPay = overPay;
    } //end overpay
    
    public void setGrossPay(int grossPay){
        this.grossPay = grossPay;
    } //end grosspay
    
    // *** override ***
    
    @Override
    public String toString() {
        String st;

        st = "ID: " + id + nl;
        st += "Hours: " + hours + nl;
        st += "Wage: " + wage + nl; 
        st += "Regular Pay: " + regPay + nl;
        st += "Overtime Pay: " + overPay + nl;
        st += "Gross Pay: " + grossPay + nl;

        return st;
    } // end toString
    
    public boolean equals(Employee oc) {
        boolean equal;

        equal = grossPay == (oc.getGrossPay());

        return equal;
    } // end equals
    
} // end of public class
