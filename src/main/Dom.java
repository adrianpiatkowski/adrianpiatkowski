package main;

public class Dom extends Budynek {
    int pokje = 5;
    int okna = 10;
    double metry =140;
    int mieszkania = 1;
    boolean garaz = true;
    boolean ogrod  = true;
    boolean silowani = false;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

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
        return silowani;
    }
    @Override
    public String toString() {
        return "\n\nDom posiada pokoi: " +
                liczbaPokoi() +"\nliczbe okien: " + liczbaOkien() + "\nmetrów: " + liczbaMetrow() + "\nliczbe mieszkan: "+ liczbaMieszkan() + "\nczy jest garaż: " + czyJestGaraż() +
                "\nczy jest ogródek: " + czyJestOgródek() + "\nczy jest siłownia: " + czyJestSilownia()
                ;

    }
}