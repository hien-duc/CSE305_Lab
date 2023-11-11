import java.util.ArrayList;

public class property {
    private int propertyID;
    private String description;
    private double rentalRate;

    public property(int propertyID, String description, double rentalRate) {
        this.propertyID = propertyID;
        this.description = description;
        this.rentalRate = rentalRate;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Method to create a new property
    public static property CreateProperty(int propertyID, String description, double rentalRate) {
        return new property(propertyID, description, rentalRate);
    }

    // Method to update property details
    public void UpdateProperty(String description, double rentalRate) {
        this.description = description;
        this.rentalRate = rentalRate;
    }

    // Method to delete a property (not recommended in a real-world scenario)
    public static void DeleteProperty(property property, ArrayList<property> properties) {
        properties.remove(property);
    }
}
