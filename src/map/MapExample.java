package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Country usa = new Country("United States", "USA", 331000000);
        Country uk = new Country("United Kingdom", "UK", 68000000);
        Country canada = new Country("Canada", "CAN", 38000000);
        Country iran = new Country("Iran", "IR", 84614000);
        Country chin = new Country("Chin", "CN", 1444216107);
        Country india = new Country("India", "IN", 1412140100);

        Map<String, Country> countryMap = new HashMap<>();
        countryMap.put(usa.getCountryCode(), usa);
        countryMap.put(uk.getCountryCode(), uk);
        countryMap.put(canada.getCountryCode(), canada);
        countryMap.put(iran.getCountryCode(), iran);
        countryMap.put(chin.getCountryCode(), chin);
        countryMap.put(india.getCountryCode(), india);


        for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
            System.out.println("Abbreviation code: " + entry.getKey() + "\n" + "Country: " + entry.getValue().getName() +
                    ", Code: " + entry.getValue().getCountryCode() +
                    ", Population: " + entry.getValue().getPopulation() + "Abbreviation code: " + entry.getKey());
        }

        Country country = countryMap.get("IR");
        boolean flag = country != null ? true : false;

        if (flag) {
            System.out.println("Country: " + country.getName() +
                    ", Code: " + country.getCountryCode() +
                    ", Population: " + country.getPopulation());
        } else {
            System.out.println("Not exist");
        }
    }
}
