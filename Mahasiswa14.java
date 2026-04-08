public class Mahasiswa14 {

    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    Mahasiswa14(){

    }

    Mahasiswa14(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Kelas : "+kelas);
        System.out.println("IPK : "+ipk);
    }
}