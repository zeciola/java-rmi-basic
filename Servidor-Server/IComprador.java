import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public interface IComprador extends Remote{
   
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
   
    //Sets
        
    public void setId(int id) throws RemoteException;
    public void setNome(String nome) throws RemoteException;
    public void setEmail(String email) throws RemoteException;
    public void setTotalcompra(double totalcompra) throws RemoteException;
    
    //Gets
    
    public int getId() throws RemoteException;
    public String getNome() throws RemoteException;
    public String getEmail() throws RemoteException;
    public double getTotalcompra() throws RemoteException;
    public double getPorcentagemdesconto() throws RemoteException;
    public double getTotalpagar() throws RemoteException;
    
    //Calc
    
    public void calcularPorcentagemdesconto() throws RemoteException;
    public void calcularTotalPagar() throws RemoteException;
    
    
}