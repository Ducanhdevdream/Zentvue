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
public class Ex01 {
    public String chuanHoaKhoangTrang(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");  // Chú ý: Để dùng replaceAll chúng ta dùng biểu thức chính quy và ở đây \\s+ đại diện cho khoảng trắng space
        return str;
    }

    public String chuanHoaVietHoa(String str) {
        str = chuanHoaKhoangTrang(str);
        String arr[] = str.split(" ");
        str = "";
        for (int i = 0; i < arr.length; i++) {
            str += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
            if (i < arr.length - 1) {
                str += " ";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        str = input.nextLine();
        Ex01 chuanhoa = new Ex01();
        String str1 = chuanhoa.chuanHoaVietHoa(str);
        String arr[] = str1.split(" ");
        System.out.println("Họ: " + arr[0]); //Họ luôn là mảng đầu tiên
        String dem = "";
        for (int i = 1; i <= arr.length - 2; i++) {  //Tên đệm có thể có hoặc không và nằm trong khoảng từ 1 đến length-2
            dem = dem + arr[i] + " ";
        }
        if (dem == "") {
            System.out.println("Đệm: Không có tên đệm");
        } else {
            System.out.println("Đệm: " + dem);
        }
        System.out.println("Tên: " + arr[arr.length - 1]); //Tên luôn là mảng cuối cùng.

    }
}

