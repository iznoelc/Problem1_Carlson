public class LuxuryWedding extends WeddingPackage {


    /**
     * Print information of luxury wedding to the console.
     */
    @Override
    public void printWeddingInfo(){
        System.out.println("Planning a luxury wedding...");
        System.out.println("----------------------------");
        System.out.println("Venue: " + venue.getVenueName());
        System.out.println("Catering: " + catering.getMenuType());
        System.out.println("Photography: " + photography.getPhotographyType());
        System.out.println("Decorations: " + decorations.getTypeOfFlowers());
        System.out.println("----------------------------");
    }

    /**
     * Set the default attributes of a luxury wedding.
     */
    @Override
    public void setDefaultAttributes() {
        catering.setMenuType("Gourmet Buffet");
        decorations.setTypeOfFlowers("White Lilies");
        venue.setVenueName("Grand Palace");
        photography.setPhotographyType("Professional Photographer");
    }
}
