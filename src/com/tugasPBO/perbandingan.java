package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = membandingkan kedua nilai

public class perbandingan {
    static Scanner scan = new Scanner(System.in);
    static int num1, num2;

    public static void main(String[] args){
        perbandingan banding = new perbandingan();
        boolean ulang = true;
        while (ulang) {
            banding.input();
            banding.banding(num1,num2);
            System.out.println("Ulangi aktifitas? (ya/tidak)");
            ulang = ulang(scan.next().toLowerCase());

        }
    }
    public static boolean ulang(String jawab){
        if(jawab.equals("ya")){
            return true;
        }else{
            return false;
        }
    }

    public static void input(){
        System.out.println("Masukkan nilai pertama :");
        num1 = scan.nextInt();
        System.out.println("Masukkan nilai kedua :");
        num2 = scan.nextInt();
    }

    public static void banding(int num1, int num2){
        if(num1 > num2){
           System.out.println("Hasil, "+num1+" lebih besar dari "+num2);
        }else if(num1 < num2){
            System.out.println("Hasil, "+num1+" lebih kecil dari "+num2);
        }else{
            System.out.println("Hasil, "+num1+" sama dengan "+num2);
        }
    }
}
