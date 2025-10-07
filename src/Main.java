//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Primera persona
        Persona persona1 = new Persona();
        persona1.nombre = "Kenneth";
        persona1.apellidos = "Chaves Coto";

        // Segunda persona
        Persona persona2 = new Persona();
        persona2.nombre = "David";
        persona2.apellidos = " Peña";

        // Una sola mascota (compartida por ambas personas)
        Mascota mascotaCompartida = new Mascota();
        mascotaCompartida.nombre = "Manchas";
        mascotaCompartida.especie = "Perro";
        mascotaCompartida.edad = 3;

        // Ambos con la misma mascota
        persona1.mascota = mascotaCompartida;
        persona2.mascota = mascotaCompartida;

        // Jugamos ambos con el mismo perro
        persona1.jugarConMascota();
        persona2.jugarConMascota();

        // Creo pasaportes (uno vigente y uno no)
        persona1.sacarPasaporte("A09", "Costarricense", "2025-09-09", "2033-09-10", true);
        persona2.sacarPasaporte("B07", "Costarricense", "2025-02-02", "2025-01-01", false);

        // vuelos distintos, diferente resultado
        persona1.tomarVuelo("España");  // debería poder volar
        persona2.tomarVuelo("Italia");  // no debería poder volar

        // Las maquinas de soldar
        String[] metalesQuePuedeSoldar = {"hierro", "acero", "aluminio"};
        MaquinaSoldar maquina = new MaquinaSoldar("Miller Electric", "ME123X", 30000, metalesQuePuedeSoldar);

        // Solo yo puedo soldar
        persona1.asignarMaquinaSoldar(maquina);

        // Kenneth intenta soldar dos veces, con distinto resultado
        persona1.soldar("hierro");   // sí puede
        persona1.soldar("titanio");  // no puede

        // Peña intenta soldar sin máquina
        persona2.soldar("hierro");   // no tiene máquina asignada
    }
}