
package logica;


public class Zapato extends Vestimenta {
    
    String material;
    String tipoCierre;

    public Zapato() {
    }

    public Zapato(String material, String tipoCierre, int codigo, String nombre, double precio, String marca, double talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    
    
        public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }
    
    @Override
    public void mostrarInfo () {
        //método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
        System.out.println("Estos zapatos son de marca: "+ marca);
    } 
    
}
