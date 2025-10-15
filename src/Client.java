import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        WeddingPackage wedding1, wedding2; // weddings to be planned

        // make two wedding planner variables so we can demonstrate singleton is working
        WeddingPlanner weddingPlanner1, weddingPlanner2;

        Scanner scnr = new Scanner(System.in);
        String type;

        // get the wedding planner instance
        weddingPlanner1 = WeddingPlanner.getInstance();

        System.out.println("---PLANNING FIRST WEDDING---");
        // get type of wedding that the user wants
        System.out.println("What type of wedding do you want to plan? (luxury, destination, traditional)");
        type = scnr.nextLine();

        wedding1 = weddingPlanner1.buildWedding(weddingPlanner1.planWedding(type));
        wedding1.printWeddingInfo();

        // get the wedding planner instance again, but in another variable to verify singleton
        weddingPlanner2 = WeddingPlanner.getInstance();

        // get the wedding planner instance
        weddingPlanner1 = WeddingPlanner.getInstance();

        System.out.println("---PLANNING SECOND WEDDING---");
        // get type of wedding that the user wants
        System.out.println("What type of wedding do you want to plan? (luxury, destination, traditional)");
        type = scnr.nextLine();

        wedding2 = weddingPlanner1.buildWedding(weddingPlanner2.planWedding(type));
        wedding2.printWeddingInfo();

        // ensure instances of wedding planner are the same
        System.out.println("Are both instances the same? " + (weddingPlanner1 == weddingPlanner2));
    }
}
