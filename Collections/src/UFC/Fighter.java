package UFC;

class Fighter{

    private String name;
    private String division;
    private int weight;

    public Fighter(String name, String division, int weight) {
        this.name = name;
        this.division = division;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getDivision() {
        return division;
    }

    public int getWeight() {
        return weight;
    }
}