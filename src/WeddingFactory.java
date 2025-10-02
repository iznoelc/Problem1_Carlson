public class WeddingFactory {
    /**
     * Returns an instance of the correct wedding package based on input, throwing an error if the wedding
     * package type is invalid.
     * @param type, the desired package type as a string
     * @return DroneManufacturer, the instantiated manufacturer
     */
    public WeddingPackage createWedding(String type){
        if (type.equalsIgnoreCase("Luxury")){
            return new LuxuryWedding();
        } else if (type.equalsIgnoreCase("Traditional")){
            return new TraditionalWedding();
        } else if (type.equalsIgnoreCase("Destination")){
            return new DestinationWedding();
        } else {
            throw new IllegalArgumentException("Unknown wedding type");
        }
    }
}
