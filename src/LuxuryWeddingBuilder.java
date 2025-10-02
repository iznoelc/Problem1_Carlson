public class LuxuryWeddingBuilder implements WeddingPackageBuilder {
    // All setters set the attributes for the luxury wedding (i.e. catering, decor, etc.)
    // See WeddingPackageBuilder interface for my more in-depth java docs comments.

    private WeddingPackage wedding = new LuxuryWedding();

    public LuxuryWeddingBuilder(WeddingPackage wedding){
        this.wedding = wedding;
    }

    @Override
    public void setVenueDetails() {
        wedding.venue.setVenueName("Grand Palace");
    }

    @Override
    public void setCateringDetails() {
        wedding.catering.setMenuType("Gourmet Buffet");
    }

    @Override
    public void setPhotographyDetails() {
        wedding.photography.setPhotographyType("Professional Photographer");
    }

    @Override
    public void setDecorDetails() {
        wedding.decorations.setTypeOfFlowers("Elegant Flowers");
    }

    @Override
    public WeddingPackage getWeddingPackage() {
        return this.wedding;
    }
}
