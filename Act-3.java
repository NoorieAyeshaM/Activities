public class MobilePhone 
{
    private String brand;
    private String model;
    private double price;
    public MobilePhone(String brand, String model, double price) 
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }   
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }    
    public void setModel(String model) 
    {
        this.model = model;
    }  
    public void setPrice(double price) 
    {
        this.price = price;
    }   
    public String getBrand() 
    {
        return brand;
    }    
    public String getModel() 
    {
        return model;
    }   
    public double getPrice() 
    {
        return price;
    }    
    public void printDetails() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }   
    public static void main(String[] args) 
   {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 999.99);    
        System.out.println("Initial phone details:");
        phone.printDetails();        
        phone.setPrice(899.99);
        phone.setModel("Galaxy S21 Ultra");      
        System.out.println("\nUpdated phone details:");
        phone.printDetails();
    }
}
