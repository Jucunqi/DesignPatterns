package com.jcq.dp.Memento;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 备忘录模式  序列化
 *
 * @author : jucunqi
 * @since : 2025/2/6
 */
public class Main {

    public static void main(String[] args)  {
        Person person = new Person("张三", 18);

        // 写
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("person.data")))) {
            oos.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 读
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("person.data")))) {
            Person dataPerson = (Person) ois.readObject();
            System.out.println(dataPerson);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


class Person implements Serializable{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}