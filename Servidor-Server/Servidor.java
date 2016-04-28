import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.rmi.Naming;

public class Servidor {
    public static void main(String[] args) {
		
	/*
	
	Variables:
	
	id is identificator/id
	nome is name
	email is email
	totalcompra is Total purchase
	porcentagemdesconto is percentage discount
	totalpagar is total pay
	
	Class:
	Comprador is Buyer
	ICompador is interface for Comprador/Buyer
	Servidor is a Server
	Cliente is Cliente
	
	methods in class Comprador:
	calcularPorcentagemdesconto is calculate discount percentage
	calcularTotalPagar is calculate total pay

	In class Comprador/Buyer is gerate a Stub using rmic
	*/
		
        try{
            
			//Iniciando Registry / Start Registry
			
			LocateRegistry.createRegistry(1099);
			
            //Criar o objeto / Create object
            
            Comprador c = new Comprador();
            
            //Cadastrar o objeto ao registry / Register the object in registry
            
            Naming.rebind("//localhost/Comprador", c);
            System.out.println("Cadastrando o objeto Comprador no Registry");
			
        }
        catch(Exception e){
            System.out.println("Erro!!! "+ e.getMessage());
        }
    }
}