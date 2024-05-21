/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuongnp.mathutil.core;

/**
 *
 * @author phucu
 */
public class MathUtil {

    //Trong class này cũng cung cấp cho ai đó nhiều hàm xử lí toán học
    //Clone class Math của JDK
    //Hàm thư viện xài chung cho ai đó, không cần lưu lại trạng thái/giá trị
    //Chọn thiết kế làm static
    //Hàm tính giai thừa!!!
    //n! = 1*2*3*4....*n
    //Không có giai thừa cho số âm
    //0! = 1! = 1: quy ước
    //Giai thừa tăng rất nhanh về mặt giá trị, giai thừa hàm đồ thị dốc đứng
    //20! có 18 con số 0, vừa kịp đủ cho kiểu Long trong Java
    //21! tràn kiểu long
    //Bài này quy ước tính n! trong khoảng từ 0 -> 20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument, n must be between 0 and 20");
        }
        if (n == 0 || n == 1) {
            return 1; //kết thúc cuộc chơi sớm nếu nhận chung đầu vào đặc biệt
        }
        long product = 1;//tích nhân dồn, thuật toán heo đất, ốc bu dồn thịt
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
