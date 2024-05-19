package Model;

public class CentroAutomotivo {
    private int idUnidade;
    private String endereco;
    private String telefone;
    private Servico servico;
    private double horarioFuncionamento;

    public CentroAutomotivo(int idUnidade, String endereco, String telefone, Servico servico, double horarioFuncionamento) {
        this.idUnidade = idUnidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.servico = servico;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public double getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(double horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }
}
