public class DestinationWeddingBuilder implements WeddingPackageBuilder {
    // All setters set the attributes for the destination wedding (i.e. catering, decor, etc.)
    // See WeddingPackageBuilder interface for my more in-depth java docs comments.

    private WeddingPackage wedding = new DestinationWedding();

    public DestinationWeddingBuilder(WeddingPackage wedding){
        this.wedding = wedding;
    }

    @Override
    public void setVenueDetails() {
        wedding.venue.setVenueName("Abroad in Europe");
    }

    @Override
    public void setCateringDetails() {
        wedding.catering.setMenuType("Europe Sampler");
    }

    @Override
    public void setPhotographyDetails() {
        wedding.photography.setPhotographyType("Travelling Photographer");
    }

    @Override
    public void setDecorDetails() {
        wedding.decorations.setTypeOfFlowers("European Wildflowers");
    }

    @Override
    public WeddingPackage getWeddingPackage() {
        return this.wedding;
    }
}
