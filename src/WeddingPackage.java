import WeddingAttributes.Catering;
import WeddingAttributes.Decorations;
import WeddingAttributes.Photography;
import WeddingAttributes.Venue;

public abstract class WeddingPackage {
    protected Catering catering;
    protected Decorations decorations;
    protected Photography photography;
    protected Venue venue;

    public WeddingPackage(){
        this.catering = new Catering();
        this.decorations = new Decorations();
        this.photography = new Photography();
        this.venue = new Venue();
    }

    public Catering getCatering() { return catering; }
    public Decorations getDecorations() { return decorations; }
    public Photography getPhotography() { return photography; }
    public Venue getVenue() { return venue; }

    public abstract void printWeddingInfo();
}
