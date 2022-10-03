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
public class JS7Tugas1CetakNamaDoWhile {
    public static void main(String[] args) {
    int i = 0;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan nama lengkap: ");
    String nama = in.nextLine();
    
    do
    {
        System.out.println(nama);
        i++;
    }
    while (i < 10);
    }
    }
