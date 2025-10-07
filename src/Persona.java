public class Persona {
    String nombre;
    String apellidos;
    Pasaporte pasaporte;
    Mascota mascota;
    MaquinaSoldar maquinaSoldar;   // es dependencia

    void sacarPasaporte(String numero, String nacionalidad, String fechaEmision,
                        String fechaVencimiento, boolean estaVigente) {
        pasaporte = new Pasaporte();
        pasaporte.numero = numero;
        pasaporte.nacionalidad = nacionalidad;
        pasaporte.fechaEmision = fechaEmision;
        pasaporte.fechaVencimiento = fechaVencimiento;
        pasaporte.estaVigente = estaVigente;
    }
    void tomarVuelo(String pais) {
        if (pasaporte != null && pasaporte.estaVigente) {
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pais + ".");
        } else {
            System.out.println(nombre + " " + apellidos +
                    " no puede tomar el vuelo, ya que su pasaporte no está vigente.");
        }
    }

    // Método para adoptar mascota
    void adoptarMascota(String nombre, String especie, int edad) {
        mascota = new Mascota();
        mascota.nombre = nombre;
        mascota.especie = especie;
        mascota.edad = (byte) edad;
    }

    void jugarConMascota() {
        if (mascota != null) {
            System.out.println(nombre + " " + apellidos + " está jugando con " + mascota.nombre + ".");
            mascota.jugar();
        } else {
            System.out.println(nombre + " " + apellidos + " no tiene mascota para jugar.");
        }
    }

    // Método para asignar la máquina de soldar (dependencia)
    void asignarMaquinaSoldar(MaquinaSoldar maquina) {
        this.maquinaSoldar = maquina;
    }
    void soldar(String metal) {
        if (maquinaSoldar != null) {
            System.out.println(nombre + " " + apellidos + " intenta soldar " + metal + "...");
            maquinaSoldar.soldar(metal);
        } else {
            System.out.println(nombre + " " + apellidos + " no tiene una máquina de soldar asignada.");
        }
    }
}




