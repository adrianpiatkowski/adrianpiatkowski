import lombok.Data;

@Data
public class Apartament {
     String adres;
     double surface;
     double price;
     double suma;
    public double getFullPrice(){
        return price =  price*0.95 ;
    }


}
