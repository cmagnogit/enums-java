public enum Continent {
    AFRICA(1580000000,30370000),
    AMERICA(1050000000,42549000),
    ASIA(4860000000L,44580000),
    EUROPE(743000000, 10530751),
    OCEANIA(47000000,8500000);

    private long population;
    private double surface;

    // constructor
    Continent(long population, double surface) {
        this.population = population;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "population=" + this.population +
                ", surface=" + this.surface;

    }

    public double populationDensity() {
        return this.population/this.surface;
    }
}
