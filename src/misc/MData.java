package misc;

import java.util.ArrayList;
import java.util.Scanner;

import model.AgenciaViagem;
import model.Cliente;

public class MData 
{	
	public MData()
	{
		viagens();
		mostraDestino();
		procuraDestino(nomeDestino());
	}
	
	public static ArrayList<String> d = new ArrayList<>();
	public static void viagens()
	{
		d.add("Roma");
		d.add("Amsterdao");
		d.add("Nova Iorque");
		d.add("Brasil");
		d.add("Japao");
	}
	
	public static AgenciaViagem av = new AgenciaViagem("ViagensLuso", "213541287", "Lisboa", d);
	public static Cliente cl = new Cliente("Abel", "Seixal", "19-10-1990", "918754126");

	public static void mostraDestino()
	{
		for(int i = 0; i < d.size(); i++)
		{
			System.out.println(d.get(i));
		}
			
	}
	
	public String nomeDestino()
	{
		System.out.println("Introduza o destino pretendido");
		String destino = (new Scanner(System.in).nextLine());
		
		return destino;
	}
	
	public static void procuraDestino(String destino)
	{
		
		for(int i = 0; i < d.size(); i++)
		{
			if(d.get(i).contains(destino))
			{
				System.out.println("Destino ENCONTRADO");
				break;
			}
		}
			
	}
}