
package collegepeopleproject;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNum;
    
    Scanner scan = new Scanner(System.in);
    
    public Person() {
        System.out.println("Enter first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter last name: ");
        lastName = scan.nextLine();
        System.out.println("Enter street address: ");
        address = scan.nextLine();
        System.out.println("Enter city: ");
        city = scan.nextLine();
        System.out.println("Enter state: ");
        state = scan.nextLine();
        System.out.println("Enter area zipcode: ");
        zipcode = scan.nextLine();
        System.out.println("Enter cell phone number: ");
        phoneNum = scan.nextLine();                
    }
    
    public void printPersonInfo() {
        System.out.printf("Name: %s, %s\n", lastName, firstName);
        System.out.printf("Current Address :\n    %s\n    %s, %s %s", address, city, state, zipcode);
        System.out.printf("Phone Number: %s", phoneNum);
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
    
}
