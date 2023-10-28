import java.util.ArrayList;

public class Equality {
    public static void main(String[] args) {

        CityEquality paris = new CityEquality("Paris", 2161000);
        CityEquality copy = new CityEquality(paris);      // reference bir xil qiymat yangilansa yoki qo'shilsa muammo bo'ladi!!

        CityEquality local = paris;
        boolean checkResult2 = local.equals(paris);
        System.out.println(checkResult2);                // natija true sababi biz yangi object yartamasdan copy ni parisga tenglab qo'ydik!

        boolean checkResult = paris.equals(copy);
        System.out.println(checkResult);                // natija false sababi bu holatda reference har xil!!

        System.out.println(paris.equals(copy));
        copy.setPopulation(2059003);
        paris.setPopulation(3129003);

        ArrayList<CityEquality> cities = new ArrayList<>();
        cities.add(new CityEquality("Paris", 2161000));
        cities.add(new CityEquality("Florence", 382258));
        cities.add(new CityEquality("Venice", 261905));
        cities.add(new CityEquality("Versailles", 85771));
        cities.add(new CityEquality("London", 8982000));
        
        System.out.println(cities.contains(paris));
    }

}