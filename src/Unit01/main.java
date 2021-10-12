/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01;

import java.util.Scanner;

/**
 *
 * @author BVCN 88
 */
public class main {
    public static void main(String[] args) {
        System.out.print("Bạn muốn nhập thông tin của bao nhiêu người:");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                person arr_NT[] = new person[a];
                for (int i = 0; i < arr_NT.length; i++) {
                    arr_NT[i] = new person();
                    System.out.println("Mời bạn nhập thông tin người thứ "+(i+1)+": ");
                    arr_NT[i].nhapTT();
                }
                System.out.println("+-----+-------------+------------------+-----------");
                    System.out.println("|                    Thông tin                |");
                    System.out.println("+-----+-------------+------------------+-------");
                    System.out.println("| STT |  Tên người  |  Số tuổi  |  Cân nặng  | ");
                    for (int i = 0; i < a; i++) {
                        System.out.printf("|%5s|%17s|%7s|%9s|\n", i + 1, arr_NT[i].getName(), arr_NT[i].getAge(), arr_NT[i].getHeight());
                    }
                    System.out.println("+-----+-------------+------------------+--------");
    }
}
