import javax.swing.JOptionPane;

public class EjemploAutos {
    public static void main(String[] args) {
        //Auto Renault
        Autos auto1 = new Autos();
        auto1.marca = "Renault";
        auto1.modelo = "Logan";
        auto1.color = "Gris";

        //Auto Kia
        Autos auto2 = new Autos();
        auto2.marca = "Kia";
        auto2.modelo = "Sportage";
        auto2.color = "Rojo";
        
        //Auto Chevrolet
        Autos auto3 = new Autos();
        auto3.marca = "Chevrolet";
        auto3.modelo = "Spark";
        auto3.color = "Azul";

        String autoRenault = auto1.detalleAuto() + "\n" + auto1.aceleracion(1000) + "\n" + auto1.recorrido(100, 2);
        String autoKia = auto2.detalleAuto() + "\n" + auto2.aceleracion(1000) + "\n" + auto2.recorrido(100, 2);
        String autoChevrolet = auto3.detalleAuto() + "\n" + auto3.aceleracion(1000) + "\n" + auto3.recorrido(100, 2);

        String mensaje = autoRenault + autoKia + autoChevrolet;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
