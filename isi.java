/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapot;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class isi extends Rapot {
   
    @Override
    void iya() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++PENGISIAN NILAI SISWA++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("===================================================================");
    }

    void siswa() {
        Scanner baca = new Scanner(System.in);
        System.out.println("Berapa data yang ingin ditampung:");
        int data = baca.nextInt();  
        int [] urut = new int[data];
        int[] h1 = new int[data];
        int[] h2 = new int[data];
        int[] ulangan = new int[data];
        int[] uts = new int[data];
        int[] pas = new int[data];
        int[] nilai = new int[data];
        String[] hasil = new String[data];
        String[] nama = new String[data];
        String[] kelas = new String[data];
        String[] mapel = new String[data];
        
        
   
        for (int a = 0; a<data; a++) {
            System.out.println("===================================================================");
            System.out.println("Data nilai ke:"+(a+1));
            System.out.print("Masukkan nama:");
            nama[a] = baca.next();
            System.out.print("Masukkan kelas:");
            kelas[a] = baca.next();
            System.out.print("Masukkan mata pelajaran:");
            mapel[a] = baca.next();
            System.out.println("===================================================================");
            System.out.print("Masukkan nilai harian-1:");
            h1[a] = baca.nextInt();
            System.out.print("Masukkan nilai harian-2:");
            h2[a] = baca.nextInt();
            System.out.print("Masukkan nilai ulangan:");
            ulangan[a] = baca.nextInt();
            System.out.print("Masukkan nilai UTS:");
            uts[a] = baca.nextInt();
            System.out.print("Masukkan nilai PAS:");
            pas[a] = baca.nextInt();

            nilai[a] = (h1[a] + h2[a] + ulangan[a] + uts[a] + pas[a]) / 5;
            
            if (nilai[a] >= 75 && nilai[a] <= 100) {
                hasil[a] = "Lulus";
            } else if (nilai[a] >= 0 && nilai[a] <= 74) {
                hasil[a] = "Tidak Lulus";
            } else {
                hasil[a] = "error";

            }
        }
           
            System.out.println(" ");
            System.out.println("=====================================================================================================================================");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\tDATA NILAI SISWA");
            System.out.println("\t\t\t\t\t\tTAHUN AJARAN 2019/2020");
            System.out.println("\t\t\t\t\t\t\tSMK TELKOM MALANG");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("||\tNama\t||\tMapel\t|| Nilai Harian-1||Nilai Harian-2|| Ulangan ||   UTS  ||   PAS   || Nilai Akhir||   PREDIKAT   ||");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
             for(int d=0;d<data;d++){
            System.out.println("||\t"+nama[d]+"\t||\t"+mapel[d]+" \t|| \t "+h1[d]+"    \t ||   \t    " + h2[d] +"   ||    "+ulangan[d]+"   ||   "+uts[d]+"   ||   "+pas[d]+"    ||     " +nilai[d]+ "     ||   "+hasil[d]+"||");
            
            }
        }
            
    }

