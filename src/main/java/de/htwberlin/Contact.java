package de.htwberlin;

public class Contact {

  private final String firstName;
  private final String lastName;
  private final String mobile;
  private final String street;
  private final String zipCode;
  private final String city;

  public Contact(String firstName, String lastName, String mobile, String street, String zipCode, String city) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = mobile;
    this.street = street;
    this.zipCode = zipCode;
    this.city = city;
  }
}
