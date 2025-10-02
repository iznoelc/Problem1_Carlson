import WeddingAttributes.Catering;
import WeddingAttributes.Decorations;
import WeddingAttributes.Photography;
import WeddingAttributes.Venue;

public abstract class WeddingPackage {
    protected Catering catering;
    protected Decorations decorations;
    protected Photography photography;
    protected Venue venue;

    /**
     * Constructor to instantiate all wedding attributes.
     */
    public WeddingPackage(){
        this.catering = new Catering();
        this.decorations = new Decorations();
        this.photography = new Photography();
        this.venue = new Venue();
    }

    /**
     * @return catering, the wedding package's catering information
     */
    public Catering getCatering() { return catering; }

    /**
     * @return decorations, the wedding package's decor information
     */
    public Decorations getDecorations() { return decorations; }
    /**
     * @return photography, the wedding package's photography information
     */
    public Photography getPhotography() { return photography; }

    /**
     * @return the wedding package's venue information
     */
    public Venue getVenue() { return venue; }

    /**
     * Print the information of the wedding (catering, decor, photography, & venue)
     * to the console.
     */
    public abstract void printWeddingInfo();
}
