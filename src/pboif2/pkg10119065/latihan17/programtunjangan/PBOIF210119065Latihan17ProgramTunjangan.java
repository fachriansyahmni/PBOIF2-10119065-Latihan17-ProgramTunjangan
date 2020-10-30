package pboif2.pkg10119065.latihan17.programtunjangan;

import java.util.Scanner;
public class PBOIF210119065Latihan17ProgramTunjangan {

 /*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan total gaji 
 */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       double gaji,tunjangan,totalGaji;
       String status;
       System.out.println("========Program Tunjangan========");
       System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
       gaji = sc.nextInt();  
       
       System.out.print("Status Anda? (Menikah/Belum)    : ");
       status = sc.next(); 
        if(status.equals("Menikah") || status.equals("menikah")){
            tunjangan = gaji * 0.35;
        }else{
            tunjangan = 0;
        }       
       
       
       totalGaji = gaji + tunjangan;
       System.out.println("\n========Hasil Pehitungan Gaji Anda========");  
       System.out.println("Gaji Pokok       : " + gaji);  
       System.out.println("Tunjangan        : " + tunjangan);  
       System.out.println("Total Gaji       : " + totalGaji); 
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");     
    }
    
}
