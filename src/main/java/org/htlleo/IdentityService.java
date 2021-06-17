package org.htlleo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IdentityService extends Remote {
    String createId() throws RemoteException;
}
