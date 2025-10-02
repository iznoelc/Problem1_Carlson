public class TraditionalWedding extends WeddingPackage {
    /**
     * Print the information for the traditional wedding to the console.
     */
    @Override
    public void printWeddingInfo() {
        System.out.println("Planning a traditional wedding...");
        System.out.println("----------------------------");
        System.out.println("Venue: " + venue.getVenueName());
        System.out.println("Catering: " + catering.getMenuType());
        System.out.println("Photography: " + photography.getPhotographyType());
        System.out.println("Decorations: " + decorations.getTypeOfFlowers());
        System.out.println("----------------------------");
    }
}
