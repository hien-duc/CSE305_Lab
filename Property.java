// package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Property {
    // Data members
    protected String propertyID;
    protected String description;
    protected double rentalRate;
    protected ArrayList<Property> listProperty = restoreDataFromChar();

    ClassLoader classLoader = getClass().getClassLoader();
    String path = classLoader.getResource("propertyData.txt").toString();

    // contructors
    public Property() {

    }

    public Property(String propertyID, String description, String rentalRate) {
        this.propertyID = propertyID;
        this.description = description;
        this.rentalRate = Double.parseDouble(rentalRate);
    }

    // Methods
    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
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

    public void createfilePropertyDAO() {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File data = new File(path + "\\" + "propertyData.txt");
        if (!data.exists()) {
            try {
                data.createNewFile();
            } catch (IOException ex) {
            }
        }
    }

    public void saveDataByChar(ArrayList<Property> list) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(path + "\\" + "propertyData.txt");
            bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                Property temp = list.get(i);
                String propertyID = temp.getPropertyID();
                String description = temp.getDescription();
                double rentalRate = temp.getRentalRate();

                String line = propertyID + "," + description + "," + String.valueOf(rentalRate);

                bw.write(line);
                bw.newLine();

            }
            bw.flush();

        } catch (Exception ex) {

        } finally {
            try {
                fw.close();
                bw.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ArrayList<Property> restoreDataFromChar() {
        FileReader fr = null;
        BufferedReader br = null;
        String[] temp = new String[4];
        ArrayList<Property> list1 = new ArrayList<>();
        try {
            fr = new FileReader(path + "\\" + "propertyData.txt");
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {

                temp = line.split(",");

                Property property = new Property(temp[0], (temp[1]), (temp[2]));

                list1.add(property);
            }
            br.close();

            return list1;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public Property searchByID(String propertyID) {
        ArrayList<Property> list = restoreDataFromChar();
        for (int i = 0; i < list.size(); i++) {
            Property temp = list.get(i);
            if (temp.getPropertyID().equals(propertyID)) {
                return temp;
            }

        }
        return null;

    }

    public boolean createProperty(Property property) {
        Property propertyTemp = searchByID(property.getPropertyID());
        if (propertyTemp == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateProperty(Property updateProperty) {
        Property propertyTemp = searchByID(updateProperty.getPropertyID());

        if (propertyTemp != null) {
            restoreDataFromChar().set(restoreDataFromChar().indexOf(propertyTemp), updateProperty);
            return true;
        } else {
            return false;
        }
    }

    public void deleteProperty(String id) {
        Property temp = searchByID(id);
        restoreDataFromChar().remove(temp);

    }

    public ArrayList<Property> getListProperty() {
        return restoreDataFromChar();
    }

    public void setListProperty(ArrayList<Property> list) {
        this.listProperty = list;
    }
}
