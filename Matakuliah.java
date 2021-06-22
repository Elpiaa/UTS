public class Matakuliah {
    String namamatakuliah;
    String kode ;
    Integer sks ;
// Elvia Clarissa 03082200020 
    public Matakuliah() {
    }


    public Matakuliah(String namamatakuliah, String kode, int sks) {
        this.namamatakuliah = namamatakuliah;
        this.kode = kode;
        this.sks = sks;
    }


    public String getNamamatakuliah() {
        return this.namamatakuliah;
    }


    public String getKode() {
        return this.kode;
    }


    public int getSks() {
        return this.sks;
    }

   
    
    @Override
    public String toString() {
        return "\n" + "\n" +
            "Nama Mata Kuliah : " + getNamamatakuliah() + "\n" +
            "Kode Mata Kuliah : " + getKode() + "\n" +
            "SKS              : " + getSks() + "\n"
           ;
    }

    public void add(Matakuliah matakuliah, Nilai nilai) {
    }
}
