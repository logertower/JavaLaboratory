package com.liutf.demo.refect;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * java 反射机制测试
 */
public class JavaRefectDemo {

    /**
     * 获取class的四种方式
     */
    public static void getClassTest() throws ClassNotFoundException {
        /**
         * 1、通过类名称获取
         */
        Class clazz1 = Class.forName("com.liutf.demo.refect.Son");

        /**
         * 2、通过类创建
         */
        Class clazz2 = Son.class;

        /**
         * 3、通过对象创建
         */
        Son son = new Son();
        Class clazz3 = son.getClass();

        /**
         * 4、通过this创建
         */
        //Class clazz4 = this.getClass();
    }


    /**
     * 获取属性
     */
    public static void getFilds() {
        Class clazz2 = Son.class;

        Field[] fields = clazz2.getFields();
        Field[] declaredFields = clazz2.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
        }
    }


    /**
     * 获取方法
     */
    public static void getMethods() {
        Class clazz2 = Father.class;

        Method[] methods = clazz2.getMethods();
        for (Method method : methods) {
            StringBuilder sb = new StringBuilder();
            sb.append(Modifier.toString(method.getModifiers()));
            sb.append(" ");
            sb.append(method.getReturnType());
            sb.append(" ");
            sb.append(method.getName());
            sb.append("(");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                sb.append(parameter.getType().getSimpleName());
                sb.append(" ");
                sb.append(parameter.getName());
            }
            sb.append(")");
            System.out.println(sb.toString());
        }
    }


    /**
     * 运行方法
     */
    public static void operationMethod() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class clazz = Father.class;
        Object fatherObj = clazz.newInstance();

        List<Son> sonList = new ArrayList<Son>();
        sonList.add(new Son());

        Method method = clazz.getMethod("doSomething", String.class);

        method.invoke(fatherObj, "doSomething");


    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //getClassTest();

        //getFilds();

        //getMethods();

        operationMethod();

    }


}

class Father {
    public String name;

    public int dos(List<Long> lList) {
        return lList.size();
    }

    public int doss(List<Son> sList) {
        return sList.size();
    }

    public int doSomething(String param) {
        System.out.println(param);
        return param.length();
    }
}


class Son extends Father {

    private int age;
    private List<Son> sonList;

    public Son() {
    }

    public Son(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String dos(String param) {
        return param;
    }

    //public int dos(List<Father> fatherList) {
    //    return fatherList.size();
    //}
}



