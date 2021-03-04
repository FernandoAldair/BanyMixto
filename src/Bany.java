import com.sun.tools.attach.AgentInitializationException;

import java.sql.Struct;

public class Bany {
    boolean hdentro, mdentro;
    int maxcapacidad, capacidad;
    String sex;






    public Bany(int capacidad, int max){
        this.capacidad = capacidad;
        maxcapacidad = max;
    }


    public synchronized void entrar(String nombre, String sex) {

        if (sex.equals("M")) {
            while (mdentro && maxcapacidad == 5 || mdentro) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            capacidad++;
            hdentro = true;
            notifyAll();
            System.out.println(nombre + " ha entrado al lavabo.");
        }
        else if (sex.equals("F")){
            while (hdentro && maxcapacidad == 5 || hdentro) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            capacidad++;
            mdentro = true;
            notifyAll();
            System.out.println(nombre + " ha entrado al lavabo.");
        }
    }

    public synchronized void salir (String nombre, String sex) {
        capacidad--;
        if (capacidad == 0 && sex.equals("M")){
            hdentro = false;
        }else if (capacidad == 0 && sex.equals("F")) {
            mdentro = false;
        }
        notifyAll();
        System.out.println(nombre + " ha salido.");

    }


}
