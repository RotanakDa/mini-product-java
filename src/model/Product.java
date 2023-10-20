package model;
import utils.RenderTable;

import java.time.LocalDate;
import java.util.Scanner;
public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private int qty;
    private LocalDate date;


    public Product(){}
    public Product(int id, String name, double unitPrice, int qty){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product input(Scanner input){
        System.out.println("Enter Product ID: ");
        id = input.nextInt();
        System.out.println("Enter Product Name : ");
        input.nextLine();
        name = input.nextLine();
        System.out.println("Enter Product UnitPrice : ");
        unitPrice = input.nextDouble();
        System.out.println("Enter Product Qty :");
        qty = input.nextInt();
        date = LocalDate.now();

//        RenderTable.showProductFirst();
//        System.out.println("Are you sure want to add this record? [Y/y] or [N/n]?");

        return this;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitprice='" + unitPrice + '\'' +
                ", qty='" + qty + '\'' +
                ", date='" + date + '\'' +
                '}' +"\n";
    }
}
