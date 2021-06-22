import java.util.ArrayList;
// Elvia Clarissa 03082200020 
public class Kartu {
    int semester;
    Mahasiswa mahasiswa;
    ArrayList<Nilai> nilai = new ArrayList<Nilai>();
    double ipk;
    Matakuliah matakuliah;

    public Kartu() {
    }


    public Kartu(int semester, Mahasiswa mahasiswa, ArrayList<Nilai> nilai, double ipk, Matakuliah matakuliah) {
        this.semester = semester;
        this.mahasiswa = mahasiswa;
        this.nilai = nilai;
        this.ipk = ipk;
        this.matakuliah = matakuliah;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public ArrayList<Nilai> getNilai() {
        return this.nilai;
    }

    public void setNilai(ArrayList<Nilai> nilai) {
        this.nilai = nilai;
    }

    public int tSKS(){
        int t = 0;
        for (Nilai nilai : nilai){
            t += nilai.getSKS();
        }
        return t;
    }

    public double ipk(){
        double s = 0.0 ;
        double u = 0.0;
        for(Nilai a : nilai){
            s += a.getNilaiAngka() * a.getMataKuliah().getSKS();
            u += a.getSKS();
        }
        return s/u;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public Matakuliah getMatakuliah() {
        return this.matakuliah;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }
    

    public void tambahnilai(Matakuliah matakuliah , Nilai nilai) {
        matakuliah.add(matakuliah , nilai);

    }

    public void tampilkanKHS(){
        int h = 1;
        Matakuliah mt1 = new Matakuliah("Art" , "AT127" , 5) ;
        Nilai n1 = new Nilai("Art", 3.0, 'B');
        System.out.println("Nama Mahasiswa  :");
        System.out.println(mahasiswa.toString());
        System.out.println("Semester        :");
        System.out.println(getSemester());
        System.out.println("IPK             :");
        double a = (n1.getNilaiAngka()*mt1.getSks())/mt1.getSks();
        System.out.println(a);
        System.out.println("Total SKS       :");
        System.out.println(tSKS());
        System.out.println("Nilai");
        System.out.println(matakuliah.toString());
        for(Nilai n : nilai){
            System.out.print(h);
            System.out.println(n.toString());
            h++;
        }
    }

}
