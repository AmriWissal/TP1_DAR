package Clientpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/** Premiere partie
        System.out.println("Je suis un client");
        try {
            // Adresse IP du serveur distant
            InetAddress serverAddress = InetAddress.getByName("192.168.1.14");
            // Création de l'adresse du serveur et du port
            InetSocketAddress serverSocketAddress = new InetSocketAddress(serverAddress, 1234);
            // Etablir la connexion
            Socket s = new Socket();
            s.connect(serverSocketAddress);
            System.out.println("Je suis un client connecté");
            // Lecture de l'entier
            Scanner scanner = new Scanner(System.in);
            System.out.println("Donnez un nombre : ");
            int nb = scanner.nextInt();
            // Envoi de l'entier vers le serveur
            OutputStream os = s.getOutputStream();
            os.write(nb);
            // Réception du résultat
            InputStream is = s.getInputStream();
            int rep = is.read();
            // Affichage du résultat
            System.out.println("J'ai reçu le résultat : " + rep);
            // Fermer le socket
            s.close();
			**/
		
			// Deuxieme partie
        	System.out.println("Je suis un client");
            try {
                // Adresse IP du serveur distant
                InetAddress serverAddress = InetAddress.getByName("192.168.1.14");

                // Création de l'adresse du serveur et du port
                InetSocketAddress serverSocketAddress = new InetSocketAddress(serverAddress, 1234);

                // Etablir la connexion
                Socket s = new Socket();
                s.connect(serverSocketAddress);

                System.out.println("Je suis un client connecté");

                // Lecture de l'entier
                Scanner scanner = new Scanner(System.in);
                System.out.println("Donnez un nombre : ");
                int nb = scanner.nextInt();

                // Choix de l'opération
                System.out.println("Choisissez l'opération :");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                int operation = scanner.nextInt();

                // Envoi de l'entier et de l'opération vers le serveur
                OutputStream os = s.getOutputStream();
                os.write(nb);
                os.write(operation);

                // Réception du résultat
                InputStream is = s.getInputStream();
                int rep = is.read();

                // Affichage du résultat
                System.out.println("Le résultat est : " + rep);

                // Fermer le socket
                s.close();
		} catch (IOException e)
			{
				e.printStackTrace();
			}
	}

}
