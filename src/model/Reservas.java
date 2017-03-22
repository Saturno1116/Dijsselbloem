package model;

import controller.ControladorAgencia;
import controller.ControladorCliente;

public class Reservas
{
	int nr_pessoas, id;
	ControladorCliente cliente;
	ControladorAgencia agencia;
	double preco;
	String data;
	
	public Reservas(int nr_pessoas, ControladorCliente c, ControladorAgencia a, double preco, String data)
	{
		super();
		this.nr_pessoas = nr_pessoas;
		this.cliente = c;
		this.agencia = a;
		this.preco = preco;
		this.data = data;
	}

	public int getNr_pessoas()
	{
		return nr_pessoas;
	}

	public void setNr_pessoas(int nr_pessoas)
	{
		this.nr_pessoas = nr_pessoas;
	}

	public ControladorCliente getCliente()
	{
		return cliente;
	}

	public void setCliente(ControladorCliente cliente)
	{
		this.cliente = cliente;
	}

	public ControladorAgencia getAgencia()
	{
		return agencia;
	}

	public void setAgencia(ControladorAgencia agencia)
	{
		this.agencia = agencia;
	}

	public double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco) 
	{
		this.preco = preco;
	}

	public String getData() 
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}	
	
}
