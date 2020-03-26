package main;

import lombok.Data;

@Data
public class Blok extends Budynek {
    int pokje = 20;
    int okna = 30;
    double metry =40;
    int mieszkania = 5;
    boolean garaz = false;
    boolean ogrod  = false;
    boolean silowani = true;
    @Override
    public int liczbaPokoi() {
        return pokje;
    }

    @Override
    public int liczbaOkien() {
        return okna;
    }

    @Override
    public double liczbaMetrow() {
        return metry;
    }

    @Override
    public int liczbaMieszkan() {
        return mieszkania;
    }

    @Override
    public boolean czyJestGaraż() {
        return garaz;
    }

    @Override
    public boolean czyJestOgródek() {
        return ogrod;
    }

    @Override
    public boolean czyJestSilownia() {
        return garaz;
    }
    @Override
    public String toString() {
        return "\n\nBlok posiada pokoi: " +
                liczbaPokoi() +"\nliczbe okien: " + liczbaOkien() + "\nmetrów: " + liczbaMetrow() + "\nliczbe mieszkan: "+ liczbaMieszkan() + "\nczy jest garaż: " + czyJestGaraż() +
                "\nczy jest ogródek: " + czyJestOgródek() + "\nczy jest siłownia: " + czyJestSilownia()
                ;

    }


}