
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gagan
 */

@ManagedBean(name="obj")
@SessionScoped
public class Product 
{
    private String name;
    private int qty;
    private double price;
    
    public Product(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String add()
    {
        System.out.println("Product Inserted Sucessfully");
        System.out.println(name+" "+qty+" "+ price);
        
        if (qty>10){
            return "Fail";
        }
        return "Success";
    }
    
}
