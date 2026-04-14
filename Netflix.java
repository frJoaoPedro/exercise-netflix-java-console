import java.util.Scanner;
public class Netflix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha, idade;
        String pais;
        System.out.println("Bem vindo(a), a Netfix do código.");
        System.out.println("Selecione o seu plano: ");
        escolha = sc.nextInt();
        sc.nextLine();

        switch(escolha){
            case 1:
                System.out.println("Resolução 720p - 1 tela disponível.");
            break;

            case 2:
                System.out.println("Resolução 1080p (Full HD) - 2 telas disponíveis.");
            break;

            case 3:
                System.out.println("Resolução 4K + HDR - 4 telas disponíveis");
            break;

            default:
               System.out.println("Código de plano inválido.");
    }
         System.out.println("agora vamos classificar sua idade.");
         System.out.println("digite sua idade: ");
         idade = sc.nextInt();
         if(idade < 12){
            System.out.println("Categoria: Infantil (Desenhos e Animações).");
         }
         else if(idade >= 12 && idade <= 17){
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura)");
         }
         else{
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");
         }
         System.out.println("por fim, um bonus regional");
         System.out.println(" digite aqui o seu pais");
         pais = sc.nextLine();
         if( pais.equalsIgnoreCase("BRASIL")){
            System.out.println("Destaque: Assista agora produções originais brasileiras!");
         }
         else{
            System.out.println("SEJA BEM VINDO(A).");
         }
    sc.close();
    
}
}
