public class LuxuryWeddingBuilder implements WeddingPackageBuilder {
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
