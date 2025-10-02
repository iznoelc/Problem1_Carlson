public class TraditionalWeddingBuilder implements WeddingPackageBuilder {
    private WeddingPackage wedding = new TraditionalWedding();

    public TraditionalWeddingBuilder(WeddingPackage wedding){
        this.wedding = wedding;
    }

    @Override
    public void setVenueDetails() {
        wedding.venue.setVenueName("Country Club");
    }

    @Override
    public void setCateringDetails() {
        wedding.catering.setMenuType("Classic Buffet");
    }

    @Override
    public void setPhotographyDetails() {
        wedding.photography.setPhotographyType("Local Photographer");
    }

    @Override
    public void setDecorDetails() {
        wedding.decorations.setTypeOfFlowers("Classic Roses");
    }

    @Override
    public WeddingPackage getWeddingPackage() {
        return this.wedding;
    }
}
