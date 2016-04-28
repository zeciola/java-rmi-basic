import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.rmi.Naming;

public class Cliente {
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
            IComprador obj = (IComprador)Naming.lookup("Comprador");
            
            obj.setId(0);
            obj.setNome("nome");
            obj.setEmail("email");
            obj.setTotalcompra(1000);
            obj.calcularPorcentagemdesconto();
            obj.calcularTotalPagar();
            
            System.out.println("Id: "+ obj.getId());
            System.out.println("Nome: "+ obj.getNome());
            System.out.println("Email: "+ obj.getEmail());
            System.out.println("Total da compra: "+ obj.getTotalcompra());
            System.out.println("Desconto: "+ obj.getPorcentagemdesconto());
            System.out.println("Total a pagar: "+ obj.getTotalpagar());
            System.out.println("");
        }
        catch(Exception e){
            System.out.println("Erro!!! "+ e.getMessage());
        }
        System.exit(0);
    }
}