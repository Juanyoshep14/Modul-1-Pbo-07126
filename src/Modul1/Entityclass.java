package Modul1;


public class Entityclass {
    String game;
    String nama;
    String notelp;
    String ngame;
    String tanggal;
    int id;

    public Entityclass(String game, String nama, String notelp, String ngame, String tanggal, int id) {
        this.game = game;
        this.nama = nama;
        this.notelp = notelp;
        this.ngame = ngame;
        this.tanggal = tanggal;
        this.id = id;
    }

    Entityclass(String nama, int id, String game, String notelp, String tanggal, String ngame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGame() {
        return game;
    }

    public String getNama() {
        return nama;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getNgame() {
        return ngame;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getId() {
        return id;
    }
}
