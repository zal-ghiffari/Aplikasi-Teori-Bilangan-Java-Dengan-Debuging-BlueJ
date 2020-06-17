import java.io.*;
import java.util.*;

/**
 * Write a description of class Fpb here.
 *
 * @author (M Novrizal)
 * @version (a version number or a date)
 */
public class Fpb
{
    // instance variables - replace the example below with your own
    private int bil1;
    private int bil2;
    Scanner scan = new Scanner(System.in);

    /**
     * Constructor for objects of class Fpb
     */
    public Fpb()
    {
        // initialise instance variables
        System.out.print('\u000C');
        System.out.print("Masukkan Bilangan Pertama : ");
        bil1 = scan.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        bil2 = scan.nextInt();
        System.out.println("====================");
        System.out.println("FPB dari "+bil1+" dan "+bil2+" adalah : "+cariFPB(bil1,bil2));
    }

    public int cariFPB(int bil1, int bil2)
    {
        // put your code here
        int temp;
        temp = bil1 % bil2;
        while (temp != 0) {
            bil2 = bil1;
            bil1 = temp;
            temp = bil2 % bil1;
        }
        return bil1;
    }
}
