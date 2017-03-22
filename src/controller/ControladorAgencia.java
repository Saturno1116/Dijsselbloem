package controller;

import java.util.ArrayList;
import java.util.Scanner;

import misc.MData;
import model.AgenciaViagem;

public class ControladorAgencia 
{
		ArrayList<AgenciaViagem> arAgencia;

		public ControladorAgencia()
		{
			arAgencia = new ArrayList<>();
			
			addAgencia(null, null, null, null);
		}
		
		public void addAgencia(String nome, String contacto, String localizacao, ArrayList<String> destinos)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduza o nome da Agencia: ");
			nome = sc.nextLine();
			System.out.println("Contacto: ");
			contacto = sc.nextLine();
			System.out.println("Localizacao: ");
			localizacao = sc.nextLine();
			destinos = MData.d;
			
			AgenciaViagem av = new AgenciaViagem(nome, contacto, localizacao, destinos);
			
			int novoId = arAgencia.size();
			
			av.setId(novoId);
			arAgencia.add(av);
		}
		
		public AgenciaViagem getAgencia(int id)
		{
			for(AgenciaViagem av : arAgencia)
			{
				if(av.getId() == id)
				{
					return av;
				}
			}
			
			return null;
		}
}
