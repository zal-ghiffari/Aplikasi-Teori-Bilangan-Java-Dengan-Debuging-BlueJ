import java.io.*;
import java.util.*;
/**
 * Write a description of class Sorting here.
 *
 * @author (M Novrizal)
 * @version (a version number or a date)
 */
public class Sorting
{
    // instance variables - replace the example below with your own
    private int A[];
    private int size;
    Scanner scan = new Scanner(System.in); 

    /**
     * Constructor for objects of class Sorting
     */
    public Sorting()
    {
        // initialise instance variables
        System.out.print('\u000C');
        inputArray();
        prosesSortingAscending();
        prosesSortingDescending();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void inputArray() {
        System.out.print("Masukkan Banyak Bilangan :");
        size = scan.nextInt();
        A = new int[size];
        for(int i=0;i<size;i++) {
            int k=0;
            do {
                k=0;
                System.out.print("Masukkan Bilangan Ke-"+(i+1)+" : ");
                A[i] = scan.nextInt();
                for(int j=0;j<i;j++) {
                    if(A[j]==A[i]) {
                        k=1;
                        System.out.println("Jangan Inputkan Bilangan Sama. Coba Lagi");
                    }
                }
            }while(k==1);
        }
        System.out.println("==========================");
        System.out.println("Bilangan Sebelum Sorting");
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    
    public void prosesSortingAscending() {
        int temp;
        for(int i=1;i<A.length;i++) {
            for(int j=0;j<A.length-i;j++) {
                if(A[j]>A[j+1]) {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        System.out.println("Hasil Sorting Ascending");
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    
    public void prosesSortingDescending() {
        int temp;
        for(int i=1;i<A.length;i++) {
            for(int j=0;j<A.length-i;j++) {
                if(A[j]<A[j+1]) {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        System.out.println("Hasil Sorting Descending");
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
