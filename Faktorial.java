import java.io.*;
import java.util.*;

/**
 * Write a description of class Faktorial here.
 *
 * @author (M Novrizal)
 * @version (a version number or a date)
 */
public class Faktorial
{
    // instance variables - replace the example below with your own
    private int bil;
    private int faktorial=1;
    Scanner scan = new Scanner(System.in);
    /**
     * Constructor for objects of class Faktorial
     */
    public Faktorial()
    {
        // initialise instance variables
        System.out.print('\u000C');
        System.out.print("Masukkan Bilangan : ");
        bil = scan.nextInt();
        for(int i=1;i<=bil;i++)   {
            faktorial*=i;
        }
        System.out.println("Faktorial dari "+bil+" adalah : "+faktorial);
    }
}
