package application.model;

public class Szallitas {
    int id;
    int vasarlo_id;
    String cim;
    String arucikkek;
    float vegosszeg;

    public Szallitas(){}

    public Szallitas(int id, int vasarlo_id, String cim, String arucikkek, float vegosszeg) {
        this.id = id;
        this.vasarlo_id = vasarlo_id;
        this.cim = cim;
        this.arucikkek = arucikkek;
        this.vegosszeg = vegosszeg;
    }

    public Szallitas(int vasarlo_id, String cim, String arucikkek, float vegosszeg) {
        this.vasarlo_id = vasarlo_id;
        this.cim = cim;
        this.arucikkek = arucikkek;
        this.vegosszeg = vegosszeg;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVasarlo_id() {
        return vasarlo_id;
    }

    public void setVasarlo_id(int vasarlo_id) {
        this.vasarlo_id = vasarlo_id;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getArucikkek() {
        return arucikkek;
    }

    public void setArucikkek(String arucikkek) {
        this.arucikkek = arucikkek;
    }

    public float getVegosszeg() {
        return vegosszeg;
    }

    public void setVegosszeg(float vegosszeg) {
        this.vegosszeg = vegosszeg;
    }




}
