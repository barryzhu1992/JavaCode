package cn.itcast.junit;

/**
 * @author : zhuyuesong
 * create at:  2019-12-29  19:09
 * @description: Calculator测试类
 */
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

//        int result = cal.add(3,2);
//        System.out.println(result);

        int result = cal.sub(3,5);
        System.out.println(result);
    }
}
