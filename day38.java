package isc;

import java.util.Scanner;

public class day38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unameBenar = "herawati123";
        String pwBenar = "majene 2023";

        System.out.print("Masukkan username :");
        String username = sc.nextLine();
        System.out.print("Masukkan password :");
        String password = sc.nextLine();

        if (username.equals(unameBenar) && password.equals(pwBenar)) {
            System.out.println("login berhasil");
        } else {
            System.out.println("login gagal");
        }
    }
}
