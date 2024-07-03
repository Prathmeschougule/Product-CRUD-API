package com.Second.Shop.shop.Model;
// Model -> This is use in application life  cycale 
public class Product {
    private String PName;
    private String Sname;
    private int id;


    public void setId(int id) {
        this.id = id;
    }
    public void setPName(String pName) {
        PName = pName;
    }
    public void setSname(String sname) {
        Sname = sname;
    }
    public int getId() {
        return id;
    }
    public String getPName() {
        return PName;
    }
    
    public String getSname() {
        return Sname;
    }

    
}
