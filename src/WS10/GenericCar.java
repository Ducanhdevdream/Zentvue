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
public class GenericCar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input choice!");
    int n = sc.nextInt();
//	1_Add: add new item of T to a
//	2_Display: display all items of a
//	3_getSize: return the number item of a
//	4_checkEmpty: check and return whether a is empty or not
//	5_delete(intpos): remove the item at the position pos of a. 

        System.out.print("Input new Item:");
        int a = sc.nextInt();
        Car arr_car[] = new Car[a];
        switch (n) {
            case 1:              
                for (int i = 0; i < arr_car.length; i++) {
                    arr_car[i] = new Car();
                    System.out.println("Input info of car "+(i+1)+": ");
                    arr_car[i].nhapTT();
                }
                
                break;
                case 2:    
                System.out.println("| STT |      Name     |      price     |     Production    |    Properly    |");
                for (int i = 0; i < a; i++) {
                        System.out.printf("|%5s|%10s|%10s|%10s|%10s|\n", i + 1,arr_car[i].getName(),arr_car[i].getPrice(),arr_car[i].getProduction(),arr_car[i].getProperly());
                    }
                break;
                case 3:    
                    System.out.println("The number item of a"+a);
                break;
                case 4:    
//                   if(ar) {
//                        
//                    }
                break;
            default:
                throw new AssertionError();
        }
    }
}
