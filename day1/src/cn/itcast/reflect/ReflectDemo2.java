package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Field;

/**
 * @author : zhuyuesong
 * create at:  2019-12-29  20:19
 * @description:
 */
public class ReflectDemo2 {
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
        //0.获取Person的Class对象
        Class cla = Person.class;

        /**
         *
            1.获取成员变量们
         * Field[] getFields() 获取所有public成员
         * Field getField(String name)
         */
        Field[] fields = cla.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("--------------");

        //2.获取成员变量,必须是public的
        Field a = cla.getField("a");

        //获取值
        Person person = new Person();
        Object value = a.get(person);

        //设置a的值
        a.set(person,"张三");

        System.out.println(person);

        System.out.println("===================");

        //Field[] getDeclaredFields()
        //Field getDeclaredField(String name)
        //获取所有成员变量们，不考虑修饰符

        Field[] declarFields = cla.getDeclaredFields();
        for (Field declarField:declarFields){
            System.out.println(declarField);
        }
        //Field getDeclaredField(String name)
        Field d = cla.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(person);
        System.out.println(value2);

    }
}
