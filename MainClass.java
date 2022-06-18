//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class MainClass {
    public static void main(String[] args) {
        int jumlahManusia = 0;
        int jumlahMahasiswaFilkom = 0;
        int jumlahPekerja = 0;
        int jumlahManajer = 0;

        System.out.println("===============| DATA MANUSIA |==============");

        Manusia man1 = new Manusia("Aku", "3923842934",true, true);
        jumlahManusia++;
        System.out.println(man1.toString() +
                         "\n---------------------------------------------");

        Manusia man2 = new Manusia("Kamu", "3923841823",false, true);
        jumlahManusia++;
        System.out.println(man2.toString() +
                "\n---------------------------------------------");

        Manusia man3 = new Manusia("Dia", "3923840712",true, false);
        jumlahManusia++;
        System.out.println(man3.toString() +
                "\n---------------------------------------------");

        Manusia man4 = new Manusia("Kita", "3923849601",false, false);
        jumlahManusia++;
        System.out.println(man4.toString() + "\n");

        System.out.println("==========| DATA MAHASISWA FILKOM |==========");

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018",3.70);
        jumlahManusia++;
        jumlahMahasiswaFilkom++;
        System.out.println(mhs1.toString() +
                "\n---------------------------------------------");

        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Narendra Dhafa Ilyaza", "351923847128", true, false, "215150701111002",4.00);
        jumlahManusia++;
        jumlahMahasiswaFilkom++;
        System.out.println(mhs2.toString() +
                "\n---------------------------------------------");

        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Adiva Arsyila Savina", "351923846017", false, false, "195150201111023",3.00);
        jumlahManusia++;
        jumlahMahasiswaFilkom++;
        System.out.println(mhs3.toString() +
                "\n---------------------------------------------");

        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Muhammad Daffa Adzriel", "351923845906", true, false, "205150401111156",2.70);
        jumlahManusia++;
        jumlahMahasiswaFilkom++;
        System.out.println(mhs4.toString() + "\n");

        System.out.println("===============| DATA PEKERJA |==============");

        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        jumlahManusia++;
        jumlahPekerja++;
        System.out.println(pekerja1.toString() +
                "\n---------------------------------------------");

        Pekerja pekerja2 = new Pekerja(9, 25, "391102630172", "Hu Tao", "351717858", false, false);
        jumlahManusia++;
        jumlahPekerja++;
        System.out.println(pekerja2.toString() +
                "\n---------------------------------------------");

        Pekerja pekerja3 = new Pekerja(5, 16, "799102139061", "Andi Adinata", "351717747", true, false);
        jumlahManusia++;
        jumlahPekerja++;
        System.out.println(pekerja3.toString() +
                "\n---------------------------------------------");

        Pekerja pekerja4 = new Pekerja(12, 21, "294102538950", "Anya Melfissa", "351717636", false, true);
        jumlahManusia++;
        jumlahPekerja++;
        System.out.println(pekerja4.toString() + "\n");

        System.out.println("===============| DATA MANAJER |==============");

        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        jumlahManusia++;
        jumlahPekerja++;
        jumlahManajer++;
        System.out.println(manajer1.toString() +
                "\n---------------------------------------------");

        Manajer manajer2 = new Manajer(7, 22, "406837583617", "Bonnivier Pranaja", "351707383281", true, true, 1700);
        jumlahManusia++;
        jumlahPekerja++;
        jumlahManajer++;
        System.out.println(manajer2.toString() +
                "\n---------------------------------------------");

        Manajer manajer3 = new Manajer(10, 30, "508837383506", "Miyu Ottavia", "351707382170", false, true, 1900);
        jumlahManusia++;
        jumlahPekerja++;
        jumlahManajer++;
        System.out.println(manajer3.toString() +
                "\n---------------------------------------------");

        Manajer manajer4 = new Manajer(11, 14, "603837783495", "Riksa Dhirendra", "351707381069", true, false, 2100);
        jumlahManusia++;
        jumlahPekerja++;
        jumlahManajer++;
        System.out.println(manajer4.toString() +
                "\n---------------------------------------------\n");

        System.out.println("Total Manusia           : " + jumlahManusia + " orang");
        System.out.println("Total Mahasiswa FILKOM  : " + jumlahMahasiswaFilkom + " orang");
        System.out.println("Total Pekerja           : " + jumlahPekerja + " orang");
        System.out.println("Total Manajer           : " + jumlahManajer + " orang");
    }
}
