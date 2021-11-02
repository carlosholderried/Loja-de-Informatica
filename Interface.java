package visualizacao;

import java.util.Scanner;
import java.util.Set;

import produtos.Produtos;
import produtos.Impressora;
import produtos.Notebooks;


public class Interface
{
	int cont = 0;
	public Produtos[] prod = new Produtos[100];
	public int proximoLivre = 0 ;
	
	Scanner entrada = new Scanner(System.in);
	
	public void menuPrincipal()
	{
		System.out.println("0.Sair");	
		System.out.println("1.Cadastrar notebooks");
		System.out.println("2.Cadastrar impressoras");
		System.out.println("3.Ver todos os produtos cadastrados");
		System.out.println("4.Ver todos os produtos cadastrados abaixo de um valor");			
				
		int opcao = entrada.nextInt();
		
		while(opcao != 0)
		{	
			switch(opcao)
			{
			case 1:
					System.out.print("Digite a marca do notebook: ");	
					entrada.nextLine();
					String marca = entrada.nextLine();	  
					
					System.out.print("Digite o preco de custo do notebook: ");					
					double precocusto = entrada.nextDouble();
					
					System.out.print("Digite a memoria do notebook: ");					
					double memoria = entrada.nextDouble();
					
					System.out.print("Digite o tamanho da tela do notebook: ");					
					double tela = entrada.nextDouble();
					
					Notebooks tempNot = new Notebooks(marca,precocusto);
					tempNot.setTela(tela);
					tempNot.setMemoria(memoria);
									
					prod[proximoLivre] = tempNot;
					proximoLivre++;
			break;
			
			case 2:
					System.out.print("Digite a marca da impressora: ");	
					entrada.nextLine();
					marca = entrada.nextLine();	  
					
					System.out.print("Digite o preco de custo da impressora: ");					
					precocusto = entrada.nextDouble();
					
					System.out.print("Digite a memoria da impressora: ");					
					double ppm = entrada.nextDouble();
					
					Impressora tempImp = new Impressora(marca, precocusto);
					tempImp.setPpm(ppm);
									
					prod[proximoLivre] = tempImp;
					proximoLivre++;
						
			break;
			
			case 3:
						for(int i=0; i<proximoLivre; i++)
						{
							System.out.println(prod[i].toString());
						}
				
			break;	
			
			case 4:
						for(int i=0; i<proximoLivre; i++)
						{
							cont = i;
							this.precoFinal();
							System.out.println(prod[i].toString());														
						}										
			break;	
								
			}
			
			System.out.println("\n0.Sair");	
			System.out.println("1.Cadastrar notebooks");
			System.out.println("2.Cadastrar impressoras");
			System.out.println("3.Ver todos os produtos cadastrados");
			System.out.println("4.Ver todos os produtos cadastrados abaixo de um valor");
			opcao = entrada.nextInt();	
			
		}
		
		double precoFinal(){
							
			//if(prod[1].){return ;}	else{return ;}	/// preciso acessar " ppm " da string pra poder comparar  AAAAAAAA
							}
			
																															
	
	}	
}
