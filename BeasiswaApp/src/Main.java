import beasiswa.BeasiswaMahasiswa;
import beasiswa.BeasiswaPelajar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int category;

        System.out.println("Pendaftaran Beasiswa PT. Benang");

//        choose category beasiswa
        while (true) {
            System.out.println("Terdapat 2 program beasiswa yang dibuka : ");
            System.out.println("1. Beasiswa Pelajar");
            System.out.println("2. Beasiswa Mahasiswa");
            System.out.print("Pilih Beasiswa: ");

            try {
                category = scanner.nextInt();
                if (category == 1 || category == 2) {
                    break;
                }
            }catch (Exception error){
                System.out.println("Error : " + error.getMessage());
                scanner.nextLine();
            }
        }

        String name;
        int age;

        while (true){
            try {
                System.out.println("Form Pendaftaran");
                System.out.print("Masukkan Nama Lengkap : ");
                name = scanner.next();
                System.out.print("Masukkan Usia : ");
                age = scanner.nextInt();
                if(age < 16 || age > 24){
                    throw new IllegalArgumentException("Usia harus diantara 16 - 24");
                }
                 break;
            }catch (Exception error){
                System.out.println("Error : "+ error.getMessage());
                scanner.nextLine();
            }
        }

        Peserta peserta = new Peserta(name, age);

        if (category == 1) {
            BeasiswaPelajar beasiswaPelajar = new BeasiswaPelajar("Beasiswa Pelajar");
            peserta.setBeasiswa(beasiswaPelajar);
        } else if (category == 2) {
            BeasiswaMahasiswa beasiswaMahasiswa = new BeasiswaMahasiswa("Beasiswa Mahasiswa");
            peserta.setBeasiswa(beasiswaMahasiswa);
        }
        // fill all score
        System.out.println("Form Penilaian");
        peserta.setAllScore();

        int choice;
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Tampilkan Hasil Akhir");
            System.out.println("2. Ubah Nilai");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println(peserta.getResult());
            } else if (choice == 2) {
                System.out.println("Ubah Nilai Peserta : ");
                peserta.setAllScore();
            } else if (choice == 3) {
                break;
            }
        }
    }
}
