/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuongnp.mathutil.main;

import com.cuongnp.mathutil.core.MathUtil;

/**
 *
 * @author phucu
 */
public class Main {
    public static void main(String[] args) {
        //Thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế không
        //Ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //VD: -5 coi tính đc ko, 0 coi tính mấy, 20 coi tính mấy, 21 coi tính mấy!!!
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó!!!

        long expected = 120;//Hàm được kì vọng trả về 120 nếu tính 5!
        int n = 20;          //Input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");

    }
}
