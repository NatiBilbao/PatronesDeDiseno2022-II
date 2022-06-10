package tarea8Strategy;

public class Ropa {
    String tipo;
    String precio;

    public Ropa(String tipo, String precio){
        this.tipo=tipo;
        this.precio=precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("Tipo de ropa: " + tipo);
        System.out.println("Precio: " + precio);
    }
}
