/**
 a. Create a class named Lease with fields that hold an apartment tenant’s name,
 apartment number, monthly rent amount, and term of the lease in months.
 Include a constructor that initializes the name to “XXX”, the apartment
 number to 0, the rent to 1000, and the term to 12. Also include methods to
 get and set each of the fields. Include a nonstatic method named addPetFee()
 that adds $10 to the monthly rent value and calls a static method named
 explainPetPolicy() that explains the pet fee. Save the class as Lease.java.
 b. Create a class named TestLease whose main() method declares four Lease
 objects. Call a getData() method three times. Within the method, prompt a
 user for values for each field for a Lease, and return a Lease object to the main()
 method where it is assigned to one of main()’s Lease objects. Do not prompt the
 user for values for the fourth Lease object, but let it continue to hold the default
 values. Then, in main(), pass one of the Lease objects to a showValues() method
 that displays the data. Then call the addPetFee() method using the passed Lease
 object and confirm that the fee explanation statement is displayed. Next, call the
 showValues() method for the Lease object again and confirm that the pet fee has
 been added to the rent. Finally, call the showValues() method with each of the
 other three objects; confirm that two hold the values you supplied as input and
 one holds the constructor default values. Save the application as TestLease.java.
 */

public class Lease {

    //Data Fields
  private  String tenantName;
  private  int apartmentNumber, rentAmountPerMonth, termOfLeaseInMonth, addPetFeePlusMonth;

    //Constructor
    public Lease(){
        tenantName = "XXX";
        apartmentNumber = 0;
        rentAmountPerMonth = 1000;
        termOfLeaseInMonth = 12;
        addPetFee();

    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setRentAmountPerMonth(int rentAmountPerMonth) {
        this.rentAmountPerMonth = rentAmountPerMonth;
    }

    public int getRentAmountPerMonth() {
        return rentAmountPerMonth;
    }

    public void setTermOfLeaseInMonth(int termOfLeaseInMonth) {
        this.termOfLeaseInMonth = termOfLeaseInMonth;
    }

    public int getTermOfLeaseInMonth() {
        return termOfLeaseInMonth;
    }

    //Method to add pet fee
    public void addPetFee(){
        addPetFeePlusMonth = rentAmountPerMonth + 10;
        explainPetPolicy();

    }

    //Method to explain the pet Fee

    public static void explainPetPolicy(){
        System.out.println(" NB: A pet fee of $10 has been added to your monthly rent for having a pet");

    }
}


