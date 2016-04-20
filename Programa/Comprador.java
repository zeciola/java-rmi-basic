import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Comprador extends UnicastRemoteObject implements IComprador {
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
    private int id;
    private String nome;
    private String email;
    private double totalcompra;
    private double porcentagemdesconto;
    private double totalpagar;

    public Comprador() throws RemoteException {}
    
    public void calcularPorcentagemdesconto() {
        if(totalcompra <= 999.99){
            porcentagemdesconto = 0.1;
        } 
        else{
            if(totalcompra <= 4999.99){
                porcentagemdesconto = 0.15;
            }
            else{
                porcentagemdesconto = 0.2;
            }
        }     
    }
    
    public void calcularTotalPagar() {
        totalpagar = (totalcompra -(totalcompra * porcentagemdesconto));
    }
    
    //Sets
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTotalcompra(double totalcompra) {
        this.totalcompra = totalcompra;
    }

    public void setPorcentagemdesconto(double porcentagemdesconto) {
        this.porcentagemdesconto = porcentagemdesconto;
    }

    public void setTotalpagar(double totalpagar) {
        this.totalpagar = totalpagar;
    }

    //Gets
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getTotalcompra() {
        return totalcompra;
    }

    public double getPorcentagemdesconto() {
        return (porcentagemdesconto * 100);
    }

    public double getTotalpagar() {
        return totalpagar;
    }
}
	
	