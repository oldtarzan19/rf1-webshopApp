package application.model;

import java.util.Date;

public class Panasz {

    private int id;
    private int ember_id;
    private String ido;
    private String uzenet;

    private String termek;


    public Panasz() {
    }

    public Panasz(int ember_id, String ido, String uzenet, String termek) {
        this.ember_id = ember_id;
        this.uzenet = uzenet;
        this.ido = ido;
        this.termek = termek;
    }

    public Panasz(int id, int ember_id, String ido, String uzenet, String termek) {
        this.id = id;
        this.ember_id = ember_id;
        this.uzenet = uzenet;
        this.ido = ido;
        this.termek = termek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmber_id() {
        return ember_id;
    }

    public void setEmber_id(int ember_id) {
        this.ember_id = ember_id;
    }

    public String getUzenet() {
        return uzenet;
    }

    public void setUzenet(String uzenet) {
        this.uzenet = uzenet;
    }

    public String getIdo() {
        return ido;
    }

    public void setIdo(String ido) {
        this.ido = ido;
    }

    public String getTermek() {
        return termek;
    }

    public void setTermek(String termek) {
        this.termek = termek;
    }

    @Override
    public String toString() {
        return "Panasz{" +
                "id=" + id +
                ", ember_id=" + ember_id +
                ", ido='" + ido + '\'' +
                ", uzenet='" + uzenet + '\'' +
                ", termek='" + termek + '\'' +
                '}';
    }
}
