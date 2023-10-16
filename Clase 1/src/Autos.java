public class Autos {
    String marca;
    String modelo;
    String color;

    public String detalleAuto() {
        return "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n";
    }

    public String aceleracion(int revoluciones) {
        return "El auto " + this.marca + " " + this.modelo + " está acelerando a " + revoluciones + " RPM";
    }

    public String recorrido(int kilometros, int horas) {
        return "El auto " + this.marca + " " + this.modelo + " ha recorrido " + kilometros + " kilómetros en " + horas + " horas\n" +
        "\n---------------------------------------------------------------------------------------------------------------------------\n";
    }
}
