package application.model;


public class Kosar {
    private int kosarId;
    private float osszAr = 0;
    private int arucikkDarabInKosar = 0;
    private Arucikk[] arucikkek;
    private int[] arucikkekDarab;
    private int userId;


    public Kosar() {
    }

    public Kosar (int kosarId, float ossszAr, int arucikkDarabInKosar, Arucikk[] arucikkek, int[] arucikkekDarab, int userId) {
        this.kosarId = kosarId;
        this.osszAr = ossszAr;
        this.arucikkDarabInKosar = arucikkDarabInKosar;
        this.arucikkek = arucikkek;
        this.arucikkekDarab = arucikkekDarab;
        this.userId = userId;
    }

    public Kosar (float ossszAr, int arucikkDarabInKosar, Arucikk[] arucikkek, int[] arucikkekDarab, int userId) {
        this.osszAr = ossszAr;
        this.arucikkDarabInKosar = arucikkDarabInKosar;
        this.arucikkek = arucikkek;
        this.arucikkekDarab = arucikkekDarab;
        this.userId = userId;
    }

    public Kosar (Arucikk[] arucikkek, int[] arucikkekDarab, int userId) {
        this.arucikkek = arucikkek;
        this.arucikkekDarab = arucikkekDarab;
        this.userId = userId;
        this.osszAr = 0;
        this.arucikkDarabInKosar = 0;
        for (int i = 0; i < arucikkek.length; i++) {
            this.osszAr += arucikkek[i].getAr()*arucikkekDarab[i];
            arucikkDarabInKosar++;
        }
    }

    public Kosar (int kosarId, Arucikk[] arucikkek, int[] arucikkekDarab, int userId) {
        this.kosarId = kosarId;
        this.arucikkek = arucikkek;
        this.arucikkekDarab = arucikkekDarab;
        this.userId = userId;
        this.osszAr = 0;
        this.arucikkDarabInKosar = 0;
        for (int i = 0; i < arucikkek.length; i++) {
            this.osszAr += arucikkek[i].getAr()*arucikkekDarab[i];
            arucikkDarabInKosar++;
        }
    }


    //Getterek es setterek

    public float getOsszAr() {
        this.osszAr = 0;
        for (int i = 0; i < arucikkDarabInKosar; i++) {
            this.osszAr += arucikkek[i].getAr()*arucikkekDarab[i];
        }
        return osszAr;
    }

    public int getArucikkDarabInKosar() {
        return arucikkDarabInKosar;
    }

    public int getUserId() {
        return userId;
    }

    public String termekListazas() {
        String stringKosarTartalom = "";
        for (int i = 0; i < this.arucikkDarabInKosar; i++) {
            if (i == this.getArucikkDarabInKosar()-1) {
                stringKosarTartalom += this.arucikkek[i].getNev() + ", " + this.arucikkek[i].getDb();
            } else {
                stringKosarTartalom += this.arucikkek[i].getNev() + ", " + this.arucikkek[i].getDb() + ", ";
            }
        }
        return stringKosarTartalom;
    }


    @Override
    public String toString() {
        String stringKosarTartalom = "";
        for (int i = 0; i < arucikkDarabInKosar; i++) {
            stringKosarTartalom += arucikkek[i].getNev() + ", " + arucikkek[i].getAr() + ", " + arucikkekDarab[i] + ", ";
        }
        return "Kosar{" +
                "kosarId=" + kosarId +
                ", userId=" + userId +
                ", osszAr=" + osszAr +
                ", arucikkDarabInKosar=" + arucikkDarabInKosar +
                ", kosarTartalma=" + stringKosarTartalom;
    }

}
