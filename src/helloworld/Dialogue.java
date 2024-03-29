package helloworld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Dialogue extends Remote {

    void connect(String pseudo);
    void disconnect(String pseudo) throws RemoteException;
    void sendMessage(String from, String to, String message) throws RemoteException;
    String[] getMessages(String pseudo) throws RemoteException;
    String[] getClients() throws RemoteException;
}
