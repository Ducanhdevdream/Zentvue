/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Molecule {
    String structure;
    String name;
    String weight;
//constructor rỗng
    public Molecule() {
    }
//constructor đầy đủ thuộc tính
    public Molecule(String structure, String name, String weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }
//    Hàm nhập thông tin
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập structure:");
        structure = sc.nextLine();
        System.out.print("Mời bạn nhập name:");
        name = sc.nextLine();
        System.out.print("Mời bạn nhập weight:");
        weight = sc.nextLine();
}
//Hàm in thông tin
    public void inTT(){
        System.out.println("Structure:" + structure);
        System.out.println("Name:" + name);
        System.out.println("wetght:" + weight);
    }

}
