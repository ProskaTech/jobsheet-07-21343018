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
public class JS7Tugas1CetakNamaFor {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i;
    
    System.out.print("Masukkan nama lengkap: ");
    String nama = in.nextLine();
    
        for (i = 0; i < 10; i++)
        {
            System.out.println(nama);
        }
    }
}
