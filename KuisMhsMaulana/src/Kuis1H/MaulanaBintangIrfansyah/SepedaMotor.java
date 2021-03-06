package Kuis1H.MaulanaBintangIrfansyah;

public class SepedaMotor {
    public String merk;
    public boolean kontakMotor = false;
    public int kecepatanMotor;

    SepedaMotor(){

    }

    SepedaMotor(String merk) {
        this.merk = merk;
    }
    public void nyalakanMotor(boolean speed) {
        this.kontakMotor = speed;
    }

    public void matikanMotor(boolean speed) {
        this.kontakMotor = speed;
    }
    public void tambahKecepatanMotor(int kec) {
        if(kecepatanMotor >= 100){
            System.out.println("Maksimal kecepatan: 100 km/jam");
        }else{
            this.kecepatanMotor += kec;
        }
    }
    public void kurangiKecepatanMotor(int kec) {
        if(kecepatanMotor <= 0){
            System.out.println("Minimal kecepatan: 0 km/jam");
        }else{
            this.kecepatanMotor -= kec;
        }
    }
    public void info() {
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        if(kecepatanMotor <= 0) {
            if(kontakMotor == true) { 
                System.out.println("Sepeda motor hidup");
            }else{
                System.out.println("Sepeda motor mati");
            }
            System.out.println("Kecepatan\t: " + kecepatanMotor);
        }else{
            System.out.println("Kecepatan\t: " + kecepatanMotor);
        }
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
    }
}
