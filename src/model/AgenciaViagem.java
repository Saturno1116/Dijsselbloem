package model;

import java.util.ArrayList;

public class AgenciaViagem
{
	String nome, contacto, localizacao;
	int id;
	ArrayList<String> destinos;
	
	public AgenciaViagem(String nome, String contacto, String localizacao, ArrayList<String> destinos)
	{
		super();
		this.nome = nome;
		this.contacto = contacto;
		this.localizacao = localizacao;
		this.destinos = destinos;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getContacto()
	{
		return contacto;
	}

	public void setContacto(String contacto)
	{
		this.contacto = contacto;
	}

	public String getLocalizacao()
	{
		return localizacao;
	}

	public void setLocalizacao(String localizacao)
	{
		this.localizacao = localizacao;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public ArrayList<String> getDestinos()
	{
		return destinos;
	}

	public void setDestinos(ArrayList<String> destinos)
	{
		this.destinos = destinos;
	}
}
