/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan47.nilaimahasiswa;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program Niali maasiswa
 */
public class PBOIF210119083Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa nilai = new NilaiMahasiswa(75, 45, 34);
        
        System.out.printf("QUIZ     : %.1f\n",nilai.getNilaiQuiz());
        System.out.printf("UTS      : %.1f\n",nilai.getNilaiUTS());
        System.out.printf("UAS      : %.1f\n\n",nilai.getNilaiUAS());
        
        nilai.setNilaiAkhir(nilai.getNilaiQuiz(),nilai.getNilaiUTS(),nilai.getNilaiUAS());
        System.out.printf("Nilai Akhir   : %.1f\n\n",nilai.getNilaiAkhir());
        
        nilai.setIndex(nilai.getNilaiAkhir());
        System.out.printf("Index   : %s\n",nilai.getIndex());
        
        nilai.setKeterangan(nilai.getIndex());
        System.out.printf("Keterangan   : %s\n",nilai.getKeterangan());
        
        System.out.println("==========================================");
        System.out.println("Developed by :Ragsan Zen Mustaofa");
    }
    
}
