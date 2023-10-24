import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ArrayList<Hilo> hilos = new ArrayList<>();
        ArrayList<Integer> resultados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique el numero de hilos que quiere lanzar:");
        int numHilos = sc.nextInt();

        for (int i = 0; i < numHilos; i++) {
            Hilo h = new Hilo(resultados);
            hilos.add(h);
            h.start();
        }

        try {
            for (Hilo hilo : hilos) {
                hilo.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int numCaras=0;
        int numCruz=0;

        for (int i = 0; i < resultados.size(); i++) {

            if(resultados.get(i)==0) {
                numCaras++;
            }else {
                numCruz++;
            }
        }
        System.out.println("Han salido " + numCaras + " caras y " + numCruz + " cruces.");
    }
}
