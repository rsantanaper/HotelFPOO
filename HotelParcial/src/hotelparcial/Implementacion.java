
package hotelparcial;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Reyes Hernando Santana Perez
 * ID 170035
 */

public class Implementacion extends UnicastRemoteObject implements hotelparcial.Hotel{
    
    String url = "src\\BaseDatos\\Hotel.db";
    Connection connect;

    public Implementacion() throws RemoteException {
        super();
    }

    public void connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null) {
                JOptionPane.showMessageDialog(null, "Conectado a la base de Datos");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
    }

    public void close() {
        try {
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error" + ex);;
        }
    }

    @Override
    public List<hotelparcial.Habitacion> ConsultarHabitacion() throws RemoteException {
        ResultSet respuesta = null;
        List<Habitacion> list = new ArrayList<Habitacion>();
        try {
            PreparedStatement st = connect.prepareStatement("SELECT num_habitacion, "
                    + "valor, camas FROM Habitacion WHERE disponibilidad = 0");
            respuesta = st.executeQuery();
            while(respuesta.next()){
            int numhab = respuesta.getInt("num_habitacion");
            int val = respuesta.getInt("valor");
            int cam = respuesta.getInt("camas");
                Habitacion hab = new Habitacion();
                hab.setHabitacion(numhab);
                hab.setValor(val);
                hab.setCamas(cam);
                list.add(hab);
            }
            st.close();
            return list;
        } catch (SQLException ex) {
            System.err.println("FALLA : FALLA : " + ex.getMessage());
            return null;
        }
    }

    @Override
    public String ReservarHabitacion(int habitacion) throws RemoteException {
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE Habitacion "
                    + "SET disponibilidad =1 WHERE num_habitacion = ?");
            st.setInt(1, habitacion);
            st.execute();
            return "Reserva Exitosa";
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return "Fallo en la reserva";
        }
    }    
}
