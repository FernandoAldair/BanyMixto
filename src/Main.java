public class Main {
    public static void main(String[] args) {

        Bany baño = new Bany(0, 5);

        Thread persona1 = new Thread(new Persona(baño, "Joan", "M"));
        Thread persona2 = new Thread(new Persona(baño, "Jose", "M"));
        Thread persona3 = new Thread(new Persona(baño, "Emilio", "M"));
        Thread persona4 = new Thread(new Persona(baño, "Dani", "M"));
        Thread persona5 = new Thread(new Persona(baño, "Fernando", "M"));
        Thread persona6 = new Thread(new Persona(baño, "Sandra", "F"));
        Thread persona7 = new Thread(new Persona(baño, "Marta", "F"));
        Thread persona8 = new Thread(new Persona(baño, "Sofia", "F"));
        Thread persona9 = new Thread(new Persona(baño, "Natalia", "F"));
        Thread persona10 = new Thread(new Persona(baño, "Emili", "F"));


        persona1.start();
        persona2.start();
        persona3.start();
        persona4.start();
        persona5.start();
        persona6.start();
        persona7.start();
        persona8.start();
        persona9.start();
        persona10.start();

    }
}
