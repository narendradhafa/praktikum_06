//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class Manusia {
    private String nama, nik;
    private boolean jk, menikah;

    // constructor
    public Manusia(String nama, String nik, boolean jk, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jk = jk;
        this.menikah = menikah;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    // meng-return laki-laki ketika jk = true dan perempuan ketika jk = false
    public String isJk() {
        if (!jk) {
            return "Perempuan";
        }
        else return "Laki-Laki";
    }

    public boolean isMenikah() {
        return menikah;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setJk(boolean jk) {
        this.jk = jk;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // method lainnya
    public double getTunjangan() {
        if (menikah) {
            if (!jk) {
                return 25;
            } else if (jk) {
                return 20;
            }
        } return 15;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    // print attribute
    public String toString() {
        return "Nama            : " + getNama() +
             "\nNIK             : " + getNik()  +
             "\nJenis Kelamin   : " + isJk()   +
             "\nPendapatan      : " + getPendapatan() + "$";
    }
}
