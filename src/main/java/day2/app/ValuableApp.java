package day2.app;

import day1.model.Guitar;
import day1.model.Panel;
import day2.Catalog;
import day2.Cooker;
import day2.Description;
import day2.Valuable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ValuableApp {
    public static void main(String[] args) {
        // Patrze na obiekty z perspektywy interfejsu czyli tu ich ceny
        // Celem tej listy jest prezentowanie danych innych obiektów
        List<Valuable> products = new ArrayList<>();
        products.add(new Cooker(2000, "Bosh",new BigDecimal("32.1")));
        products.add(new Panel(300,400));
        products.add(new Guitar("Yamaha",true));
        BigDecimal sum = BigDecimal.ZERO;
        for(Valuable product: products) {
            // Sprawdzam czy dana referencja odnosi sie do obiektu klasy Panel
            if (product instanceof Panel) {
                System.out.println(product + " jest instancja klasy Panel");
                // Jawne rzutowanie referencji Valuable na Panel aby dostac wszystkie informacje o obiekcie
                // Jest bezpieczne bo sprawdziłem czy ta referencja product jest instancja obiektu Panel
                Panel panel = (Panel) product;
                System.out.println("Szerokość: " + panel.getWidth());
            }
            if (product instanceof Guitar) {
                Guitar guitar = (Guitar)product;
                System.out.println(guitar.getProducer());
            }
            sum = sum.add(product.price());
        }
        System.out.println("Suma zamówienia: " + sum);
        Cooker cooker = (Cooker) products.get(0);

        if (cooker instanceof Catalog) {
            System.out.println("Kuchenka jest instancja catalog");
        }

        if (cooker instanceof Description) {
            System.out.println("Kuchenka jest instancją description");
        }

        if (cooker instanceof Valuable) {
            System.out.println("Kuchenka jest instancją valuable");
        }

        // instancef powinienem ograniczyc do rozpoznawania rodzaju obiektu

        // KLASA ANONIMOWA
        // chcąc na prędce dodać jakiś obiekt który jeszcze nie jest zedefiniowany w żadnej klasie tylko po to żeby skorzystać
        // z metod zadeklrowanych w interfejsie moge zdefiniowac klase bez nazwy zaraz po Valuable() :
        Valuable sugar = new Valuable() {
            @Override
            public BigDecimal price() {
                return  new BigDecimal("42.1");
            }
        };

        products.add(sugar);

        Catalog tvSet = new Catalog() {
            @Override
            public String describe() {
                return "Telewizor ma 50 cali";
            }

            @Override
            public BigDecimal price() {
                return new BigDecimal(2000);
            }
        };

        System.out.println(tvSet.price() + tvSet.describe());
    }
}
