package colecciones;

public class Coches {
    String motor;
    String colorCarroceria;
    String discos;
    
    //Constructor
    public Coches(String motor, String colorCarroceria, String discos) {
        this.motor = motor;
        this.colorCarroceria = colorCarroceria;
        this.discos = discos;
    }
    
    //Get & Set
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColorCarroceria() {
        return colorCarroceria;
    }

    public void setColorCarroceria(String colorCarroceria) {
        this.colorCarroceria = colorCarroceria;
    }

    public String getDiscos() {
        return discos;
    }

    public void setDiscos(String discos) {
        this.discos = discos;
    }
    
    //toString

    @Override
    public String toString() {
        return "Coches{" + "motor=" + motor + ", colorCarroceria=" + colorCarroceria + ", discos=" + discos + '}';
    }
    
}
