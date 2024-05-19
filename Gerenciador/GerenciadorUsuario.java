package Gerenciador;
import Model.Usuario;
import Model.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorUsuario {
    private ArrayList<Usuario> usuarios;
    private Scanner scanner;
    private Usuario usuarioLogado;

    public GerenciadorUsuario() {
        this.usuarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void cadastrar() {
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        Usuario usuario = new Usuario(nomeUsuario, senha, email);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void login() {
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNomeUsuario().equals(nomeUsuario) && usuario.getSenha().equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                adicionarVeiculo(usuario);
                return;
            }
        }

        System.out.println("Usuário ou senha inválidos.");

    }

    public void adicionarVeiculo(Usuario usuario) {
        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o ano do veículo: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Digite a quilometragem do veículo: ");
        double quilometragem = scanner.nextDouble();

        Veiculo veiculo = new Veiculo(marca, modelo, ano, placa, quilometragem);
        usuario.adicionarVeiculo(veiculo);
        System.out.println("Veículo adicionado com sucesso!");
    }

    public Usuario getUsuarioLogado() { // add this method
        return usuarioLogado;
    }
}