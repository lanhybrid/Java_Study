/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguadosistema;

import java.util.Locale;

/**
 *
 * @author allanmascarin
 */
public class LinguaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale idioma = Locale.getDefault();
        System.out.print("Your system language is ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println("language: " + idioma.getLanguage());
    }
    
}
