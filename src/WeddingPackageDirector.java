public class WeddingPackageDirector {
    private WeddingPackageBuilder builder;

    public WeddingPackageDirector(WeddingPackageBuilder builder){
        this.builder = builder;
    }

    public WeddingPackage constructWedding(){
        builder.setCateringDetails();
        builder.setDecorDetails();
        builder.setPhotographyDetails();
        builder.setVenueDetails();
        return builder.getWeddingPackage();
    }
}
