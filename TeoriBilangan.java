import java.io.*;
import java.util.*;
/**
 * Write a description of class TeoriBilangan here.
 *
 * @author (M Novrizal)
 * @version (a version number or a date)
 */
public class TeoriBilangan
{
    // instance variables - replace the example below with your own
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructor for objects of class TeoriBilangan
     */
    public TeoriBilangan()
    {
        // initialise instance variables
        System.out.print('\u000C');
        
        int pilih;
        
        do {
            
            //System.out.print('\u000C');
            System.out.println("=======================================");
            System.out.println("APLIKASI TEORI BILANGAN BLUEJ");
            System.out.println("OLEH M NOVRIZAL | TK.II RPLK");
            System.out.println("=======================================");
            System.out.println("Perhatian, harap segala input dimasukkan");
            System.out.println("pada pop up input yang sudah tersedia");
            System.out.println("=======================================");
            System.out.println("1. Sorting");
            System.out.println("2. Eucledian");
            System.out.println("3. FPB");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.println("=======================================");
            System.out.println("Silanhkan Pilih (1,2,3,4,5)");
            //String opsi = JOptionPane.showInputDialog("Silakan Input Menu");
            pilih = scan.nextInt();

            
            switch(pilih) {
                case 1 :
                    //1. menambah note
                    System.out.print('\u000C');
                    System.out.println("1. Sorting");
                    System.out.println("=====================");
                    Sorting sort = new Sorting();
                    System.out.println();
                    break;
                case 2 :
                    //2. melihat note
                    System.out.print('\u000C');
                    System.out.println("2. Eucledian");
                    System.out.println("=====================");
                    Eucledian euclid = new Eucledian();
                    System.out.println();
                    break;
                case 3 :
                    //3. mengetahui jumlah note
                    System.out.print('\u000C');
                    System.out.println("3. FPB");
                    System.out.println("=====================");
                    Fpb fpb = new Fpb();
                    System.out.println();
                    break;
                case 4 :
                    //4. menghapus note
                    System.out.print('\u000C');
                    System.out.println("4. Faktorial");
                    System.out.println("=====================");
                    Faktorial fakto = new Faktorial();
                    System.out.println();
                    break;
                case 5 :
                    //5.exit program
                    System.exit(0);
                default:
                    break;
                    
            }
        } while(pilih != 0);
    }
}
