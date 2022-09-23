package helloworld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DialogueImpl extends UnicastRemoteObject implements Dialogue{
    protected DialogueImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void connect(String pseudo) {

    }

    @Override
    public void disconnect(String pseudo) throws RemoteException {

    }

    @Override
    public void sendMessage(String from, String to, String message) throws RemoteException {

    }

    @Override
    public String[] getMessages(String pseudo) throws RemoteException {
        return new String[0];
    }

    @Override
    public String[] getClients() throws RemoteException {
        return new String[0];
    }
}
