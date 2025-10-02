public class Client {
    public static void main(String[] args){
        // get the wedding planner instance
        WeddingPlanner weddingPlanner1 = WeddingPlanner.getInstance();

        // plan a luxury wedding
        System.out.println("FROM CLIENT: PLANNING A LUXURY WEDDING");
        weddingPlanner1.planLuxuryWedding();

        // get the wedding planner instance again, but in another variable to verify singleton
        WeddingPlanner weddingPlanner2 = WeddingPlanner.getInstance();

        // plan a destination wedding
        System.out.println("FROM CLIENT: PLANNING A DESTINATION WEDDING");
        weddingPlanner2.planDestinationWedding();

        // ensure instances of wedding planner are the same
        System.out.println("Are both instances the same? " + (weddingPlanner1 == weddingPlanner2));
    }
}
