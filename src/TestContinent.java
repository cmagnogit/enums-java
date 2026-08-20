import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class testContinent {
    public static void main(String[] args) {
        List<Continent> continents = new ArrayList<>(Arrays.asList(Continent.values()));
        continents.forEach(c -> System.out.println(c.name() + " ->" + c + ", population density= " +
                c.populationDensity() + "}"));
    }
}
