public class Animals {
    private static String name;
    private static String color;
    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animals() {
    }

    public String getColor() {
        return color;
    }
    public void setColor (String color) {
        this.color = color;

    }
    public String getName() {
        return name;}
    public void setName (String name) {
        this.name = name;
    }
    public void sayHello (){
        System.out.println("Hello, my name is "+ name +". " + "My color is " + color+".");
    }
    public static void main(String[] args) {
        Animals Snizhok = new Animals("Snizhok", "white");
        Snizhok.sayHello();

        Animals Barsyk = new Animals("Barsyk", "red");
        Barsyk.sayHello();
    }

};
class Fox extends Animals {
    private static int age;
    public Fox (int age) {
this.age = age;    }

    public int getAge() {
        return age;
    }

    public Fox (String name, String color, int age) {
super (name, color);
        }
public abstract class WildAnimals extends Animals{
abstract void say();
};
}

class Cat extends Animals {
    private String owner;

    public String getOwner() {
        return owner;
    }

    public Cat(String name, String color, String owner) {
        super(name, color);
        this.owner = owner;

    }

    final void SayOwner() {
        System.out.println("My owner`s name is " + owner);
    }

    public abstract class HomeAnimals extends Animals {
        abstract void say();

    }
    public static void main(String[] args) {
Fox Rex = new Fox ("Lori",  "grey",2 );
Cat Tom = new Cat("Tom","black", "Mike");
Cat Alexa = new Cat ("Alexa", "ny-gold","Alina");
Tom.SayOwner();
Alexa.SayOwner();
Rex.sayHello();
    }
}
