/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3reza;

/**
 *
 * @author Reza Achmad Fauzi
 * Nim : 10116469
 * kelas IF 11
 */
class Mahasiswa {

    private double quiz, uts, uas, nAkhir;
    private String nama, nim, ket;
    private char index = 0;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    double getNilaiAkhir(double quiz, double uts, double uas) {
        nAkhir = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
        return nAkhir;
    }

    public void getIndexNilai(double nAkhir) {

        if (nAkhir >= 80) {
            index = 'A';
            ket = "Sangat Baik";
        } else if (nAkhir >= 68) {
            index = 'B';
            ket = "Baik";
        } else if (nAkhir >= 56) {
            index = 'C';
            ket = "Cukup";
        } else if (nAkhir >= 45) {
            index = 'D';
            ket = "Kurang";
        } else if (nAkhir <= 45) {
            index = 'E';
            ket = "Sangat Kurang";
        }

        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + ket);
    }
}

public class TUGAS3REZA {

    /**
     * @command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa oMhs = new Mahasiswa();
        oMhs.setNama("Reza Achmad Fauzi");
        oMhs.setNim("10116469");
        oMhs.setQuiz(90);
        oMhs.setUts(92);
        oMhs.setUas(95);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Nama ke " + i + "\t= " + oMhs.getNama());
        }
        for (int j = 8; j >= 1; j--) {
            System.out.println("Nim ke " + j + "\t= " + oMhs.getNim() + j);
        }

        double nAkhir = oMhs.getNilaiAkhir(oMhs.getQuiz(), oMhs.getUts(), oMhs.getUas());

        System.out.println("\nQuiz : " + oMhs.getQuiz());
        System.out.println("UTS : " + oMhs.getUts());
        System.out.println("UAS : " + oMhs.getUas());
        System.out.println("\nNilai Akhir = " + nAkhir +"\n");;
        oMhs.getIndexNilai(nAkhir);
    }

}

