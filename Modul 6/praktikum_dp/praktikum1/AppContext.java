package praktikum1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// SRP: Menyimpan state bersama (Scanner, sharedData, todoList).
public class AppContext {

    private final Scanner scanner;
    private String sharedData;
    private final List<String> todoList;

    public AppContext() {
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
        this.sharedData = sharedData;
    }

    public void addTodo(String todo) {
        this.todoList.add(todo);
    }

    public List<String> getTodoList() {
        return todoList;
    }

    public void close() {
        this.scanner.close();
    }
}
