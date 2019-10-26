/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichaedex4;

/**
 *
 * @author tiago
 */
public class FichaEDEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException2 {
        // TODO code application logic here
        Codifica teste = new Codifica("53174");
        teste.codificar("Power");
        
        System.out.println(teste.save.toString());
        System.out.println(teste.key.toString());
        
    }
    
}
