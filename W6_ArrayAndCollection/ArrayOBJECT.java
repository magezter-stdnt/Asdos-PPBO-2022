
class Person {
    static int index = 0;

    public int id;
    public String name;
    public int age;

    Person(String name, int age){
        this.id = index++;
        this.name = name;
        this.age = age;

    }

    void printPerson(){
        System.out.println(" Nama: " + this.name);
        System.out.println(" Umur: " + this.age);
    }
}

public class ArrayOBJECT {
    public static void main(String[] args){
        // cara 1 (deklarasi dan instantiate terpisah)
        Person[] persons;
        persons = new Person[3];
        persons[0] = new Person("Andi", 13);
        persons[1] = new Person("Aldo", 41);
        persons[2] = new Person("Banet", 12);



        // // cara 2 (deklarasi dan instantiate sekaligus)
        // Person[] persons = new Person[3];
        // persons = new Person[]{
        //     new Person("Andi", 13),
        //     new Person("Aldo", 41),
        //     new Person("Banet", 12)
        // };



        // // cara 3
        // Person[] persons = {new Person("Andi", 13), new Person("Aldo", 41), new Person("Banet", 12)};


        printArrayObject(persons);
    }

    static void printArrayObject(Person[] persons){
        // basic forloop
        for (int i = 0; i < persons.length; i++){
            System.out.println("Object Person ke-" + persons[i].id + " :");
            persons[i].printPerson();
        }

        // // foreach
        // for(Person person : persons){
        //     System.out.println("Object Person ke-" + person.id + " :");
        //         person.printPerson();
        // }
    }
}
