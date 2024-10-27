# Java-ITP-W9-S13-PF-MethodOverridingExample

Kelas Introduction to Programming / Week 9 / Session 13

### Penjelasan:
1. **Class Kendaraan (Superclass)**: 
   - `Kendaraan` adalah kelas induk (superclass) dengan metode `infoMobil()` yang mencetak informasi dasar tentang mobil.
   - Method `infoMobil()` pada kelas `Kendaraan` mencetak `"Merk: TOYOTA, Pabrik: Karawang Plant #1"`.

2. **Class MobilFortuner dan MobilYaris (Subclass)**:
   - `MobilFortuner` dan `MobilYaris` adalah subclass yang masing-masing mewarisi (inherit) dari superclass `Kendaraan`.
   - Di dalam kedua subclass ini, metode `infoMobil()` di-override untuk memberikan informasi spesifik tentang nama mobil yang berbeda:
     - `MobilFortuner` mencetak `"Mobil ini bernama TOYOTA FORTUNER."`
     - `MobilYaris` mencetak `"Mobil ini bernama TOYOTA YARIS."`

3. **Method Overriding**:
   - Method overriding terjadi ketika sebuah subclass mendefinisikan ulang metode yang sama (dengan nama dan parameter yang sama) yang sudah ada di superclass.
   - Dalam kode ini, metode `infoMobil()` di kelas `Kendaraan` di-override oleh masing-masing subclass (`MobilFortuner` dan `MobilYaris`) untuk memberikan output yang berbeda sesuai dengan jenis mobilnya.

4. **Main Method (Polimorfisme)**:
   - Di dalam `main()` method, objek `Ken`, `Fortuner`, dan `Yaris` dibuat.
   - `Kendaraan Fortuner = new MobilFortuner();` dan `Kendaraan Yaris = new MobilYaris();` adalah contoh penerapan polimorfisme, di mana variabel bertipe `Kendaraan` dapat merujuk pada objek dari subclass-nya (`MobilFortuner` dan `MobilYaris`).
   - Saat `infoMobil()` dipanggil untuk masing-masing objek (`Ken`, `Fortuner`, `Yaris`), hasilnya tergantung pada jenis aktual objek tersebut, bukan tipe variabelnya:
     - `Ken.infoMobil();` memanggil versi `infoMobil()` dari `Kendaraan`.
     - `Fortuner.infoMobil();` memanggil versi `infoMobil()` dari `MobilFortuner`.
     - `Yaris.infoMobil();` memanggil versi `infoMobil()` dari `MobilYaris`.



