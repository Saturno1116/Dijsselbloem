package model;

public class Cliente 
{
	String nome, morada, DataNascimento, Contacto;
	int id;
	
	public Cliente(String nome, String morada, String dataNascimento, String contacto) 
	{
		super();
		this.nome = nome;
		this.morada = morada;
		this.DataNascimento = dataNascimento;
		this.Contacto = contacto;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getMorada()
	{
		return morada;
	}

	public void setMorada(String morada)
	{
		this.morada = morada;
	}

	public String getDataNascimento()
	{
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento)
	{
		DataNascimento = dataNascimento;
	}

	public String getContacto() 
	{
		return Contacto;
	}

	public void setContacto(String contacto) 
	{
		Contacto = contacto;
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
