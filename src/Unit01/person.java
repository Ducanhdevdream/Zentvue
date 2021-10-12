/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01;

import java.util.Scanner;
/**
 *
 * @author Puppy Nguyen
 */

public class person {
    int age;
    String Name;
    float height;

    public person() {
    }

    public person(int age, String Name, float height) {
        this.age = age;
        this.Name = Name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập Tên : ");
        Name = sc.nextLine();
        System.out.print("Mời bạn nhập tuổi : ");
        age = sc.nextInt();
        System.out.print("Mời bạn nhập cân nặng: ");
        height = sc.nextFloat();
        

    }

    public void intTT() {
        System.out.println("Tên: " + Name);
        System.out.println("Tuổi: " + age);
        System.out.println("Cân nặng: " + height);

    }
    
   
    
}

