package oop.work_whit_set;

import java.util.Objects;

/* 1) Продумайте структуру класса Кот.Какие поля и методы будут актуальны для приложения, которые являются
 инфармационной системой ветеринарной клиники.
 2) Создайте несколько экземпляров котов с параметрами.
 3) Добейтесь чтобы коты выводились в консоль с некоторыми параметрами.
 4) Создайте множество в котором будут храниться некоторые экземпляры класса Cat - HashSet<Cat>
 поместите в него некоторое количество объектов.
 5) Создайте одинаковые экземпляры, сравните их чез equals и hashcode, убедитесь что одинаковые экземпляры котов удалились
  в HashSet<>.*/
public class Cat {
    private String name;
    private int age;
    private String breed;
    private double weight;
    private String sex;
    private String ownerName;


    public Cat(String name, int age, String breed, String ownerName) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Кошку завут - "  + name  + ", ее возраст - " + age + ", порода  " + breed  + ", длина - " +
                weight + ", пол - " + sex  +
                ", имя хозяина кошки - " + ownerName + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed) && Objects.equals(sex, cat.sex) && Objects.equals(ownerName, cat.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, weight, sex, ownerName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight(double v) {
        return weight;
    }

    public String getSex(String м) {
        return sex;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
