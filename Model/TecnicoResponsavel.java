package Model;
public class TecnicoResponsavel {
    private String matricula;
    private String nome;
    private String cargo;
    private String centroAutomotivo;

    public TecnicoResponsavel(String matricula, String nome, String cargo, String centroAutomotivo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.centroAutomotivo = centroAutomotivo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCentroAutomotivo() {
        return centroAutomotivo;
    }

    public void setCentroAutomotivo(String centroAutomotivo) {
        this.centroAutomotivo = centroAutomotivo;
    }
}