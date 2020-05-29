
package hotelparcial;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 * @author Reyes Hernando Santana Perez
 * ID 170035
 */

public class Servidor {
    
        public static void main(String args[]) throws RemoteException {
        Implementacion con = new Implementacion();
        con.connect();
        try {
            Registry reg = LocateRegistry.createRegistry(4800);
            reg.rebind("Hotel", con);
            JOptionPane.showMessageDialog(null, "Servidor Conectado al RMI");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Servidor no Conectado " + e);
        }
    }
}
