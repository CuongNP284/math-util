/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cuongnp.mathutil.test.core;

import static com.cuongnp.mathutil.core.MathUtil.getFactorial;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;





//Câu lệnh này là của JUnit báo hiệu rằng sẽ cần loop qua tập data để
//lấy cặp data input/expected nhồi vào hàm test 
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //Ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected|Input
    @Parameterized.Parameters //JUnit sẽ ngầm chạy loop qua từng dòng
                              //của mảng để lấy ra đc cặp data input/expected
    
    //Tên hàm không quan trọng, quan trọng là @ 
    public static Object[][] initData(){
        return new Integer[][]{
                                {0, 1}, 
                                {1, 1}, 
                                {2, 2}, 
                                {3, 6}, 
                                {4, 24}, 
                                {6, 720},
        };
    }
    
    //Giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột 
    //vào biến tương ứng input, expected để lát hồi feed cho hàm
    
    @Parameterized.Parameter(value = 0)//value = 0 là map với mảng data
    public int n;//biến map với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1)
    public long expected;//kiểu long vì giá trị trả về của hàm getFactorial() là long
     
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, getFactorial(n));
    }
}
