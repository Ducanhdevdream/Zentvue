/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS10;

import java.util.Scanner;

/**
 *
 * @author BVCN 88
 */
public class Car {
    private String name ;
    private String price;
    private String production;
    private String properly;

    public Car() {
    }

    public Car(String name, String price, String production, String properly) {
        this.name = name;
        this.price = price;
        this.production = production;
        this.properly = properly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getProperly() {
        return properly;
    }

    public void setProperly(String properly) {
        this.properly = properly;
    }
    
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Name: ");
        name= sc.nextLine();
        System.out.print("Input Price:");
        price= sc.nextLine();
        System.out.print("Input production:");
        production= sc.nextLine();
        System.out.print("Input Properly:");
        properly= sc.nextLine();
        
       }
        public void intTT() {
        System.out.println("Name:" + name);
        System.out.println("Price:" + price);
        System.out.println("production:" + production);
        System.out.println("Properly:" + properly);
        
        }
}
