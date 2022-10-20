public class pbo_prak5 {
    public static void main(String[] args) {
        System.out.println("Rahmaditya Putri Lailatul Ismi");
        System.out.println("20191397036 - 2021B\n");
        manajer manajer_1 = new manajer();
        programmer programmer_1 = new programmer();

        System.out.println("~Manajer~");
        Pegawai.infoPegawai("Shabian Arsyl");
        manajer_1.infoGaji(20000000);
        manajer_1.infoTunjangan(10000000);

        System.out.println("~Programmer~");
        Pegawai.infoPegawai("Yonanta Deneef");
        programmer_1.infoGaji(50000000);
        programmer_1.infoBonus(200000000);



    }
}

abstract class Pegawai {
    public static void infoPegawai(String nama) {
        System.out.println("Nama : " + nama);
    }
    public void infoGaji(int gaji) {
        System.out.println("Gaji : " + "Rp. " + gaji);
    };
}

class manajer extends Pegawai {

    public void infoTunjangan(int tunjangan) {
        System.out.println("Tunjangan : " + "Rp. " + tunjangan + "\n");
    }
}

class programmer extends Pegawai {

    public void infoBonus(int bonus) {
        System.out.println("Bonus : " + "Rp. " + bonus);
    }
}