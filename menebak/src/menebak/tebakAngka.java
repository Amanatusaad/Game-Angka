/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menebak;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tebakAngka {
    /*Atribut*/
    int random, tebak;
    /*-random  sbg variable untuk memilih angka secara acak
    -tebak sbg variable memasukan angka bagi pemain
    */
    
    /*method*/
    void input(){
        random = (int)(Math.random()*100);
        System.out.println("Hello!!! Saya noName telah memilih angka antara 1-100, Ayo tebak angka berapa yang saya pilih?");
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Masukan angka tebakan anda : ");
            tebak = input.nextInt();
            if(tebak < random){
                System.out.println("wkwk.. Angka teakan Anda terlalu kecil");
            }
            else if(tebak > random){
                System.out.println("wkwk.. Angka tebakan Anda terlalu besar");
            }
            else{
                System.out.println("Yes!!! tebakan Anda tepat");
            }
        } while(tebak != random);
    }
}
