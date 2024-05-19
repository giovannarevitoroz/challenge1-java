package Model;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nomeUsuario;
    private String senha;
    private String email;
    private ArrayList<Veiculo> veiculos;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.veiculos = new ArrayList<>();
    }


    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAno() + ", " + veiculo.getPlaca() + ")");
        }
    }
}