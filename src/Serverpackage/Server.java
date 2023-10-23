package Serverpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        try {
        	/** premiere partie
            // Lancement du serveur
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Je suis le serveur en attente de la connexion d'un client");
            // Acceptation de la connexion
            Socket s = serverSocket.accept();
            System.out.println("Un client est connecté");
            // Réception de l'entier
            InputStream is = s.getInputStream();
            int nb = is.read();
            // Calcul du produit
            int rep = nb * 5;
            // Envoi du résultat
            OutputStream os = s.getOutputStream();
            os.write(rep);
            // Fermeture du socket
            s.close();
            serverSocket.close();
            **/
        	
        	//Deuxieme partie
        	
        	// Lancement du serveur
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Je suis le serveur en attente de la connexion d'un client");

            // Acceptation de la connexion
            Socket s = serverSocket.accept();
            System.out.println("Un client est connecté");

            // Réception de l'entier
            InputStream is = s.getInputStream();
            int nb = is.read();

            // Réception de l'opération choisie par le client
            int operation = is.read();

            int rep = 0;
            if (operation == 1) {
                rep = nb + 5;
            } else if (operation == 2) {
                rep = nb - 5;
            } else if (operation == 3) {
                rep = nb * 5;
            } else if (operation == 4) {
                if (nb != 0) {
                    rep = nb / 5;
                } else {
                    rep = 0;
                }
            }
            // Envoi du résultat
            OutputStream os = s.getOutputStream();
            os.write(rep);
            // Fermeture du socket
            s.close();
            serverSocket.close();
		} catch (IOException e)
			{
				e.printStackTrace();
			}
	
	}

}
