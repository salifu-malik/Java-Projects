import java.util.Scanner;
public class ElectionStatistics {
    public static void main(String[] args) {
        String  partyName1, partyName2, partyName3;
        int numOfVotes_PartyName1, numOfVotes_PartyName2, numOfVotes_PartyName3, totalVotes;
        float percentPartName1, percentPartName2, percentPartName3;


        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter The name of the fist party:");
        partyName1 = inputDevice.nextLine();

        System.out.println("Enter The name of the second party:");
        partyName2 = inputDevice.nextLine();

        System.out.println("Enter The name of the third party:");
        partyName3 = inputDevice.nextLine();


        System.out.println("Enter the number of votes of the first party:");
        numOfVotes_PartyName1 = inputDevice.nextInt();

        System.out.println("Enter the number of votes of the second party:");
        numOfVotes_PartyName2 = inputDevice.nextInt();

        System.out.println("Enter the number of votes of the third party:");
        numOfVotes_PartyName3 = inputDevice.nextInt();

        totalVotes = numOfVotes_PartyName1 + numOfVotes_PartyName2 + numOfVotes_PartyName3;

        percentPartName1 = (float)  (numOfVotes_PartyName1 * 100) / totalVotes;
        percentPartName2 =(float) (numOfVotes_PartyName2  * 100)/ totalVotes;
        percentPartName3 = (float) (numOfVotes_PartyName3 * 100) / totalVotes;

        System.out.println(" The total vote cast for "+ partyName1+ " is " + numOfVotes_PartyName1+" which is equivalent to "+ percentPartName1+ "%.");
        System.out.println(" The total vote cast for "+ partyName2+ " is " + numOfVotes_PartyName2+" which is equivalent to "+ percentPartName2+ "%.");
        System.out.println(" The total vote cast for "+ partyName3+ " is " + numOfVotes_PartyName3+" which is equivalent to "+ percentPartName3+ "%.");






    }
}
