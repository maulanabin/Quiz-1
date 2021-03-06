package Kuis1H.MaulanaBintangIrfansyah;
import java.util.Scanner;

public class SepedaMotorMain {
        static Scanner userInput = new Scanner(System.in);
        static SepedaMotor motor1 = new SepedaMotor();
        static SepedaMotor[] motor2 = new SepedaMotor[4];

        public static void main(String[] args) {
            motor2[0] = new SepedaMotor("Honda");
            motor2[1] = new SepedaMotor("Yamaha");
            motor2[2] = new SepedaMotor("Ducati");
            motor2[3] = new SepedaMotor("Suzuki");
            menuPilihan();
        }
        static void spdMotor(String motor) {
            System.out.println("Pilihan nomor: " + motor);
            if (!motor1.kontakMotor) {
                System.out.println("🌷 0. Hidupkan motor");
                System.out.println("🌷 4. Menu Awal");
            } else if (motor1.kontakMotor) {
                System.out.println("🌷 1. Matikan Motor");
                System.out.println("🌷 2. Tambah Kecepatan Motor");
                System.out.println("🌷 3. Kurangi Kecepatan Motor");
            }
            System.out.print("🍀 🍀 🍀 🍀: ");
            int motor3 = userInput.nextInt();
            if (motor3 == 0) {
                motor1.matikanMotor(true);
                motor1.info();
                spdMotor(motor);
            } else if (motor3 == 1) {
                motor1.matikanMotor(false);
                motor1.info();
                spdMotor(motor);
            } else if (motor3 == 2) {
                motor1.tambahKecepatanMotor(5);
                motor1.info();
                spdMotor(motor);
            } else if (motor3 == 3) {
                motor1.kurangiKecepatanMotor(5);
                motor1.info();
                spdMotor(motor);
            } else if (motor3 == 4) {
                menuPilihan();
            } else {
                spdMotor(motor);
            }
        }
        static void menuPilihan() {
            System.out.println("Pilih Sepeda Motor");
            for (int i = 0; i < motor2.length; i++) {
                System.out.println((i + 1) + " " + motor2[i].merk);
            }
            System.out.print("😸 Nomor 1 - 4: ");
            int pilihan = userInput.nextInt();
            switch (pilihan) {
                case 1:
                    spdMotor(motor2[0].merk);
                    break;
                case 2:
                    spdMotor(motor2[1].merk);
                    break;
                case 3:
                    spdMotor(motor2[2].merk);
                    break;
                case 4:
                    spdMotor(motor2[3].merk);
                    break;
                default:
                    System.out.println("Maaf nomor yang dimasukkan salah");
            }
        }
    }
