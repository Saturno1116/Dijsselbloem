package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.AgenciaViagem;
import model.Cliente;
import model.Reservas;

public class ControladorReserva 
{
	ArrayList<Reservas> arReserva;
	
	public ControladorReserva()
	{
		arReserva = new ArrayList<>();	
		
		ControladorCliente c = new ControladorCliente();
		ControladorAgencia a = new ControladorAgencia();
		
		addReserva(0, c, a, 0, null);
		consultaReserva();
	}
	
	public void addReserva(int nr_pessoas, ControladorCliente c, ControladorAgencia a, double preco, String data)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza o numero de pessoas: ");
		nr_pessoas = sc.nextInt();
		System.out.println("Preco: ");
		preco = sc.nextDouble();
		System.out.println("Data da viagem: ");
		data = sc.nextLine();
		System.out.printf("\n");
		
		Reservas r = new Reservas(nr_pessoas, c, a, preco, data);
		
		int novoID = arReserva.size();
		
		r.setId(novoID);
		
		arReserva.add(r);	
	}
	
	public void consultaReserva()			//Listagem de Clientes
	{
		for(int i = 0; i < arReserva.size(); i++)
		{
			System.out.printf("ID reserva " + arReserva.get(i).getId() + "\n");
			System.out.printf("Numero de pessoas " + arReserva.get(i).getNr_pessoas() + "\n");
			System.out.printf("Nome do Cliente " + arReserva.get(i).getCliente().arCliente.get(i).getNome() + "\n");
			System.out.printf("Morada do Cliente " + arReserva.get(i).getCliente().arCliente.get(i).getMorada() + "\n");
			System.out.printf("Data de Nascimento do Cliente " + arReserva.get(i).getCliente().arCliente.get(i).getDataNascimento() + "\n");
			System.out.printf("Contacto do Cliente " + arReserva.get(i).getCliente().arCliente.get(i).getContacto() + "\n");
			System.out.printf("Nome da Agencia " + arReserva.get(i).getAgencia().arAgencia.get(i).getNome() + "\n");
			System.out.printf("Contacto da Agencia " + arReserva.get(i).getAgencia().arAgencia.get(i).getContacto() + "\n");
			System.out.printf("Localizacao da Agencia " + arReserva.get(i).getAgencia().arAgencia.get(i).getLocalizacao() + "\n");
			//System.out.printf("" + arReserva.get(i).getAgencia().arAgencia.get(i).getDestinos().get(i) + "\n"); //Mostra destinos AINDA NAO FUNCIONA
			System.out.printf("Preco " + arReserva.get(i).getPreco() + "\n");
			System.out.printf("Data da Viagem " + arReserva.get(i).getData() + "\n");
		}
	}

}
