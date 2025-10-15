public interface WeddingPackageBuilder {
    /**
     * Set the venue details of the wedding package.
     */
    void setVenueDetails(String venueName);

    /**
     * Set the catering details of the wedding package.
     */
    void setCateringDetails(String cateringDetails);

    /**
     * Set the photography details of the wedding.
     */
    void setPhotographyDetails(String photographyDetails);

    /**
     * Set the decoration details of the wedding.
     */
    void setDecorDetails(String decorDetails);

    /**
     * Get the wedding package of the built wedding.
     * @return WeddingPackage, the built wedding.
     */
    WeddingPackage getWeddingPackage();
}
