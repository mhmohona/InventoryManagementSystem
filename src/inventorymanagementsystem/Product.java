package inventorymanagementsystem;

/**
 *
 * @author Humayra
 */
public class Product {
    private int id;
    private String name;
    private float price;
    private String addData;
    private byte[] picture;
    
    public Product(int pid, String pname, float pprice, String pAddData, byte[] pimg){
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addData = pAddData;
        this.picture = pimg;
    }

    Product(int aInt, String string, float parseFloat, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }
    
    public String getAddDate(){
        return addData;
    }
    
    public byte[] getImage(){
        return picture;
    }




    
}
