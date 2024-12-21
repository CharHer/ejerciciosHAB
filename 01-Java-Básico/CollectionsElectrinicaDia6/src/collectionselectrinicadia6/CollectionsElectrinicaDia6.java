
package collectionselectrinicadia6;

import java.util.ArrayList;
import logica.Producto;

public class CollectionsElectrinicaDia6 {

    public static void main(String[] args) {
        
        //Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).
        Producto prod01= new Producto(54962, "Telefono", "Nokia", "Celular", 4000, 4400, 8);
        Producto prod02= new Producto(35498, "LapTop", "Dell", "Gamer", 12000, 13200, 2);
        Producto prod03= new Producto(16832, "Tableta", "Apple", "Mini", 20000, 22000, 10);
        Producto prod04= new Producto(16584, "Audifonos", "JBL", "Cascos", 1800, 1980, 20);
        Producto prod05= new Producto(26827, "Audifonos", "Sony", "Inear", 600, 660, 25);
        Producto prod06= new Producto(15962, "LapTop", "ASER", "Oficina", 6000, 6600, 10);
        Producto prod07= new Producto(89654, "Telefono", "Xiaomi", "Celular", 5500, 6100, 6);
        Producto prod08= new Producto(15260, "LapTop", "Alienware", "Gamer", 32000, 35200, 5);
        Producto prod09= new Producto(04637, "Telefono", "Apple", "Celular", 18000, 19800, 12);
        Producto prod10= new Producto(15684, "Cargador", "Generica", "Tipo C", 200, 220, 30);
        
        //Guardar estos objetos creados en un ArrayList.
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(prod01);
        listaProductos.add(prod02);
        listaProductos.add(prod03);
        listaProductos.add(prod04);
        listaProductos.add(prod05);
        listaProductos.add(prod06);
        listaProductos.add(prod07);
        listaProductos.add(prod08);
        listaProductos.add(prod09);
        listaProductos.add(prod10);
        
        Producto productoMaxPrecio = null;
        
        //Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
        for (int i=0; i<listaProductos.size();i++) {
            Producto producto = listaProductos.get(i);
            if (productoMaxPrecio == null || producto.getPrecioVenta() > productoMaxPrecio.getPrecioVenta()) {
                productoMaxPrecio = producto;
            }
        }
        
            if (productoMaxPrecio != null) {
            System.out.println("Producto con el mayor precio de venta: " + productoMaxPrecio);
            
        }
        
        //Recorrer el ArrayList y determinar el producto con el menor precio de costo.
        Producto productoMinPrecioCosto = null;
    
        for (int i=0; i<listaProductos.size();i++) {
            Producto producto = listaProductos.get(i);
            if (productoMinPrecioCosto == null || producto.getPrecioVenta() < productoMinPrecioCosto.getPrecioVenta()) {
            productoMinPrecioCosto = producto;
            }
        }

        if (productoMinPrecioCosto != null) {
        System.out.println("Producto con el menor precio de costo:");
        System.out.println(productoMinPrecioCosto); 
        }
        
        //Borrar el producto que se encuentre en la posición 5 del ArrayList.
        listaProductos.remove(5);
        
        //Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.
        Producto productoMaxStock = null;

        for (Producto producto : listaProductos) {
            if (productoMaxStock == null || producto.getStock() > productoMaxStock.getStock()) {
                productoMaxStock = producto;
            }
        }
        
        if (productoMaxStock != null) {
            int stockRestante = productoMaxStock.getStock() - 3;
            productoMaxStock.setStock(stockRestante); 
            System.out.println("Producto con mayor stock: " + productoMaxStock);
        }
        
    }
    
}
