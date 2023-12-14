package isc;

import java.util.Stack;

public class day67 {
    public static void main(String[] args) {
        // Hari ke 67 dari 100 hari
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        System.out.println("ditambah: 10");

        stack.push(20);
        System.out.println("ditambah: 20");

        stack.push(30);
        System.out.println("ditambah: 30");
        
        System.out.println("Element di dalam stack:");

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        if (!stack.isEmpty()) {
            int hapus = stack.pop();
            System.out.println("element yang di hapus dan dikembalikan nilainya: " + hapus);
        } else {
            System.out.println("Stack kosong. tidak dapat menghapus.");
        }

    }
    
}
