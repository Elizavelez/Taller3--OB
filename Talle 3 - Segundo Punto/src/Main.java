public class Main {

    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumarpuertas();
        System.out.println("La cantidad de puertas es:" + miCoche.Numpuertas);
    }
    }
    class coche{
         int Numpuertas = 6;

        public void sumarpuertas (){
            this.Numpuertas++;
        }
    }


