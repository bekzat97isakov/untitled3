public class Car {
    String name;
    int year;
    String model;
    int weight;

    @Override
    public String toString() {
        return
                "name=>" + name + '\n' +
                " year=>" + year + '\n'+
                " model=>" + model + '\n' +
                " weight=>" + weight +'\n';
    }
}
