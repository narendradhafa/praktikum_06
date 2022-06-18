//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class Pekerja extends Manusia {
    private double gaji, bonus;
    private int jamKerja, hariKerja;
    private String nip;

    // constructor
    public Pekerja(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jk, boolean menikah) {
        super(nama, nik, jk, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.nip = nip;
    }

    // getter
    public double getGaji() {
        return getHariKerja() * getJamKerja() * 15;
    }

    public double getBonus() {
        int hariKerja, hariLibur;

        if (getHariKerja() % 7 == 0) {
            hariLibur = getHariKerja() / 7 * 2;
            hariKerja = getHariKerja() - hariLibur;
        } else if (getHariKerja() % 7 <= 3 || getHariKerja() % 7 == 6) {
            hariLibur = (int) Math.floor(getHariKerja() / 7.0 * 2);
            hariKerja = getHariKerja() - hariLibur;
        } else {
            hariLibur = (int) Math.floor((getHariKerja() / 7.0 * 2) - 1);
            hariKerja = getHariKerja() - hariLibur;
        }

        return (hariKerja * (getJamKerja() - 7) * 2) + (hariLibur * getJamKerja() * 20);
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public String getNip() {
        return nip;
    }

    // setter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    // method lainnya
    public String getStatus() {
        String kantorCabang = "";
        String departemen = "";
        String cabang = String.valueOf(getNip().charAt(2));

        switch (Integer.parseInt(String.valueOf(getNip().charAt(0)))) {
            case 1 -> kantorCabang = "Mondstadt";
            case 2 -> kantorCabang = "Liyue";
            case 3 -> kantorCabang = "Inazuma";
            case 4 -> kantorCabang = "Sumeru";
            case 5 -> kantorCabang = "Fontaine";
            case 6 -> kantorCabang = "Natlan";
            case 7 -> kantorCabang = "Snezhnaya";
            default -> {}
        }
        switch (Integer.parseInt(String.valueOf(getNip().charAt(6)))) {
            case 1 -> departemen = "Pemasaran";
            case 2 -> departemen = "Humas";
            case 3 -> departemen = "Riset";
            case 4 -> departemen = "Teknologi";
            case 5 -> departemen = "Personalia";
            case 6 -> departemen = "Akademik";
            case 7 -> departemen = "Administrasi";
            case 8 -> departemen = "Operasional";
            case 9 -> departemen = "Pembangunan";
            default -> {}
        }
        return departemen + ", " + kantorCabang + " cabang ke-" + cabang;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus();
    }

    // print attribute
    @Override
    public String toString() {
        return super.toString() +
                "\nBonus           : " + getBonus() + "$" +
                "\nGaji            : " + getGaji() + "$" +
                "\nStatus          : " + getStatus();
    }
}
