public class Main {

    public static void main(String[] args) {
        Car unaa = new Car();
        unaa.name = "Bmw";
        unaa.year = 2005;
        unaa.model = "550l";
        unaa.weight = 1000;

        Car unaa2 = new Car();
        unaa2.name = "Audi";
        unaa2.year = 2010;
        unaa2.model = "tt";
        unaa2.weight = 1500;

        Person adam = new Person();                  //1
        adam.name = "Asan";
        adam.age = 18;
        adam.weight = 70;
        adam.car = unaa;


        Person adam2 = new Person();                 //2
        adam2.name = "Esen";
        adam2.age = 25;
        adam2.weight = 75;
        adam2.car = unaa2;

        Person adam3 = new Person();   //3
        adam3.name = "Uson";
        adam3.age = 20;
        adam3.weight = 65;
        adam3.car = unaa2;

        Person[] array = new Person[3];
        array[0] = adam;
        array[1] = adam2;
        array[2] = adam3;

        int[] massive = {212,43,455,767,76,34,77,99,44,};
        for (int s:massive) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Person p:array) {
            System.out.println(p);
        }

    }
}