
package hotelparcial;

/**
 * @author Reyes Hernando Santana Perez
 * ID 170035
 */

public class Habitacion implements java.io.Serializable{
    private int valor;
    private int habitacion;
    private int camas;
    private int disponibilidad;
    
    public void setValor(int val){
        this.valor = val;
    }
    
    public void setHabitacion(int hab){
        this.habitacion = hab;
    }
    
    public void setCamas(int cam){
        this.camas = cam;
    }
    
    public void setDisponibilidad(int dis){
        this.disponibilidad = dis;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public int getHabitacion(){
        return this.habitacion;
    } 
    
    public int getCamas(){
        return this.camas;
    }
    
    public int getDisponibilidad(){
        return this.disponibilidad;
    }
}
