public class MahasiswaBerprestasi14 {

    Mahasiswa14 listMhs[];
    int idx;

    MahasiswaBerprestasi14(int jumlah){
        listMhs = new Mahasiswa14[jumlah];
    }

    // ================= TAMBAH =================
    void tambah(Mahasiswa14 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // ================= BUBBLE SORT (DESC) =================
    void bubbleSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){

                if (listMhs[j] != null && listMhs[j - 1] != null) {
                    // DESCENDING
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa14 tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }

            }
        }
    }

    // ================= SELECTION SORT ASC =================
    void selectionSort(){
        for (int i = 0; i < listMhs.length - 1; i++){

            if (listMhs[i] == null) continue;

            int idxMin = i; // tetap pakai nama ini

            for (int j = i + 1; j < listMhs.length; j++){

                if (listMhs[j] != null && listMhs[idxMin] != null) {
                    // DESCENDING
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }

            }

            // tukar
            if (listMhs[idxMin] != null) {
                Mahasiswa14 tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
            }
        }
    }
    // ================= INSERTION SORT DSC =================
    void insertionSort(){
    for(int i = 1; i < listMhs.length; i++){

        if (listMhs[i] == null) continue;

        Mahasiswa14 temp = listMhs[i];
        int j = i;

        while (j > 0 && listMhs[j-1] != null && listMhs[j-1].ipk < temp.ipk) { 

            listMhs[j] = listMhs[j-1];
            j--;
        }

        listMhs[j] = temp;
    }
}
    //================== SEQUENTIAL SEARCHING ===============
    int sequentialSearching (double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){

            if (listMhs[j].ipk == cari ){
                posisi = j;
                //break;
            }
            
        }
        return posisi;
    } 


    //=================== BINARY SEARCH =======================
        int findBinarySearch(double cari, int left, int right){
            int mid;
            if (right>=left) {
                mid=(left+right)/2;
                if (cari == listMhs[mid].ipk) {
                    return(mid);
                }
                else if (listMhs[mid].ipk < cari) {
                    return findBinarySearch(cari, left, mid-1);
                }
                else{
                    return findBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }

        //=============== Menampilkan Posisi ============
        void tampilPosisi(double x, int pos){
            if (pos != -1) {
                System.out.println("Data mahasiswa dengan IPK : "+x+" Ditemukan pada indek ke-"+pos);
            }
            else{
                System.out.println("Data "+x+" tidak ditemukan");
            }
        }
    
        //============== TAMPIL DATA SEARCHING ==============
        void tampilDataSearch(double x, int pos){
            if (pos != -1) {
                System.out.println("nim\t: "+listMhs[pos].nim);
                System.out.println("nama\t: "+listMhs[pos].nama);
                System.out.println("kelas\t: "+listMhs[pos].kelas);
                System.out.println("ipk\t: "+x);
            }
            else{
                System.out.println("Data Mahasiswa dengan IPK "+x+" tidak ditemukan");
            }
        }

    // ================= TAMPIL =================
    void tampil(){
        for (int i = 0; i < listMhs.length; i++){
            if (listMhs[i] != null) {
                listMhs[i].tampilInformasi();
                System.out.println("-------------------------");
            }
        }
    }
}