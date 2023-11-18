// package main;

import java.util.ArrayList;

public class PropertyOwner extends User {

    // Data members
    private double totalPropertyValue;
    private Property property = new Property();
    private ArrayList<Property> ownedProperties = property.restoreDataFromChar();

    // Constructors
    public PropertyOwner() {

    }

    public PropertyOwner(String userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public double getTotalPropertyValue() {
        return totalPropertyValue;
    }

    public void setTotalPropertyValue(double totalPropertyValue) {
        this.totalPropertyValue = totalPropertyValue;
    }

    public ArrayList<Property> getOwnedProperties() {
        return ownedProperties;
    }

    public void setOwnedProperties(ArrayList<Property> ownedProperties) {
        this.ownedProperties = ownedProperties;
    }

    // Methods
    public ArrayList<Property> ListProperty() {
        return ownedProperties;
    }

    public boolean CreateProperty(String propertyID, String description, String rentalRate) {
        Property newProperty = new Property(propertyID, description, rentalRate);
        if (property.createProperty(newProperty)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean UpdateProperty(Property updateProperty) {
        if (property.updateProperty(updateProperty)) {
            return true;
        } else {
            return false;
        }
    }

    public void DeleteProperty(String id) {
        property.deleteProperty(id);

    }

}
