package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Objects;

public class Inventory {

    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();


    //  method for adding a new part to the allParts list
    public static void addPart(Part part){

        allParts.add(part);

    }

    //  method for adding a new product to the all Products list
    public static void addProduct(Product product){

        allProducts.add(product);

    }

    public Part lookupPart(int partId){
        for(Part p : allParts){
            //check if part meets criteria if partId
            if (p.getId() == partId){
                return p;
            }
        }
        return null;
    }
    public Product lookupProduct(int productId){
        for(Product p : allProducts){
            //check if product meets criteria if partId
            if (p.getId() == productId){
                return p;
            }
        }
        return null;
    }
    public Part lookupPart(String name){
        for(Part p : allParts){
            //check if part meets criteria if partId
            if (Objects.equals(p.getName(), name)){
                return p;
            }
        }
        return null;
    }
    public Product lookupProduct(String name){
        for(Product p : allProducts){
            //check if part meets criteria if name
            if (Objects.equals(p.getName(), name)){
                return p;
            }
        }
        return null;
    }
    public void updatePart(int index, Part selectedPart){

        //  figure this one out
        //  I am updating the part with this one...
        //  take the part at index and update its info with the selected part info?
        //  no.,.. because the selectedPart is the part that is highlighted from
        //  the list when you click the modify button.
        //  So does that mean that the index is just the number in the list itself?
        //  Why would you need to know that if you already identified the selectedPart?
        //  unless... the index isn't for identifying it. the index is for updating the part information.
        //  Yeah! everything else changes, but the index will stay the same.
        //  so it's like an anchor, so to speak!
        //


    }

    public void updateProduct(int index, Part selectedProduct){
        //Do the updatePart first and then model this after it.
    }
    public boolean deletePart(Part selectedPart){
        return true;
    }
    public boolean deleteProduct(Part selectedProduct){
        return true;
    }
    public static ObservableList<Part> getAllParts(){
    return allParts;
    }
    public static ObservableList<Product> getAllProducts(){
        return allProducts;
    }


}
