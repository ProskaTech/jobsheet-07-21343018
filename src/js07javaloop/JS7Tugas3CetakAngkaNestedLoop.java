/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js07javaloop;
import java.util.Scanner;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class JS7Tugas3CetakAngkaNestedLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Baris maksimal = ");
        int max = in.nextInt();
                
        int i, j;
        
        for (i = 1; i <= max; i++){
            for (j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
