package org.htlleo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Identity Service" );
        int port = 5555;
        String host = (args.length < 1) ? null : args[0];
        String serviceName = "UIDService";

        try {
            Registry registry = LocateRegistry.getRegistry(host, port);
            IdentityService stub = (IdentityService) registry.lookup(serviceName);

            String response = stub.createId();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
