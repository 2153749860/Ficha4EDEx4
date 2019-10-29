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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException2 {
        // TODO code application logic here
        int escolha = 1;
        
        switch (escolha) {
            case 0:
                Codifica teste = new Codifica("317425");
                teste.codificar("knowledge");

                System.out.println(teste.save.toString());
                System.out.println(teste.key.toString());

                System.out.println(teste.descodifica("317425"));
                break;
            case 1:
                Codifica teste2 = new Codifica("345");
                teste2.codificar("power");

                System.out.println(teste2.save.toString());
                System.out.println(teste2.key.toString());

                System.out.println(teste2.descodifica("345"));
                break;
        }

    }

}
