import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOfConnection {
    public static void main(String[] args) {
        // Se connecter à la base de données
        // Unhandled SQLException : erreur SQL non géré.
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/nom-de-la-base",
                    "postgres",
                    "votre-mot-de-passe"
            );

            Statement statement = connection.createStatement();

            // pour cacher le mot de passe :
            // 1) vous utilisez un algorithme de cryptage (BCRYPT, ARGON2i...)
            // 2) vous utilisez des variables d'environnements.
        }catch(SQLException e){
            System.out.println("Erreur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}





