public class ClassRoom {

    public static void main(String[] args) {

        Wilder swann = new Wilder("Swann", true);
        String afficher = swann.whoIam();
        System.out.println(afficher);
        Wilder anne = new Wilder("Anne", false);
        String afficher2 = anne.whoIam();
        System.out.println(afficher2);
    }



}