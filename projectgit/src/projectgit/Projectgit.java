
//Autor:Marcos Julian
//Fecha: 04/02/2020
package projectgit;


public class Projectgit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dni=12345678;
       char letter= DNIletter(dni);
        System.out.println(dni+":"+letter);
        
    }
 //function que recibe dni y devuelve    la letra

    private static String DNIletter(int dni){
        char letter;
        int residuo;
       
    String letters="TRWAGMYFPDXBNJZSQVHLCKE";
     residuo=dni%23;
     letter=letters.charAt(residuo);
    return letter;
}}
