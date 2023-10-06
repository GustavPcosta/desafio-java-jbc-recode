package principal;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DesafioDao desafio = new DesafioDao();
        DestinoDao destino = new DestinoDao();
        
        
    
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção:");
        System.out.println("1. Salvar usuário");
        System.out.println("2. Remover usuário");
        System.out.println("3. Atualizar usuário");
        System.out.println("Opção Destino:");
        System.out.println("4. Salvar destino");
        System.out.println("5. Remover destino");
        System.out.println("6. Atualizar destino");
        

        int opcao = scanner.nextInt();
        scanner.nextLine();//CONSOME TUDO SEM ERROS;

        switch (opcao) {
            case 1:
                System.out.println("Informe o nome: ");
                String nome = scanner.nextLine();

                System.out.println("Informe o email: ");
                String email = scanner.nextLine();

                System.out.println("Informe a senha: ");
                String senha = scanner.nextLine();

                Date dataCadastro = new Date();

                Desafio usuario = new Desafio();
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setDataCadastro(dataCadastro);
                usuario.setSenha(senha);
                desafio.save(usuario);
                break;
            case 2:
                System.out.println("Informe o ID do usuário a ser removido: ");
                int id = scanner.nextInt();
                desafio.remove(id);
                break;
            case 3:
                System.out.println("Informe o ID do usuário a ser atualizado: ");
                int idToUpdate = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Informe o novo nome: ");
                String novoNome = scanner.nextLine();

                System.out.println("Informe o novo email: ");
                String novoEmail = scanner.nextLine();

                System.out.println("Informe a nova senha: ");
                String novaSenha = scanner.nextLine();

                Date novaDataCadastro = new Date();
                Desafio usuarioAtualizado = new Desafio();
                usuarioAtualizado.setId(idToUpdate);
                usuarioAtualizado.setNome(novoNome);
                usuarioAtualizado.setEmail(novoEmail);
                usuarioAtualizado.setDataCadastro(novaDataCadastro);
                usuarioAtualizado.setSenha(novaSenha);

                desafio.update(usuarioAtualizado);
                break;
            //
                
            case 4:
                //System.out.println("Àrea de destino: ");
              
                System.out.println("Salvar destino: ");
                
                System.out.println("Informe o nome: ");
                String nomeDestino = scanner.nextLine();
                
                
                System.out.println("Informe o sobrenome: ");
                String sobrenome = scanner.nextLine();
                
                System.out.println("Informe o tipo de pagamento: ");
                String pagamento = scanner.nextLine();
                
                System.out.println("Informe o email: ");
                String emailDestino = scanner.nextLine();

                System.out.println("Informe o Estado: ");
                String estadoDestino = scanner.nextLine();
                
     
                
                
                System.out.println("Informe o cep: ");
                String cep = scanner.nextLine();
                

                DesafioDestino destino1 = new DesafioDestino();
                
                destino1.setNome(nomeDestino);
                destino1.setSobrenome(sobrenome);
                destino1.setEmail(emailDestino);
                destino1.setEstado(estadoDestino);
                destino1.setPagamento(pagamento);
                destino1.setCep(cep);
         
                destino.save(destino1);
               break;
               
            case 5:
            	System.out.println("Informe o ID do destiono para ser removido: ");
                int id1 = scanner.nextInt();
                destino.remove(id1);
                break;
                
                
            case 6:
            	System.out.println("Informe o ID do usuário a ser atualizado: ");
                int idToUpdateDestino = scanner.nextInt();
                scanner.nextLine();
               
                System.out.println("Informe o novo nome : ");
                String novoNomeDestino = scanner.nextLine();

                System.out.println("Informe o novo email: ");
                String novoEmailDestino = scanner.nextLine();

                System.out.println("Informe a nova senha: ");
                String novoSobrenome = scanner.nextLine();
                
                System.out.println("Informe a nova senha: ");
                String novoEstado = scanner.nextLine();
                System.out.println("Informe a nova senha: ");
                
                String novoCep = scanner.nextLine();

               
                DesafioDestino usuarioAtualizadoDestino = new DesafioDestino();
                
                usuarioAtualizadoDestino.setId(idToUpdateDestino);
                usuarioAtualizadoDestino.setNome(novoNomeDestino);
                usuarioAtualizadoDestino.setEmail(novoEmailDestino);
                usuarioAtualizadoDestino.setEstado(novoEstado);
                usuarioAtualizadoDestino.setSobrenome(novoSobrenome);
                usuarioAtualizadoDestino.setCep(novoCep);
                
                

                destino.update(usuarioAtualizadoDestino);
            	
            	
            break;
            default:
                System.out.println("Opção inválida.");
               
        }
        
        
    }
    
    
}



