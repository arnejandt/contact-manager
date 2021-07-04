package de.htwberlin;

public class Contact {

  private final String firstName;
  private final String lastName;
  private final String mobile;
  private final Address address;




  public Contact(String firstName, String lastName, String mobile, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = mobile;
    this.address = address;

  }
  public Contact(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = null;
    this.address = null;

  }

  public Contact(String firstName, String lastName,Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = null;
    this.address = address;

  }

  public Contact(String firstName, String lastName,String mobile) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = mobile;
    this.address = null;

  }

  public String toString(){
    if (address==null&& mobile==null){
      return firstName + lastName + ", n/a, " + " n/a ";
    }

    if (address==null){
      return firstName + lastName + mobile + " n/a";
    }

    if (mobile==null){
      return firstName + lastName + " n/a " + address;
    }

    else {
      return firstName + lastName + mobile + address;
    }

  }


}
