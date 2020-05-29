
package hotelparcial;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author Reyes Hernando Santana Perez
 * ID 170035
 */

public interface Hotel extends Remote{
    public List <Habitacion> ConsultarHabitacion()throws RemoteException;
    public String ReservarHabitacion(int habitacion)throws RemoteException;
}
