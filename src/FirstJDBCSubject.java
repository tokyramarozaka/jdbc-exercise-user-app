public class FirstJDBCSubject {
    public static void main(String[] args) {
        // Comment faire pour se connecter à une BD PostgreSQL avec JAVA ?
        // JDBC : Java DataBase Connectivity (pilote)
        /* Cherchez ce que signifient les classes suivantes :
            - java.sql.Connection : à quoi ça sert ?
            - java.sql.Statement et java.sql.PreparedStatement : à quoi ça sert ? c'est quoi la
            différence entre les deux ? pourquoi prepared statement est mieux ?
            => Statement sert à executer des requêtes SQL sur une connexion.
            => PreparedStatement ???
            - java.sql.ResultSet : à quoi ça sert ? comment le parcourir ?
            => Récupérer les valeurs d'une requête SELECT.

        EXERCICE : créez une table USER (id, name, email, password) dans une base de données
        PostgreSQL, et entrez des données mock. Faites en sorte :
        - d'insérer un nouveau USER depuis Java;
        - d'afficher sur la console de Java la liste des USER.
         */
        String sql = "SELECT * FROM \"user\";";
    }
}
