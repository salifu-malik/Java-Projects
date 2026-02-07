import java.util.Scanner;
public class TestLease {
    public static void main(String[] args) {

        Scanner inputDevice = new Scanner(System.in);

        Lease lease1 = getData(inputDevice);
        Lease lease2 = getData(inputDevice);
        Lease lease3 = getData(inputDevice);
        Lease lease4 = new Lease();

      //Lease 1
        System.out.println("Showing values before adding Pet Fee");
        showValues(lease1);

        //Add pet fee to lease 1
        lease1.addPetFee();

        //Lease 2
        System.out.println("Showing values before adding Pet Fee");
        showValues(lease2);

        //Add pet fee to lease 2
        lease2.addPetFee();



        //Lease 3
        System.out.println("Showing values before adding Pet Fee");
        showValues(lease3);

        //Add pet fee to lease 3
        lease3.addPetFee();

        //Lease 4(Default)
        System.out.println("Showing values before adding Pet Fee");
        showValues(lease4);

        //Add pet fee to lease 1
        lease4.addPetFee();

        inputDevice.close();


    }

//Method to get data from user
public static Lease getData(Scanner inputDevice){
        Lease lease = new Lease();

    System.out.println("Enter tenant's name:");
    lease.setTenantName(inputDevice.nextLine());

    System.out.println("Enter apartment's number:");
    lease.setApartmentNumber(inputDevice.nextInt());

    System.out.println("Enter monthly rent:");
    lease.setRentAmountPerMonth(inputDevice.nextInt());

    System.out.println("Enter lease term in months:");
    lease.setTermOfLeaseInMonth(inputDevice.nextInt());
    inputDevice.nextLine();//Clear buffer


return lease;
}


//Method to show values of all Objects
public static void showValues(Lease lease){
    System.out.println("Tenant Name: " +lease.getTenantName());
    System.out.println("Apartment Number: "+ lease.getApartmentNumber());
    System.out.println("Monthly Rent: "+ lease.getRentAmountPerMonth());
    System.out.println("Lease Term: "+ lease.getTermOfLeaseInMonth() +" months");
}
}
