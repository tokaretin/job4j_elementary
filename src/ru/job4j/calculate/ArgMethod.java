package ru.job4j.calculate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class ArgMethod {
    /*
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Ilya Karetin";
        ArgMethod.hello(name);
    }
}
*/
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void age(int age) {
        System.out.println(age);

    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        System.out.println("hello, " + name);

        ArgMethod.hello(name);

        ArgMethod.hello(name + " " + age);

        ArgMethod.age(age);

        ArgMethod.hello(name + name + name);
    }
}