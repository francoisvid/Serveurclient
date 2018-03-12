
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francois
 */
public class ServeurClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
// création d'un socket pour se connecter sur un serveur au 127.0.0.1:12107
        Socket s = new Socket("127.0.0.1", 12107);
// objet PrintWriter pour plus de convivialité
        PrintWriter out = new PrintWriter(s.getOutputStream());
// message dans le tampon de sortie
        out.print("hello world !!!!!");
// envoi du message
        out.flush();
// fermeture du flux
        out.close();
        s.close();
    }

}
