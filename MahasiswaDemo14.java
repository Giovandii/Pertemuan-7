import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi14 data = new MahasiswaBerprestasi14();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine(); // buang enter

        for (int i = 0; i < jumlahMhs; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // buang enter

            Mahasiswa14 m = new Mahasiswa14(nim, nama, kelas, ipk);
            data.tambah(m);
        }
        System.out.println("---------------------------");
        data.tampil();
        //melakukan pencarian data sequential
        System.out.println("---------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------");
        System.out.println("Masukan Ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("");

        data.insertionSort();
        System.out.println("=== Menggunakan Sequential Searching ===");
        //double posisi = data.sequentialSearching(cari);
        int posisi = data.sequentialSearching(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilDataSearch(cari, posisi);
        System.out.println("");

        System.out.println("=== Menggunakan Binnary Searching ===");
        int Posisi = data.findBinarySearch(cari, 0, data.idx-1);

        data.tampilPosisi(cari, Posisi);
        data.tampilDataSearch(cari, Posisi);

        // tampil sebelum sorting
        System.out.println("\n=== Data Sebelum Sorting ===");
        data.tampil();

        // sorting
        data.bubbleSort();

        // tampil setelah sorting
        System.out.println("\n=== Data Setelah Sorting Bubblesort (DSC) ===");
        data.tampil();

        System.out.println("=== Data Setelah Sorting Selectionsort (ASC) ===");
        data.selectionSort();
        data.tampil();

        System.out.println("=== Data Setelah Sorting Insertionsort (DSC) ===");
        data.insertionSort();
        data.tampil();

    }
}