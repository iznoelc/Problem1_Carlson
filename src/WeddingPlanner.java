import java.util.Scanner;

public class WeddingPlanner {
    // static instance because we only want one wedding planner & initialize it as null
    private static WeddingPlanner instance = null;

    // the wedding that will be planned
    private WeddingPackage wedding;

    // private constructor
    private WeddingPlanner(){ System.out.println("Wedding planner instance created."); }

    public static WeddingPlanner getInstance(){
        // return the singleton instance, creating the instance if it does not already
        // exist. (thread safe)
        if (instance == null){
            synchronized (WeddingPlanner.class){
                if (instance == null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new WeddingPlanner();
                }
            }
        }
        return instance;
    }

    /**
     * Plans a wedding by creating the wedding based on the type using the weddingFactory, and then returning the correct
     * type of builder to build this wedding.
     * @param type, the desired wedding type
     * @return the correct builder to build the wedding.
     */
    public WeddingPackageBuilder planWedding(String type){
        WeddingFactory weddingFactory = new WeddingFactory();
        wedding = weddingFactory.createWedding(type);

        if (type.equalsIgnoreCase("Luxury")){
            return new LuxuryWeddingBuilder(wedding);
        } else if (type.equalsIgnoreCase("Destination")){
            return new DestinationWeddingBuilder(wedding);
        } else if (type.equalsIgnoreCase("Traditional")){
            return new TraditionalWeddingBuilder(wedding);
        } else {
            throw new IllegalArgumentException("Unknown wedding type");
        }
    }

    /**
     * Builds the wedding according to user specification
     * @param builder, determined by planWedding to get the specific builder for desired wedding type.
     * @return the completed weddingPackage.
     */
    public WeddingPackage buildWedding(WeddingPackageBuilder builder){
        // preemptively set the default attributes
        wedding.setDefaultAttributes();
        Scanner scnr = new Scanner(System.in);
        String input;

        // get user input for all attributes, where user can choose the specific wedding's default option
        // if they don't want to specify.
        System.out.println("Customize your wedding (Enter \"D\" to choose our default option): ");

        System.out.println("Enter the name of the venue you want: ");
        input = scnr.nextLine();
        if (!input.equalsIgnoreCase("D")){
            builder.setVenueDetails(input);
        }

        System.out.println("Enter the type of catering you want: ");
        input = scnr.nextLine();
        if (!input.equalsIgnoreCase("D")){
            builder.setCateringDetails(input);
        }

        System.out.println("Enter the type of flowers you want: ");
        input = scnr.nextLine();
        if (!input.equalsIgnoreCase("D")){
            builder.setDecorDetails(input);
        }

        System.out.println("Enter the photographer you want: ");
        input = scnr.nextLine();
        if (!input.equalsIgnoreCase("D")){
            builder.setPhotographyDetails(input);
        }

        // return the completed built wedding
        return wedding;
    }
}
