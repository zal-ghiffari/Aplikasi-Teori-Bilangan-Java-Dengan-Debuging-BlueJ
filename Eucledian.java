import java.io.*;
import java.util.*;
/**
 * Write a description of class Eucledian here.
 *
 * @author (M Novrizal)
 * @version (a version number or a date)
 */
public class Eucledian
{
    // instance variables - replace the example below with your own
    Scanner scan = new Scanner(System.in);
    private int bil1;
    private int bil2;
    /**
     * Constructor for objects of class Eucledian
     */
    public Eucledian()
    {
        // initialise instance variables
        System.out.print('\u000C');
        System.out.println("Masukkan Bilangan Pertama : ");
        bil1 = scan.nextInt();
        System.out.println("Masukkan Bilangan Kedua : ");
        bil2 = scan.nextInt(); 
        System.out.println("GCD dari " + bil1 +" dan " + bil2 +" adalah : " + cariGCD(bil1,bil2));
    }
    
    public int cariGCD(int bil1, int bil2) {
        if(bil2 == 0){
            return bil1;
        }
        return cariGCD(bil2, bil1%bil2);
    }

}
