package Accidents;

import java.util.Objects;

class Trucks implements Comparable <Trucks>{

    private String companyName;
    private String typeOfAccident;
    private double estimate;

    public Trucks(String companyName, String typeOfAccident, double estimate) {
        this.companyName = companyName;
        this.typeOfAccident = typeOfAccident;
        this.estimate = estimate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTypeOfAccident() {
        return typeOfAccident;
    }

    public double getEstimate() {
        return estimate;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setTypeOfAccident(String typeOfAccident) {
        this.typeOfAccident = typeOfAccident;
    }

    public void setEstimate(double estimate) {
        this.estimate = estimate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trucks trucks = (Trucks) o;
        return Double.compare(trucks.estimate, estimate) == 0 &&
                Objects.equals(companyName, trucks.companyName) &&
                Objects.equals(typeOfAccident, trucks.typeOfAccident);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, typeOfAccident, estimate);
    }


    @Override
    public int compareTo(Trucks o) {
        return (int) (this.estimate - o.estimate);
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "companyName='" + companyName + '\'' +
                ", typeOfAccident='" + typeOfAccident + '\'' +
                ", estimate=" + estimate +
                '}';
    }
}