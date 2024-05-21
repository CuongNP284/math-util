/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cuongnp.mathutil.test.core;

import com.cuongnp.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;



/**
 *
 * @author phucu
 */
public class MathUtilityTest {
    
    //Đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    //để kiểm thử/kiểm tra code chính - hàm tínhGiaiThừa() bên class core.MathUtil
    //Viết code để test code chính bên kia!!!

    //Có nhiều quy tắc đặt tên hàm kiểm thử
    //Nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //Tình huống xài hàm theo kiểu thành công và thất bại   
    //Hàm dưới đây là tình  huống test hàm chạy thành công, trả về ngon
    //Ta sẽ xài hàm theo kiểu well - đưa từ 1! đến 20!, không đưa số quá to hay số âm
    //@Test JUnit sẽ phối hợp với JVM đề chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;//Test tình huống tử tế đầu vào và bạn phải chạy đúng
        long expected = 1;//Hy vọng 0! = 1;
        //long actual = ???;//Gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);

        //So sánh expected với actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);

        //Gộp thêm vài case thành công ở đây - đưa đầu vào ngon!!! hàm tính ngon 
        Assert.assertEquals(1, MathUtil.getFactorial(1));  //Tui mún 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));  //Tui mún 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3));  //Tui mún 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //Tui mún 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5));//Tui mún 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6));//Tui mún 6! == 720

        //Hàm giúp so sánh 2 giá trị nào đó có giống nhau ko??
        //Nếu giống nhau => thảy ra màu xanh - đường thông, code ngon cho ít nhất cái case đang test
        //Nếu không giống nhau => thảy ra màu đỏ - hàm ý expected và actual không giống nhau
    }
    
    //Hàm getFactorial() ta thiết kế có 2 tình huống xử lý
    //1. Đưa data tử tế trong 0 đến 20 => tính đúng đc n! - done
    //2. Đưa data cà chớn <0 hoặc >20; Thiết kế của hàm là ném ra ngoại lệ
    //   Tôi kì vọng ngoại lệ xuát hiện khi n < 0 || n > 20
    //   Rất mong ngoại lệ xuất hiện với n cà chớn này
    
    
    //Nếu hàm nhận vào n < 0 || n > 20 và hàm ném ta ngoại lệ 
    //=>HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ =>XANH PHẢI XUẤT HIỆN
    
    //Nếu hàm nhận vào n < 0 || n > 20 và không ném ra ngoại lệ
    //Sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG MÀU ĐỎ
    
    //Test case:
    //Input: -5
    //Expected: IllegalArgumentException xuất hiện
    //Tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    //Là những tình huống ko thể đo lường so sánh value
    //Mà chỉ có thể đo lường bằng cách chúng có xuất hiện hay ko
    //assertEquals() không dùng để so sánh hai ngoại lệ
    //      equals() là bằng nhau hay không trên value!!!
    
    //Đỏ, do hàm đúng là có ném vào ngoại lệ thật sự
    //    nhưng không phải là ngoại lệ kì vọng - thực sự kì vọng sai
    //    không phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5);//Hàm @Test chạy, hay hàm getF() chạy
//                                  //sẽ ném về ngoại lệ NumberFormat
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);//Hàm @Test chạy, hay hàm getF() chạy
    }
    
    //Cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
    //Xài lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //Tui cần thấy màu xanh khi chơi với 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        //Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh, 
        //                    tham số 2: đoạn code chạy văng ra ngoài runnable)
        
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
        
        
        //MathUtil.getFactorial(-5);//Hàm @Test chạy, hay hàm getF() chạy
    }
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
    //Có ném, tức là hàm chạy đúng thiết kế -> màu xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //Kiểm soat ngoại lệ!!!
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng không chắc ngoại lệ mình cần có xuất hiện hay không???
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentExeception xuất hiện
            Assert.assertEquals("Invalid argument, n must be between 0 and 20", 
                                e.getMessage());
        }
    }
}
