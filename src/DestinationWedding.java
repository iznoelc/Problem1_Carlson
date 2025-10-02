public class DestinationWedding extends WeddingPackage {
    /**
     * Print wedding information of the destination wedding.
     */
    @Override
    public void printWeddingInfo() {
        System.out.println("Planning a destination wedding...");
        System.out.println("----------------------------");
        System.out.println("Venue: " + venue.getVenueName());
        System.out.println("Catering: " + catering.getMenuType());
        System.out.println("Photography: " + photography.getPhotographyType());
        System.out.println("Decorations: " + decorations.getTypeOfFlowers());
        System.out.println("----------------------------");
    }
}
