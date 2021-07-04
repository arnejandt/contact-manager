package de.htwberlin;

public class Address {
    private final String street;
    private final String zipCode;
    private final String city;

    public Address(String street, String zipCode, String city) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String toString(){
        return street + " in " + zipCode + city;
    }
}
