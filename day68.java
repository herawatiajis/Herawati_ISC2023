package isc;

import java.util.Stack;

public class day68 {
    public static void main(String[] args) {
        // Hari ke 68 dari 100 hari
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
        System.out.println("Elemen paling atas (peek): " + stack.peek());

        System.out.println("Apakah stack kosong? " + stack.empty());
        int cari = 20;
        int posisi = stack.search(cari);

        if (posisi != -1) {
            System.out.println("Elemen " + cari + " ditemukan pada posisi " + posisi + " dari atas.");
        } else {
            System.out.println("Elemen " + cari + " tidak ditemukan dalam stack.");
        }
    }
    
}
