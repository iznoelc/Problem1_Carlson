public class WeddingPackageDirector {
    private WeddingPackageBuilder builder; // the builder that will be used to build the wedding

    /**
     * Constructor to initialize the director so it knows what type of wedding it will build.
     * @param builder, the builder to give instruction on what wedding package to build.
     */
    public WeddingPackageDirector(WeddingPackageBuilder builder){
        this.builder = builder;
    }

    /**
     * Construct the wedding according to the builder.
     * @return WeddingPackage, the constructed wedding.
     */
    public WeddingPackage constructWedding(){
        builder.setCateringDetails();
        builder.setDecorDetails();
        builder.setPhotographyDetails();
        builder.setVenueDetails();
        return builder.getWeddingPackage();
    }
}
