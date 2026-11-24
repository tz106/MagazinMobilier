
public class Main {

    public static void main(String[] args) {

        // Cream un obiect MasaCafea
        MasaCafea masa = new MasaCafea(
                1, "Masa moderna", "Lemn", "Maro", 450,
                100, 60, 45, "Rotunda", "Sticla"
        );

        // Cream un obiect Balansoar
        Balansoar balansoar = new Balansoar(
                2, "Balansoar gradina", "Lemn", "Alb", 800,
                2, "Metal", "Textil", true, 200
        );

        // Afisam obiectele
        System.out.println(masa);
        System.out.println(balansoar);
    }
}
