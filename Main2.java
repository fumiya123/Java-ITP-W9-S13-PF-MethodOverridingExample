class Kendaraan { // Superclass (Kelas Induk)
    public void infoMobil() {
        System.out.println("Merk: TOYOTA, Pabrik: Karawang Plant #1");
    }
}

class MobilFortuner extends Kendaraan {

    public void infoMobil() {
        System.out.println("Mobil ini bernama TOYOTA FORTUNER.");
    }
}

class MobilYaris extends Kendaraan {

    public void infoMobil() {
        System.out.println("Mobil ini bernama TOYOTA YARIS.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Kendaraan Ken = new Kendaraan();
        Kendaraan Fortuner = new MobilFortuner();
        Kendaraan Yaris = new MobilYaris();
        
        Ken.infoMobil();
        Fortuner.infoMobil();
        Yaris.infoMobil();
    }
}
