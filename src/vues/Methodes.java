
package vues;

public class Methodes {
    
    //Variables
    private String table = "abcdefghijklmnñopqrstuvwxyzáéêèíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$€#¿?!¡=()[]{}\\\"'à";
    //--------------Methodes---------------------------
    //Methode pour génerer les caractères
   
     private String Cleaning_text(String text)
     {
         text = text.replaceAll("\n", "");  
         
         
        for(int x = 0; x < text.length(); x++)
        {
            int position = table.indexOf(text.charAt(x));
            
            if (position == -1)
            {
                text= text.replace(text.charAt(x), ' ');
            }
        }        
        return text;
    } 
       
    //Methode pour chiffrer les textes
    public  String Chiffrer(String text,String key)
    {
      String cleaned_text = Cleaning_text(text);

      String encrypted = "";

      for(int t = 0,k= 0; t < cleaned_text.length(); t++,k= (k+1) % key.length())
      {
        int position = (table.indexOf(cleaned_text.charAt(t)) + table.indexOf(key.charAt(k))) % table.length();

       encrypted += table.charAt(position );

      }
       return encrypted;
    }
    //Methode pour déchiffer les textes
    public String Dechiffrer(String text,String key)
    {
      String cleaned_text = Cleaning_text(text);  

      String decrypted = "";

      for(int t = 0, k = 0; t < cleaned_text.length(); t++,k= (k+1) % key .length())
      {
       int position = (table.indexOf(cleaned_text.charAt(t)) - table.indexOf(key.charAt(k)));

       position = (position < 0)?(position + table.length()): position;

       decrypted += table.charAt(position);
       }
      return decrypted;
    }
    
    //Fonction pour générer une clé aléatoire
    public String generate(int taille)
    {
	    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#.$!;*/"; //On peut supprimer les lettres dont tu ne veux pas
	    String key = "";
	    for(int i=0; i<taille; i++)
	    {
	       int j = (int)Math.floor(Math.random() * chars.length()); // On génère un nombre aléatoire de notre dictionnaire chars
	       key += chars.charAt(j); // Achaque fois on stocke dans la variable key,
	    }
	    //System.out.println(pass);
	    return key; //return la clé de manière aléatoire de 8 caratère
    }
    
    
    
}
