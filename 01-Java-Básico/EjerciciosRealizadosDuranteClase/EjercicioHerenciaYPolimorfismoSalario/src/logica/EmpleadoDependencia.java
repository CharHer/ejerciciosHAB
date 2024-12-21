
package logica;

public class EmpleadoDependencia extends Empleado {
    
    double bono;

    public EmpleadoDependencia() {
    }

    public EmpleadoDependencia(double bono, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    //METODOS
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    @Override
    public String getDescripcion (){
        return "Empleado en relación de dependencia: Recibe un salario base de " + salarioBase + " y un bono adicional de " + bono + ".";
    }
    

    
    
}
