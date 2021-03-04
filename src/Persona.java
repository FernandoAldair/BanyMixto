public class Persona extends Thread {
    private String nombre;
    String sex;
    Bany bany;


    public Persona(Bany b, String nombre, String sex) {
        this.bany = b;
        this.nombre = nombre;
        this.sex = sex;
    }

    private void esperar() {
        System.out.println(nombre + " ya no tiene ganas");

        try {
            Thread.sleep((long) ((Math.random() * 1000) + 50));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        super.run();
        for (;; ) {
            bany.entrar(nombre, sex);
            try {
                Thread.sleep((long) ((Math.random()*500)+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bany.salir(nombre, sex);
            esperar();
        }

    }

}
