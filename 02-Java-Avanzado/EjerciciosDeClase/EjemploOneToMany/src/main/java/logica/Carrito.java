
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Carrito implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nomCarrito;
    
    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Item>listaItems;

    public Carrito() {
    }

    public Carrito(Long id, String nomCarrito, List<Item> listaItems) {
        this.id = id;
        this.nomCarrito = nomCarrito;
        this.listaItems = listaItems;
    }

    public String getNomCarrito() {
        return nomCarrito;
    }

    public void setNomCarrito(String nomCarrito) {
        this.nomCarrito = nomCarrito;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
    }
    
    //METODO adicional
    
    public void agregar(Item item){
        listaItems.add(item);
        item.setCarrito(this); //asignar el carrito al item
    }
    
    public Carrito(List<Item>listaItems){
        this.listaItems=listaItems;
    }
    
    
    
}
