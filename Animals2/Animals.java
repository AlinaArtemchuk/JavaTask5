import org.w3c.dom.css.Counter;

public class Animals {
    private static String name;
    private static String color;
    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
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

        private static int count = 0;
    public Animals() {

            new Counter(). setCount();
        }
        public static int getCount() {
            return count;
        }
        private static class Counter {
            private void setCount() {
                count = count+1;
            }
     }

public class Home {
    String country;
    String region;

    public Home(String country, String region) {
        this.country = country;
        this.region = region;
    }

    public Home() {

    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;

    }

    public class Owner {
        String OwName;

        public Owner(String OwName) {
            this.OwName = OwName;
        }

        public Owner() {

        }

        public String getOwName() {
            return OwName;
        }

        public void Say() {
            System.out.println("Name - " + name + ", color - " + color + ", home - " + country + ", " + region + ", owner - " + OwName + ".");
        }


    public enum EnumName{
        Sup, Tom, Rex;
    }
public class AnimalsName{
            public static void main(String[] args){
                EnumName name = EnumName.Sup;
                String nameOfName = name.name();
                System.out.println(nameOfName);
            }

}


        public void main(String[] args) {
            Animals.Home.Owner Sup = new Animals("Sup", "white").new Home("UA", "Polissya").new Owner("Katya");
            Sup.Say();
            Animals.Home.Owner Tom = new Animals("Tom", "red").new Home("PL", "Podillya").new Owner("Oleh");
            Tom.Say();
            Animals.Home.Owner Rex = new Animals("Rex", "black").new Home("UK", "Wales").new Owner("Danny");
            Rex.Say();
            System.out.println("Counts of Animals - " +Animals.getCount());
        }

    }

}
}



abstract class Mammals {
    private String type;

    public Mammals (String name) {
        this.type= type;
    }
    abstract void say();
}


class Cow extends Mammals {
    private static String name;
   public String getName() {
    return name;}
    private static int age;
    public int getAge() {
        return age;

    }

    public Cow(String type, String name, int age) {
        super(type);
}
@Override
void say() {
    System.out.println("Moo");
        }

        }

class Sheep extends Mammals {
    private static String name;
    public String getName() {
        return name;}
    private String owner;
    public String getOwner() {
        return owner;
    }

    public Sheep (String name, String type, String owner) {
        super(type);
    }
    @Override
    void say() {
        System.out.println("Baa");}

    final void sayOwner() {
        System.out.println("My owner`s name is " + owner);
    }

    public static void main(String[] args) {
        Cow Alise = new Cow ("cow", "Aise", 7);
        Alise.say();
        Sheep Jon = new Sheep("Jon", "sheep", "Alex");
        Jon.say();
        Sheep Olli = new Sheep ("Olli", "sheep", "Tommy");
        Olli.sayOwner();
    }}