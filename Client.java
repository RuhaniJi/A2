import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Ruhani
 *  Class:          CS30S
 * 
 *  Assignment:     A2
 * 
 *  Description:    driver code
 * 
 *************************************************************/

public class Client{
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    final static String delim = "[ ]+";          // delimiter for splitting input records

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // a new line character that works on every computer system
        final String nl = System.lineSeparator();

        // ***** variables *****
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String[] tokens = null;         // used to split input records

        
        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("A2");
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        Employee e1 = new Employee();
        Employee e2 = new Employee(50, 30);
        Employee e3 = new Employee(30, 25);
        Employee e4 = new Employee(20, 100);
        
        // ***** print banners *****

        System.out.println(pInfo.getBanner());
        //fout.print(banner);

        // ***** Get Input *****

        // ***** Main Processing *****

        // ***** Print Formatted Output *****

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        
        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end A2
