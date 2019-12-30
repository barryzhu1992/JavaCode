package cn.itcast.reflect;

import cn.itcast.domain.Person;

/**
 * @author : zhuyuesong
 * create at:  2019-12-29  20:02
 * @description:
 */
public class ReflectDemo1 {

    public static void main(String[] args) throws Exception {

        /**
         获取Class对象的方式：
         1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
         2. 类名.class：通过类名的属性class获取
         3. 对象.getClass()：getClass()方法在Object类中定义着。

         */
        //1.Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
         Class cla1 =  Class.forName("cn.itcast.domain.Person");
         System.out.println(cla1);

         //2. 类名.class：通过类名的属性class获取
        Class cla2 = Person.class;
        System.out.println(cla2);

        //3. 对象.getClass()：getClass()方法在Object类中定义着。

        Person person = new Person();
        Class cla3 = person.getClass();
        System.out.println(cla3);

        System.out.println(cla1 == cla2);
        System.out.println(cla2 == cla3);



    }
}
