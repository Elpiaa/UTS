public class Mahasiswa{
    String nama;
    String id;
    boolean jekel;
    
// Elvia Clarissa 03082200020 
    public Mahasiswa() {
    }


    public Mahasiswa(String nama, String id, boolean jekel) {
        this.nama = nama;
        this.id = id;
        this.jekel = jekel;
    }


    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isJekel() {
        return this.jekel;
    }

    public boolean getJekel() {
        return this.jekel;
    }

    public void setJekel(boolean jekel) {
        this.jekel = jekel;
    }


    @Override
    public String toString() {
        return 
            "Nama Mahasiswa = " + getNama() + "\n" +
            "Id Mahasiswa   = " + getId() + "\n" +
            "Jenis kelamin  = " + (isJekel()==true? "Wanita" : "Pria") + "\n " 
            ;
    }
    

}