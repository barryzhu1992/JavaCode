package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Method;

/**
 * @author : zhuyuesong
 * create at:  2019-12-30  08:37
 * @description:
 */
public class ReflectDemo4 {
    /**
    3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)

     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     */

    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class personClass = Person.class;

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method:methods){
            System.out.println(method.getName());
        }
        System.out.println("---------------");
        //获取方法
        Method eat_method = personClass.getMethod("eat",String.class);
        Person person = new Person();
        eat_method.invoke(person,"饭");

        //获取类名
        String className = personClass.getName();
        System.out.println(className);

    }
}
