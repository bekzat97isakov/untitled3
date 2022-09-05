public class Person {
    String name;
    int age;
    double weight;
    Car car;

    @Override
    public String toString() {
        return
                "name:'" + name + '\n'+
                "age:" + age +'\n'+
                " weight:" + weight +'\n'+
                " car:" + car + '\n';
    }
}
