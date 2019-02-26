
package base;


import entites.TableKeys;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionDeBasseDeDonnee {
    
    public static Connection connection = null;
    private static int port;
    private static String ip;
    private static String password;
    private static String username;
    private static String exception;

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        GestionDeBasseDeDonnee.connection = connection;
    }

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        GestionDeBasseDeDonnee.port = port;
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        GestionDeBasseDeDonnee.ip = ip;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        GestionDeBasseDeDonnee.password = password;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        GestionDeBasseDeDonnee.username = username;
    }

    public static String getException() {
        return exception;
    }

    public static void setException(String exception) {
        GestionDeBasseDeDonnee.exception = exception;
    }
    
 //Chargement de la connexion avec paramètre
    public static boolean loadConnection(String ip, int port, String utilisateur, String password, String bdd) {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            String link = "jdbc:mysql://" + ip + ":" + port + "/" + bdd;
            connection = DriverManager.getConnection(link, utilisateur, password);
            setPort(port);
            setUsername(utilisateur);
            setPassword(password);
            setIp(ip);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            exception = e.getMessage();
            return false;
        }

    }
    //Chargement de la connexion sans paramètre
    public static boolean loadConnection() {
        return loadConnection("127.0.0.1", 3306, "root", "oudjira", "vigeneredb");
        
    }
    //Fermer la connexion
    public static void closeConnection() {
        try {
            connection.close();;
        } catch (SQLException ex) {
            Logger.getLogger(GestionDeBasseDeDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //Recuperer tous les clés 
    public static List<TableKeys> getAllKeyByUser() {
         List<TableKeys> liste = new ArrayList<TableKeys>();
        try {
            PreparedStatement req = connection.prepareStatement("SELECT * "
                                                                + "FROM users ORDER BY username ASC ",
                                                                    ResultSet.CONCUR_READ_ONLY,
                                                                    ResultSet.TYPE_SCROLL_SENSITIVE);
     
            ResultSet rep = req.executeQuery();
            //recuperation des produit pour charger un à un dans une liste
            while (rep.next()) {
                TableKeys p = new TableKeys();
                p.setId(rep.getInt("id"));
                p.setIndicateur(rep.getString("username"));
                p.setKey(rep.getString("passeword"));
                
                liste.add(p);

            }
            req.close();
        } catch (SQLException ex) {
            //p = null;
            Logger.getLogger(GestionDeBasseDeDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }
    
    //Recuperer une clé 
    public static TableKeys getKeyByUser(String indicateur) {
        TableKeys p = null;
        try {
            PreparedStatement req = connection.prepareStatement("SELECT *  "
                                                                + "FROM users "
                                                                + "where username = ?;", 
                                                                ResultSet.CONCUR_READ_ONLY,
                                                                ResultSet.TYPE_SCROLL_SENSITIVE);
            req.setString(1, indicateur);
            ResultSet rep = req.executeQuery();
            if (rep.first()) {
                
                p = affecteChampsTableKeys(rep);
            }
        } catch (SQLException ex) {
            p = null;
            Logger.getLogger(GestionDeBasseDeDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    //Affection de valeur au champ
    private static TableKeys affecteChampsTableKeys(ResultSet r) throws SQLException {
        TableKeys p = new TableKeys();
        p.setIndicateur(r.getString("username"));
        p.setKey(r.getString("passeword"));
        p.setId(r.getInt("id"));
        //System.out.println(r.getInt("id"));
        return p;
    }
   

//Enregistrer une une clé et son user correspondant 
    public static boolean saveKey(TableKeys p) {
        boolean statut = false;
        
        try {
            PreparedStatement req = connection.prepareStatement("INSERT INTO users(\n"
                    + "username, passeword)\n"
                    + " VALUES ('"+p.getIndicateur()+"', '"+p.getKey()+"');",
                    ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE);
            
            statut = req.execute();
            req.close();
            statut = true;
        } catch (SQLException ex) {

            Logger.getLogger(GestionDeBasseDeDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statut;
    }
 
}
