package Models;

public class Pastelero {
    private String nombre;
    private int edad;
    private String especialidad;
    private int experiencia;

    Pastelero pasteles = new Pastelero("Nombre", 25, "Especialidad", 5);
    public Pastelero(String nombre, int edad, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public void prepararPasteles(Insumo insumo, int cantidadUtilizada) {
        System.out.println("El pastelero " + nombre + " está preparando pasteles.");
        insumo.registrarUsoDeInsumo(cantidadUtilizada);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void registrarUsoInsumos(Insumo insumo, int cantidadUtilizada) {
        System.out.println("El pastelero " + nombre + " ha utilizado " + cantidadUtilizada + " de " +
                insumo.getNombre() + " en la preparación de pasteles.");
        insumo.registrarUsoDeInsumo(cantidadUtilizada);
    }

    public String getInfoPastelero() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nEspecialidad: " + especialidad +
                "\nExperiencia: " + experiencia + " años";
    }

    public void registrarUsoDeInsumo(Insumo insumo, int cantidadUtilizada) {
    }
}
