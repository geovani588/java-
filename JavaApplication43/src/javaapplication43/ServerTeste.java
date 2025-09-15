package javaapplication43;

import java.rmi.Naming;
public class ServerTeste //considere a criação da classe ServerTeste anteriormente
{
    public static void main(String[] args){
        if (args.length != 1){
            System.err.println(“\nUsage:\t java ServerTeste objname\n”);
            System.exit(1);
        }
        try
        {
            Teste ateste = new Teste();// criação do objeto servidor
            String objname = “//localhost/”+args[0];
            System.out.println(“Registrando” +objname+ “...”);
            Naming.rebind(objname, awalk);// Registro do RMI
            System.out.println(“Registrado”);
        }
        catch (Exception e) // catch caso ocorra erro no registro do RMI
        {
            System.err.println(“Erro em main()” + e);
 
            e.printStackTrace();
            System.exit(2);
        }

        System.out.println(“Esperando Objeto”);
    }
}


