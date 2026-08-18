class testContinent {
    public static void main(String[] args) {
        Continent[] continents = Continent.values();
        for(Continent c:continents)
            System.out.println(c.name() + " ->" + c + ", population density= "
                    + c.populationDensity() + "}");
    }
}
