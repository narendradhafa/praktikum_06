//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class Manajer extends Pekerja {
    private int lamaKerja;

    // constructor
    public Manajer(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jk, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, nip, nama, nik, jk, menikah);
        this.lamaKerja = lamaKerja;
    }

    // getter
    public int getLamaKerja() {
        return lamaKerja;
    }

    // setter
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (super.getBonus() * 0.3);
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + 15;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLama Kerja      : " + getLamaKerja() + " hari";
    }
}
