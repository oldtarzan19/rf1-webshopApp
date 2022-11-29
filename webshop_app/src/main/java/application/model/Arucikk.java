package application.model;


public class Arucikk {
    private Integer id;
    private String nev;
    private float ar;
    private float db;

    public Arucikk() {
    }

    public Arucikk(Integer id, String nev, float ar, float db) {
        this.id = id;
        this.nev = nev;
        this.ar = ar;
        this.db = db;
    }

    public Arucikk(String nev, float ar, float db) {
        this.nev = nev;
        this.ar = ar;
        this.db = db;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public float getAr() {
        return ar;
    }

    public void setAr(float ar) {
        this.ar = ar;
    }

    public float getDb() {
        return db;
    }

    public void setDb(float db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "arucikk{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", ar=" + ar +
                ", db=" + db +
                '}';
    }
}
