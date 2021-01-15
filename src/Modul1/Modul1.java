package Modul1;

import java.util.ArrayList;
import java.util.Scanner;


    

public class Modul1 {
    
   static ArrayList<Entityclass> arrGame = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    Entityclass g;
    int menu, id;
    String nama, game, notelp, tanggal, ngame;
    
    public Modul1 () {
        do {
            System.out.println("Selamat Datang !!!");
            System.out.println("1. Pembelian");
            System.out.println("2. View");
            System.out.println("3. Edit");
            System.out.println("4. Remove");
            System.out.print("Pilih Menu = ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1) {
                System.out.println("Menu Pembelian !!!");
                System.out.print("Masukkan Nama  = ");
                nama = input.nextLine();
                System.out.print("Masukkan Id    = ");
                id = input.nextInt();
                System.out.println("Pilih Game = [GTA V || CS Go || NFS Payback]");
                do {
                    game = input.nextLine();
                } while (!game.equals("GTA V") && !game.equals("NFS Payback") && !game.equals("CS Go"));
                System.out.print("Masukkan NoTelp = ");
                notelp = input.nextLine();
                System.out.print("Masukkan Tanggal [DD/MM/YYYY] = ");
                tanggal = input.nextLine();

                g = new Entityclass(nama, id, game, notelp, tanggal, ngame);
                arrGame.add(g);
            }
            if (menu == 2) {
                if (arrGame.size() == 0) {
                    System.out.println("Tidak Ada Data !!!");
                    input.nextLine();
                } else {
                    viewdata();
                    input.nextLine();
                }
            }
            if (menu == 3) {
                System.out.print("Masukkan Nama = ");
                nama = input.nextLine();
                System.out.print("Masukkan Game Baru [GTA V || CS Go || NFS Payback] = ");
                ngame = input.nextLine();
                update(nama, ngame);
            }
            if (menu == 4) {
                if (arrGame.size() == 0) {
                    System.out.println("Tidak Ada Data !!!");
                }
                viewdata();
                System.out.print("Masukkan Nama yang Ingin Di Hapus = ");
                nama = input.nextLine();
                int index = 0;
                int flag = 0;
                for (Entityclass g : arrGame) {
                    if (g.getNama().equals(nama)) {
                        flag = 1;
                        arrGame.remove(index);
                        break;
                    }
                    index++;
                }
                if (flag == 0) {
                    System.out.println("Data Tidak Ditemukan");
                    input.nextLine();
                }

            }

        } while (menu != 5);
    }

    public static void main(String[] args) {
        new Modul1();
    }

    private void viewdata() {
        System.out.println("\tData Pembeli");
        System.out.println("========================");
        for (Entityclass g : arrGame) {
            System.out.println("Id = " + g.getId());
            System.out.println("Nama = " + g.getNama());
            System.out.println("Game = " + g.getGame());
            System.out.println("Notelp = " + g.getNotelp());
            System.out.println("Tanggal = " + g.getTanggal());
        }
    }

    private void update(String nama, String ngame) {
        if (cari(nama) != -1) {
            arrGame.get(cari(nama)).game = ngame;
        }
    }

    private int cari(String nama) {
        int index = -1;
        for (int i = 0; i < arrGame.size(); i++) {
            if (nama.equals(arrGame.get(i).nama)) {
                index = i;
            }
        }
        return index;
    }

}
    
