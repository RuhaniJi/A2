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
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        System.out.println(pInfo.getBanner());
        //fout.print(banner);

        // ***** Get Input *****

        // ***** Main Processing *****

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end A2
