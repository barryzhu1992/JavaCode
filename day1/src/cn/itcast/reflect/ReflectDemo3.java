package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;

/**
 * @author : zhuyuesong
 * create at:  2019-12-30  08:12
 * @description:
 */
public class ReflectDemo3 {
    /**
     Class对象功能：
     * 获取功能：
     1. 获取成员变量们
     * Field[] getFields()
     * Field getField(String name)

     * Field[] getDeclaredFields()
     * Field getDeclaredField(String name)
     2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>... parameterTypes)

     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
     3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)

     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

     4. 获取类名
     * String getName()

     */

    public static void main(String[] args) throws Exception {
        /** 获取构造方法们
                * Constructor<?>[] getConstructors()
                * Constructor<T> getConstructor(类<?>... parameterTypes)
         *
         **/
        //1.获取Class对象
        Class personClass = Person.class;
        //2.获取构造函数们
        Constructor<?>[] constructors = personClass.getConstructors();

        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }
        System.out.println("--------------");
        //3.获取构造函数
        Constructor constructor = personClass.getConstructor(int.class,String.class,String.class);
        System.out.println(constructor);
        //创建对象

        Object person = constructor.newInstance(23,"小王","lalala");
        System.out.println(person);
        System.out.println("..............");

        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor2);
    }

}
