public class Basics {


    public static String str = "Yeahh !";

    public static void main(String[] args) {

        // Object in java

        // Syntax --> DataType nameOfObject = new DataType();

//        House h1 = new House();

//        System.out.println(h1.numOfRooms);
//        System.out.println(h1.numOfKitchens);
//        System.out.println(h1.numOfWashrooms);
//        System.out.println(h1.isStairs);
//        System.out.println(h1.address);

//            h1.numOfRooms = 3;
//            h1.numOfKitchens = 4;
//        System.out.println(h1.numOfRooms);
//        System.out.println(h1.numOfKitchens);
//
//        House h2 = new House();
//        System.out.println(h2.numOfRooms);
//        System.out.println(h2.numOfKitchens);


        // param constructor of Hosue

        // instance / object
//        House h1 = new House(4, 2, 3, "abcd", true);
//        System.out.println(h1.numOfRooms);
//        System.out.println(h1.numOfKitchens);
//        System.out.println(h1.numOfWashrooms);
//        System.out.println(h1.isStairs);
//        System.out.println(h1.address);

//        House h1 = new House();
//        h1.setAddress("abcd");
//
//        System.out.println("House address = " + h1.getAddress());

        // using getter and setter

//        h1.setNumOfRooms(3);
//        System.out.println("num of rooms: " + h1.getNumOfRooms());
//
//        System.out.println(str);


        // Static Keyword

        House h1 = new House();
        h1.setNumOfRooms(3);
        h1.setNumOfKitchens(1);
        h1.setNumOfWashrooms(2);

       House h2 = new House();
       h2.setNumOfRooms(10000);
//
//        h1.printInfo(1);
//
//        h2.printInfo(2);

        System.out.println(h1.getNumOfRooms());
//
        System.out.println(House.getNumOfRooms());
//        System.out.println(House.getNumOfKitchens());// error









    }


}