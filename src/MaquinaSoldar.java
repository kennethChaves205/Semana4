public class MaquinaSoldar {
    String marca;
    String modelo;
    int potencia;
    String[] metalesQuePuedeSoldar;

    // Constructor
    MaquinaSoldar(String marca, String modelo, int potencia, String[] metalesQuePuedeSoldar) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metalesQuePuedeSoldar = metalesQuePuedeSoldar;
    }

    // Método para soldar un metal
    void soldar(String metal) {
        boolean puedeSoldar = false;
        for (String m : metalesQuePuedeSoldar) {
            if (m.equalsIgnoreCase(metal)) {
                puedeSoldar = true;
                break;
            }
        }

        if (puedeSoldar) {
            System.out.println("La máquina de soldar " + marca + " " + modelo + " solda el " + metal + ".");
        } else {
            System.out.println("La máquina de soldar " + marca + " " + modelo + " no puede soldar " + metal + ".");
        }
    }
}

