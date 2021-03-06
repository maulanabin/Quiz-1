package Kuis1H.MaulanaBintangIrfansyah;
import java.util.Scanner;

public class SepedaMotorMain {
    static Scanner sc = new Scanner(System.in);
    static SepedaMotor motor1 = new SepedaMotor();
    static SepedaMotor[] motor2 = new SepedaMotor[4];

    public static void main(String[] args) {
        motor2[0] = new SepedaMotor("HONDA");
        motor2[1] = new SepedaMotor("YAMAHA");
        motor2[2] = new SepedaMotor("DUCATI");
        motor2[3] = new SepedaMotor("SUZUKI");
        menu();
    }

    static void menu() {
        System.out.println("Pilih Sepeda Motor");
        for (int i = 0; i < motor2.length; i++) {
            System.out.println((i + 1) + " " + motor2[i].merk);
        }

        System.out.print("[1-4] o> ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                spd(motor2[0].merk);
                break;
            case 2:
                spd(motor2[1].merk);
                break;
            case 3:
                spd(motor2[2].merk);
                break;
            case 4:
                spd(motor2[3].merk);
                break;
            default:
                System.out.println("Tidak ada pilihan");
        }
    }

    static void spd(String motor) {
        System.out.println("OPSI SEPEDA MOTOR " + motor);
        if (motor1.kontakMotor == false) {
            System.out.println("0. Hidupkan motor");
            System.out.println("4. Menu Awal");
        } else if (motor1.kontakMotor == true) {
            System.out.println("1. Matikan Motor");
            System.out.println("2. Tambah Kecepatan Motor");
            System.out.println("3. Kurangi Kecepatan Motor");
        }
        System.out.print("o> ");
        int opMtr = sc.nextInt();
        if (opMtr == 0) {
            motor1.matikanMotor(true);
            motor1.info();
            spd(motor);
        } else if (opMtr == 1) {
            motor1.matikanMotor(false);
            motor1.info();
            spd(motor);
        } else if (opMtr == 2) {
            motor1.tambahKecepatanMotor(5);
            motor1.info();
            spd(motor);
        } else if (opMtr == 3) {
            motor1.kurangiKecepatanMotor(5);
            motor1.info();
            spd(motor);
        } else if (opMtr == 4) {
            menu();
        } else {
            spd(motor);
        }
    }
}