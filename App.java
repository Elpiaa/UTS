import java.util.Scanner;
// Elvia Clarissa 03082200020 
public class App {
    public static void main(String[] args) throws Exception {
        char ans = 'n';
        Scanner input = new Scanner(System.in);

        do{
            menu();
            int pilih = input.nextInt();
            if(pilih==1){
                Kartu kartu = new Kartu();
                Mahasiswa m1 = new Mahasiswa("Taeyong" , "01071995" , false);
                kartu.setMahasiswa(m1);
                Matakuliah mt1 = new Matakuliah("Art" , "AT127" , 5) ;
                kartu.setMatakuliah(mt1);
                System.out.println(mt1);
                Nilai n1 = new Nilai("Art", 3.0, 'B');
                Nilai n2 = new Nilai("Music", 4.0, 'A');
                System.out.println(n1);
                System.out.println(n2);
                kartu.setSemester(6);
                
                kartu.tambahnilai(mt1, n1);
                kartu.tampilkanKHS();
               
                n1.tampilkan();
            }
            else if ( pilih == 0){
                System.out.println("Bye....");
                System.exit(0);
            }
            else{
                System.exit(0);
            }
            System.out.print("Ulangi [y/n] ? ");
            input.nextLine();
             String yn = input.nextLine();
           ans = yn.charAt(0);

       }while(ans == 'y' || ans == 'Y');
        
       input.close();
        }



    public static void menu() {
        System.out.println("Pilihan MENU");
        System.out.println("1.Tampilkan HKS");
        System.out.println("0.Keluar");
    }

}
