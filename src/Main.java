public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Room room = new Room("king", 2, 3, true, true);
        Family family =  new Family("Mom", 80, "female", "Florala, AL");
        Automobile automobile = new Automobile("Ford", "Explorer", 2006, "black");
        Home home = new Home(3, 3050, "brick", true);
        Mykit mykit = new Mykit("DW", 6, 5, "green");



    room.setFloor(4);
        System.out.println(room.getFloor());

        family.setage(97);
        System.out.println(family.getage());

        automobile.setModelYear(1977);
        System.out.println(automobile.getModelYear());

        home.setSquareFootage(2960);
        System.out.println(home.getSquareFootage());

        mykit.getcolor();
        System.out.println(mykit.getcolor());



    }




}
