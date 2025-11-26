package praktikum1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// SRP: Mengurus state bersama (shared state) saja.
// DIP: Halaman tidak membuat Scanner sendiri, tapi minta ke AppContext.
public class AppContext {

    // DIP: Scanner disimpan satu kali di context, dishare ke semua halaman.
    private final Scanner scanner;

    // SRP: Menyimpan data hasil scan.
    private String sharedData;

    // SRP: Menyimpan daftar todo.
    private final List<String> todoList;

    public AppContext() {
        // SRP: Inisialisasi seluruh state bersama aplikasi.
        this.scanner = new Scanner(System.in);
        this.sharedData = "Belum ada data yang di-scan.";
        this.todoList = new ArrayList<>();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getSharedData() {
        return sharedData;
    }

    public void setSharedData(String sharedData) {
        // SRP: Perubahan data scan terpusat di sini.
        this.sharedData = sharedData;
    }

    public void addTodo(String todo) {
        // SRP: Menambah todo ke list.
        this.todoList.add(todo);
    }

    public List<String> getTodoList() {
        return todoList;
    }

    public void close() {
        // SRP: Menutup resource yang dimiliki context.
        this.scanner.close();
    }
}