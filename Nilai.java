public class Nilai {
    String matakuliah ;

    char huruf;

    static int h = 1 ;

    // Elvia Clarissa 03082200020 
    public Nilai() {
    }


    public Nilai(String matakuliah, double nilaiangka,char huruf) {
        this.matakuliah = matakuliah;
        this.huruf = huruf;
    }



    public String getMatakuliah() {
        return this.matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }


    public double setNilaiAngka() {
        switch (this.huruf) {
            case 'A':
                return 4.0;

            case 'B':
                return 3.0;

            case 'C':
                return 2.0;

            case 'D':
                return 1.0;

            case 'E':
                return 0.0;
        }
        return 0.0;
    }

    public char getHuruf(){
        return this.huruf;
    }

    public void setHuruf(char huruf) {
        this.huruf = huruf;
    }


    public void tampilkan(){
        System.out.println("Mata Kuliah = " + getMatakuliah() );
        System.out.println("Nilai Huruf = " + getHuruf());
    }


    public int getSKS() {
        return 0;
    }


    public int getNilaiAngka() {
        return 0;
    }


    public Nilai getMataKuliah() {
        return null;
    }

}
