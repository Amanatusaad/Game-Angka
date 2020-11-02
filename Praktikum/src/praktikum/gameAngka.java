/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class gameAngka {
    /*Atribut*/
    int random, tebak; 
    int score=100;
    
    /*Method*/
    void input(){
        /*random digunakan unuk mengacak angka */
        random =(int)(Math.random()*100);
        System.out.println("Hello!!! Saya noName telah memilih angka antara 1-100, Ayo tebak angka berapa yang saya pilih?");
        Scanner input = new Scanner(System.in);
        System.out.println("Score Mula-mula pemain = " + score );
        do{
            System.out.println("Masukan Angka Tebakanmu : ");
            tebak = input.nextInt();
            if(tebak < random){
                if(score > 0){
                    score-=2;
                    System.out.println("Yah.. tebakanmu terlalu kecil bung!!");
                    System.out.println("Score pemain saat ini: "+ score);
                }
                else{
                    System.out.println("Sorry bung, Anda tidak bisa melanjutkan game dengan score = 0");
                    break;
                }
            }
            else if(tebak > random){
                if(score > 0){
                    score-=2;
                    System.out.println("Yah.. tebakanmu terlalu besar bung!");
                    System.out.println("Score pemain saat ini : "+ score);
                }
                else{
                    System.out.println("Sorry bung, Anda tidak bisa melanjutkan game dengan score = 0");
                    break;
                }
            }
            else{
                if(score >= 92){
                    score+=50;
                    System.out.println("YESS... tebakan Anda sangat tepat dan tidak lebih dari 5 kali percobaan. So selamat mendapatkan 50 pint tambahan");
                    System.out.println("Score Anda saat ini : "+ score);
                    break;
                }
                else{
                    System.out.println("YESS... tebakan Anda sangat tepat");
                    System.out.println("Score Anda saat ini : "+ score);
                    break;
                }
            }
        }while(tebak != random);
        
    }
}
