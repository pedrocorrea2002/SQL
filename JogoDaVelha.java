import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		
		String[][] Tabuleiro = new String[3][3];
		int status = 0;
		Scanner leitor = new Scanner(System.in);
		String Player1 = null;
		String Player2 = null;
		int Prosseguir = 0;
		String Player = null;
		
		Tabuleiro[0][0] = " ";
		Tabuleiro[0][1] = " ";
		Tabuleiro[0][2] = " ";
		Tabuleiro[1][0] = " ";
		Tabuleiro[1][1] = " ";
		Tabuleiro[1][2] = " ";
		Tabuleiro[2][0] = " ";
		Tabuleiro[2][1] = " ";
		Tabuleiro[2][2] = " ";
		
		while(Prosseguir == 0 ) {
					
					int Switch = 3;	
					
					Player1 = null;	
					System.out.println("Jogador 1, insira seu nome:");
					Player1 = leitor.next().trim();
					System.out.println("Jogador 1, seu nome é "+Player1+"?");
					System.out.println("1 - SIM");
					System.out.println("2 - NÃO");
					do{	
						try{
						 Switch = Integer.parseInt(leitor.next());
						} catch (NumberFormatException e){
							System.out.println("Não entendi, repita por favor");
							Switch = 3;
						}}while((Switch > 2)&&(Switch < 1));
					
					if(Switch == 2) {
						Prosseguir = 0;}
					if(Switch == 1) {
						Prosseguir = 1;}
					}
		
		Prosseguir = 0;
		
		while(Prosseguir == 0 ) {
			
			int Switch = 3;	
			
			Player2 = null;	
			System.out.println("Jogador 2, insira seu nome:");
			Player2 = leitor.next().trim();
			System.out.println("Jogador 2, seu nome é "+Player2+"?");
			System.out.println("1 - SIM");
			System.out.println("2 - NÃO");
			do{	
				try{
				 Switch = Integer.parseInt(leitor.next());
				} catch (NumberFormatException e){
					System.out.println("Não entendi, repita por favor");
					Switch = 3;
				}}while((Switch > 2)&&(Switch < 1));
			
			if(Switch == 2) {
				Prosseguir = 0;}
			if(Switch == 1) {
				Prosseguir = 1;}
			}
		Player = Player2;

		while(status == 0) {
			System.out.println("");
			
			int A=0,B=0;
			if(Player == Player1) {
				Player = Player2;
			}
			else if(Player == Player2) {
				Player = Player1;
			}
			
			
			System.out.println("Jogador: " + Player);
			System.out.println("FAÇA SUA JOGADA");
			System.out.println("");
			System.out.println("      _"+"|1|"+"2"+"|3|");
			System.out.println("      1|"+Tabuleiro[0][0] + "|"+Tabuleiro[0][1] + "|"+Tabuleiro[0][2] + "|");
			System.out.println("      2|"+Tabuleiro[1][0] + "|"+Tabuleiro[1][1] + "|"+Tabuleiro[1][2] + "|");
			System.out.println("      3|"+Tabuleiro[2][0] + "|"+Tabuleiro[2][1] + "|"+Tabuleiro[2][2] + "|");
			
			
			
			int Jogada=0;
			
			do {
				
			do{	System.out.println("");
				System.out.print("Digite o número da linha:");
				A=0;
				try{
				 A = Integer.parseInt(leitor.next());
				} catch (NumberFormatException e){
					System.out.println("Não entendi, repita por favor");
				}}while((A <= 0)|(A > 3));
			
	
			
			do{	System.out.println("");
			System.out.print("Digite o número da coluna:");
				B=0;
				try{
				 B = Integer.parseInt(leitor.next());
				} catch (NumberFormatException e){
					System.out.println("Não entendi, repita por favor");
				}}while((B <= 0)|(B > 3));
			
			if((Tabuleiro[A-1][B-1] == " ") & (Player == Player1)) {
				Tabuleiro[A-1][B-1] = "X";
				Jogada = 0;
			}
			else if((Tabuleiro[A-1][B-1] == " ") & (Player == Player2)) {
				Tabuleiro[A-1][B-1] = "O";
				Jogada = 0;
			}
			else if(Tabuleiro[A-1][B-1] != " ") {
				System.out.print("");
				System.out.print("Casa cheia, tente novamente");
				Jogada = 1;
			}}while(Jogada == 1);
			
			if(
					((Tabuleiro[0][0] == "X")&&(Tabuleiro[0][1] == "X")&&(Tabuleiro[0][2] == "X"))|	
					((Tabuleiro[1][0] == "X")&&(Tabuleiro[1][1] == "X")&&(Tabuleiro[1][2] == "X"))|
					((Tabuleiro[2][0] == "X")&&(Tabuleiro[2][1] == "X")&&(Tabuleiro[2][2] == "X"))|	
					((Tabuleiro[0][0] == "X")&&(Tabuleiro[1][0] == "X")&&(Tabuleiro[2][0] == "X"))|	
					((Tabuleiro[0][1] == "X")&&(Tabuleiro[1][1] == "X")&&(Tabuleiro[2][1] == "X"))|	
					((Tabuleiro[0][2] == "X")&&(Tabuleiro[1][2] == "X")&&(Tabuleiro[2][2] == "X"))|	
					((Tabuleiro[0][0] == "X")&&(Tabuleiro[1][1] == "X")&&(Tabuleiro[2][2] == "X"))|
					((Tabuleiro[0][2] == "X")&&(Tabuleiro[1][1] == "X")&&(Tabuleiro[2][0] == "X"))
					) {
				System.out.println("");
				System.out.println("||||||| Vitória de "+Player1+" |||||||");
				System.out.println("");
				System.out.println("             _"+"|1|"+"2"+"|3|");
				System.out.println("             1|"+Tabuleiro[0][0] + "|"+Tabuleiro[0][1] + "|"+Tabuleiro[0][2] + "|");
				System.out.println("             2|"+Tabuleiro[1][0] + "|"+Tabuleiro[1][1] + "|"+Tabuleiro[1][2] + "|");
				System.out.println("             3|"+Tabuleiro[2][0] + "|"+Tabuleiro[2][1] + "|"+Tabuleiro[2][2] + "|");
				System.out.println("");
				System.out.print("||||||||||||||");
				
				for(int C = 0;C<(("_Vitória de "+Player1).length() + 1);C++) {System.out.print("|");}
				
				status = 1;
			}
			else if(
					((Tabuleiro[0][0] == "O")&&(Tabuleiro[0][1] == "O")&&(Tabuleiro[0][2] == "O"))|	
					((Tabuleiro[1][0] == "O")&&(Tabuleiro[1][1] == "O")&&(Tabuleiro[1][2] == "O"))|	
					((Tabuleiro[2][0] == "O")&&(Tabuleiro[2][1] == "O")&&(Tabuleiro[2][2] == "O"))|	
					((Tabuleiro[0][0] == "O")&&(Tabuleiro[1][0] == "O")&&(Tabuleiro[2][0] == "O"))|	
					((Tabuleiro[0][1] == "O")&&(Tabuleiro[1][1] == "O")&&(Tabuleiro[2][1] == "O"))|	
					((Tabuleiro[0][2] == "O")&&(Tabuleiro[1][2] == "O")&&(Tabuleiro[2][2] == "O"))|	
					((Tabuleiro[0][0] == "O")&&(Tabuleiro[1][1] == "O")&&(Tabuleiro[2][2] == "O"))|
					((Tabuleiro[0][2] == "O")&&(Tabuleiro[1][1] == "O")&&(Tabuleiro[2][0] == "O"))
					) {
				System.out.println("");
				System.out.println("||||||| Vitória de "+Player2+" |||||||");
				System.out.println("");
				System.out.println("             _"+"|1|"+"2"+"|3|");
				System.out.println("             1|"+Tabuleiro[0][0] + "|"+Tabuleiro[0][1] + "|"+Tabuleiro[0][2] + "|");
				System.out.println("             2|"+Tabuleiro[1][0] + "|"+Tabuleiro[1][1] + "|"+Tabuleiro[1][2] + "|");
				System.out.println("             3|"+Tabuleiro[2][0] + "|"+Tabuleiro[2][1] + "|"+Tabuleiro[2][2] + "|");
				System.out.println("");
				System.out.print("||||||||||||||");
				for(int C = 0;C<(("_Vitória de "+Player2).length() + 1);C++) {System.out.print("|");}
				
				status = 1;
			}
			
			else if(
					((Tabuleiro[0][0] != " ")&&(Tabuleiro[0][1] != " ")&&(Tabuleiro[0][2] != " "))&&
					((Tabuleiro[1][0] != " ")&&(Tabuleiro[1][1] != " ")&&(Tabuleiro[1][2] != " "))&&	
					((Tabuleiro[2][0] != " ")&&(Tabuleiro[2][1] != " ")&&(Tabuleiro[2][2] != " "))&&	
					((Tabuleiro[0][0] != " ")&&(Tabuleiro[1][0] != " ")&&(Tabuleiro[2][0] != " "))&&	
					((Tabuleiro[0][1] != " ")&&(Tabuleiro[1][1] != " ")&&(Tabuleiro[2][1] != " "))&&	
					((Tabuleiro[0][2] != " ")&&(Tabuleiro[1][2] != " ")&&(Tabuleiro[2][2] != " "))&&	
					((Tabuleiro[0][0] != " ")&&(Tabuleiro[1][1] != " ")&&(Tabuleiro[2][2] != " "))&&
					((Tabuleiro[0][2] != " ")&&(Tabuleiro[1][1] != " ")&&(Tabuleiro[2][0] != " "))
					) {
				System.out.println("");
				
				System.out.println("||||||| EMPATE |||||||");
				System.out.println("");
				System.out.println("        _"+"|1|"+"2"+"|3|");
				System.out.println("        1|"+Tabuleiro[0][0] + "|"+Tabuleiro[0][1] + "|"+Tabuleiro[0][2] + "|");
				System.out.println("        2|"+Tabuleiro[1][0] + "|"+Tabuleiro[1][1] + "|"+Tabuleiro[1][2] + "|");
				System.out.println("        3|"+Tabuleiro[2][0] + "|"+Tabuleiro[2][1] + "|"+Tabuleiro[2][2] + "|");
				System.out.println("");
				System.out.println("||||||||||||||||||||||");
				
				
				status = 1;
			}
			
			else {status = 0;}
			
		}
		
	}
}
