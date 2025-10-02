public interface WeddingPackageBuilder {
    /**
     * Set the venue details of the wedding package.
     */
    void setVenueDetails();

    /**
     * Set the catering details of the wedding package.
     */
    void setCateringDetails();

    /**
     * Set the photography details of the wedding.
     */
    void setPhotographyDetails();

    /**
     * Set the decoration details of the wedding.
     */
    void setDecorDetails();

    /**
     * Get the wedding package of the built wedding.
     * @return WeddingPackage, the built wedding.
     */
    WeddingPackage getWeddingPackage();
}
