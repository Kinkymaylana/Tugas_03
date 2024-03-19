public class Kereta {

    // Mendeklarasikan variabel namaKereta dengan tipe data String
    // Mendeklarasikan variabel jumlahTiket dengan tipe data int
    // Mendeklarasikan daftarTiket dengan bentuk array
    private String namaKereta;
    private int jumlahTiket;
    private Ticket[] listTiket;

    // Deklarasi konstruktor tanpa parameter
    public Kereta() {
        this.namaKereta = "Kereta Komuter"; // Menginisialisasi atribut namaKereta dari objek Kereta dengan nilai "Kereta Komuter"
        this.jumlahTiket = 1000; // Menginisialisasi atribut jumlahTiket dengan nilai 1000
        this.listTiket = new Ticket[jumlahTiket]; //  Array 'listTiket' dapat menyimpan 1000 objek 'Ticket'
    }

    // Deklarasi konstruktor dengan dua parameter: 'namaKereta' berbentuk (String) dan 'jumlahTiket' berbentuk (int)
    public Kereta(String namaKereta, int jumlahTiket) {
        this.namaKereta = namaKereta; // Menginisialisasi atribut 'namaKereta' dari objek 'Kereta' dengan nilai dari parameter 'namaKereta' yang diberikan saat membuat objek
        this.jumlahTiket = jumlahTiket; // Menginisialisasi atribut 'jumlahTiket' dengan nilai dari parameter 'jumlahTiket' yang diberikan saat membuat objek
        this.listTiket = new Ticket[jumlahTiket]; // Membuat array 'listTiket yang merupakan array dari objek 'Ticket'
    }

    // Method untuk menambahkan tiket dengan nama penumpang ke dalam array listTiket 
    // Deklarasi method 'tambahTiket' dengan satu parameter 'namaPenumpang'
    public void tambahTiket(String namaPenumpang) {

        // Apabila jumlah tiket lebih dari nol maka pesan tiket berhasil
        if (jumlahTiket > 0) {
            listTiket[jumlahTiket - 1] = new Ticket();
            listTiket[jumlahTiket - 1].setNamaPenumpang(new String[]{namaPenumpang});
            jumlahTiket--;
            System.out.println("=================================================");
            System.out.println("Tiket berhasil dipesan");

            // Menampilkan sisa tiket jika jumlah tiket kurang dari 30 pada tampilan
            if (jumlahTiket < 30) {
                System.out.println(" Sisa tiket tersedia: " + jumlahTiket);
            }
        } else {
            // Apabila jumlah tiket = nol maka pesan tiket gagal
            System.out.println("\"=================================================\"");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }

    // overloaded method (tiket untuk KAJJ)
    // Deklarasi metode tambahTiket yang mengambil tiga parameter: 'namaPenumpang', 'asal', dan 'tujuan'
    public void tambahTiket(String namaPenumpang, String asal, String tujuan) {

        // Apabila jumlah tiket lebih dari nol maka pesan tiket berhasil
        if (jumlahTiket > 0) {
            listTiket[jumlahTiket - 1] = new Ticket();
            listTiket[jumlahTiket - 1].setNamaPenumpang(new String[]{namaPenumpang});
            listTiket[jumlahTiket - 1].setAsal(new String[]{asal});
            listTiket[jumlahTiket - 1].setTujuan(new String[]{tujuan});
            jumlahTiket--;
            System.out.println("=================================================");
            System.out.print("Tiket berhasil dipesan");

            // Menampilkan sisa tiket jika jumlah tiket kurang dari 30 pada tampilan
            if (jumlahTiket < 30) {
                System.out.println(" Sisa tiket tersedia: " + jumlahTiket);
            }
        } else {
            // Apabila jumlah tiket = nol maka pesan tiket gagal
            System.out.println("=================================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }

    // Menampilkan list tiket pada tampilan
    public void tampilkanTiket() {
        System.out.println("=================================================");
        System.out.println("Daftar penumpang kereta api " + namaKereta);
        System.out.println("----------------------------------");
        for (int i = 0; i < listTiket.length; i++) {
            if (listTiket[i] != null) { // Kondisi pertama dalam loop. Memeriksa apakah elemen 'listTiket[i]' tidak kosong (tidak null)
                if (namaKereta.equals("Kereta Komuter")) { // Kondisi kedua dalam loop. Jika namaKereta adalah "Kereta Komuter", maka akan mencetak hanya nama penumpang
                    // Jika kondisi pertama terpenuhi, mencetak nama penumpang dari tiket pada indeks 'i' dalam array 'listTiket'
                    System.out.println("Nama: " + listTiket[i].getNamaPenumpang()[0]);
                } else {
                    // Mencetak nama penumpang dari tiket pada indeks 'i' dalam array 'listTiket'
                    System.out.println("Nama: " + listTiket[i].getNamaPenumpang()[0]);
                    // Mencetak stasiun asal dari tiket pada indeks 'i' dalam array 'listTiket'
                    System.out.println("Asal: " + listTiket[i].getAsal()[0]);
                    // Mencetak stasiun tujuan dari tiket pada indeks 'i' dalam array 'listTiket'
                    System.out.println("Tujuan: " + listTiket[i].getTujuan()[0]);
                    System.out.println("----------------------------------");
                }
            }
        }
    }
}