package soal3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> studentList = new ArrayList<>();

        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String studentID = scanner.nextLine();

                    boolean idExists = false;
                    for (Student s : studentList) {
                        if (s.getStudentID().equals(studentID)) {
                            idExists = true;
                            break;
                        }
                    }

                    if (idExists) {
                        System.out.println("Mahasiswa dengan NIM " + studentID + " sudah ada. Data tidak ditambahkan.");
                    } else {
                        studentList.add(new Student(name, studentID));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String idToDelete = scanner.nextLine();

                    boolean removed = false;
                    Iterator<Student> iterator = studentList.iterator();
                    while (iterator.hasNext()) {
                        Student s = iterator.next();
                        if (s.getStudentID().equals(idToDelete)) {
                            iterator.remove();
                            removed = true;
                            System.out.println("Mahasiswa dengan NIM " + idToDelete + " dihapus.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Mahasiswa dengan NIM " + idToDelete + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String idToSearch = scanner.nextLine();

                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.getStudentID().equals(idToSearch)) {
                            System.out.println("Data Mahasiswa Ditemukan:");
                            System.out.println("NIM: " + s.getStudentID() + ", Nama: " + s.getName());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + idToSearch + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    if (studentList.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        for (Student s : studentList) {
                            System.out.println("NIM: " + s.getStudentID() + ", Nama: " + s.getName());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}