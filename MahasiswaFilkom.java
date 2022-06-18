//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    // constructor
    public MahasiswaFilkom(String nama, String nik, boolean jk, boolean menikah, String nim, double ipk) {
        super(nama, nik, jk, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // getter
    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    // setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // method lainnya
    public String getStatus() {
        String angkatan = String.valueOf(nim.charAt(0)) + nim.charAt(1);
        String prodi = "";

        switch (Integer.parseInt(String.valueOf(nim.charAt(6)))) {
            case 2 -> prodi = "Teknik Meniup Gelembung";
            case 3 -> prodi = "Teknik Berburu Ubur Ubur";
            case 4 -> prodi = "Sistem Perhamburgeran";
            case 6 -> prodi = "Pendidikan Chum Bucket";
            case 7 -> prodi = "Teknologi Telepon Kerang";
            default -> {}
        }
        return prodi + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (getIpk() > 3.5) return 75;
        if (getIpk() > 3.0) return 50;
        return 0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    // print attribute
    @Override
    public String toString() {
        return super.toString() +
                "\nIPK             : " + getIpk() +
                "\nNIM             : " + getNim() +
                "\nStatus          : " + getStatus();
    }
}
