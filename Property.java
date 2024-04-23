public class Property {
    private String propertyID;
    private String description;
    private String propertyOwnerID;

    public Property(String propertyID, String description, String propertyOwnerID) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerID = propertyOwnerID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public String getDescription() {
        return description;
    }

    public String getPropertyOwnerID() {
        return propertyOwnerID;
    }

}
