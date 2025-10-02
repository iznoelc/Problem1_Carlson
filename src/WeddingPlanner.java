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
     * Plans a luxury wedding, and then sets the wedding variable to the
     * luxury wedding it just planned.
     */
    public void planLuxuryWedding(){
        WeddingFactory weddingFactory = new WeddingFactory();
        wedding = weddingFactory.createWedding("luxury");

        WeddingPackageBuilder builder = new LuxuryWeddingBuilder(wedding);
        WeddingPackageDirector weddingDirector = new WeddingPackageDirector(builder);
        weddingDirector.constructWedding();

        wedding.printWeddingInfo();
    }

    /**
     * Plans a traditional wedding, and then sets the wedding variable to the
     * traditional wedding it just planned.
     */
    public void planTraditionalWedding(){
        WeddingFactory weddingFactory = new WeddingFactory();
        wedding = weddingFactory.createWedding("traditional");

        WeddingPackageBuilder builder = new TraditionalWeddingBuilder(wedding);
        WeddingPackageDirector weddingDirector = new WeddingPackageDirector(builder);
        weddingDirector.constructWedding();

        wedding.printWeddingInfo();
    }

    /**
     * Plans a destination wedding, and then sets the wedding variable to the
     * destination wedding it just planned.
     */
    public void planDestinationWedding(){
        WeddingFactory weddingFactory = new WeddingFactory();
        wedding = weddingFactory.createWedding("destination");

        WeddingPackageBuilder builder = new DestinationWeddingBuilder(wedding);
        WeddingPackageDirector weddingDirector = new WeddingPackageDirector(builder);
        weddingDirector.constructWedding();

        wedding.printWeddingInfo();
    }
}
