public class LuxuryWeddingBuilder implements WeddingPackageBuilder {
    // All setters set the attributes for the luxury wedding (i.e. catering, decor, etc.)
    // See WeddingPackageBuilder interface for my more in-depth java docs comments.

    private WeddingPackage wedding = new LuxuryWedding();

    public LuxuryWeddingBuilder(WeddingPackage wedding){
        this.wedding = wedding;
    }

    @Override
    public void setVenueDetails(String venueName) {
        wedding.venue.setVenueName(venueName);
    }

    @Override
    public void setCateringDetails(String cateringDetails) {
        wedding.catering.setMenuType(cateringDetails);
    }

    @Override
    public void setPhotographyDetails(String photographyDetails) {
        wedding.photography.setPhotographyType(photographyDetails);
    }

    @Override
    public void setDecorDetails(String decorDetails) {
        wedding.decorations.setTypeOfFlowers(decorDetails);
    }

    @Override
    public WeddingPackage getWeddingPackage() {
        return this.wedding;
    }
}
