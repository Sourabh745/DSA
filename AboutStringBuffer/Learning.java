//package Enum;
//you can create your own data types

public class Learning {

    enum Weeks{ // it is my new datatype
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants
        //every one is public, static and final
        //since its final you cant create child enum
        // type is week
        Weeks() {
            System.out.println("Constructor called for "+this);
        }
        //this is not public or protected , only private and defualt
        // we dont want to create new objects
        //this is not the enum concepts, that why

        //internally: public static final Weeks Monday = new Weeks();
        // enum explicity extends java.lang.enumClass;
        // cant be superclass
        // it can implement interface
    }


    public static void main(String[] args) {
        Weeks week;
        week = Weeks.Thursday;

        System.out.println(week.valueOf("Monday"));

        for(Weeks day: Weeks.values()) {
            System.out.print(day+", ");
        }

        System.out.println(week.ordinal());// return the position of enum constant
    }
    
}
