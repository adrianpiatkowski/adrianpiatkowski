import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Apartament warszawa = new Apartament();
        warszawa.setAdres("Warszawa");
        warszawa.setPrice(771875);
        warszawa.setSurface(150);

        System.out.println(warszawa);

        Apartament krakow = new Apartament();
        krakow.setAdres("Kraków");
        krakow.setPrice(779000);
        krakow.setSurface(180);

        Apartament gdansk = new Apartament();
        gdansk.setSurface(240);
        gdansk.setPrice(855000);
        gdansk.setAdres("Gdańsk");

        warszawa.getFullPrice();
        gdansk.getFullPrice();
        krakow.getFullPrice();

        List<Apartament> apartaments = new ArrayList<Apartament>();
        apartaments.add(warszawa);
        apartaments.add(krakow);
        apartaments.add(gdansk);

        double suma = 0;
        suma += apartaments.stream().mapToDouble(Apartament -> Apartament.price).sum();
        double srednia2 = suma/apartaments.size();
        System.out.format("%.2f%n", srednia2);

        System.out.println(apartaments);
    }
}
