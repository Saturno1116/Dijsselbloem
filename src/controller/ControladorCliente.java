package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class ControladorCliente
{
	ArrayList<Cliente> arCliente;

	public ControladorCliente()
	{
		arCliente = new ArrayList<>();
		
		addCliente(null, null, null, null);
		//consultaCliente(); //
	}
	
	public Cliente addCliente(String nome, String morada, String dataNascimento, String contacto)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza o nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Morada: ");
		morada = sc.nextLine();
		System.out.println("Data de Nascimento: ");
		dataNascimento = sc.nextLine();
		System.out.println("Contacto: ");
		contacto = sc.nextLine();
		
		Cliente c = new Cliente(nome, morada, dataNascimento, contacto);
		
		int novoId = arCliente.size();
		
		c.setId(novoId);
		arCliente.add(c);
		
		return c;
	}
	
	public Cliente getCliente(int id)
	{
		for(Cliente c : arCliente)
		{
			if(c.getId() == id)
			{
				return c;
			}
		}
		
		return null;
	}
	
	/*public void consultaCliente()			//Listagem de Clientes
	{
		for(int i = 0; i < arCliente.size(); i++)
		{
			System.out.println(arCliente.get(i).getId());
			System.out.println(arCliente.get(i).getNome());
			System.out.println(arCliente.get(i).getMorada());
			System.out.println(arCliente.get(i).getDataNascimento());
			System.out.println(arCliente.get(i).getContacto());
		}
	}*/
}
