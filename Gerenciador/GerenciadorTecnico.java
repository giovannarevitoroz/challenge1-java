package Gerenciador;
import Model.TecnicoResponsavel;

public class GerenciadorTecnico {
    private TecnicoResponsavel tecnicoResponsavel;

    public GerenciadorTecnico() {
    }

    public void alterarCargo(String novoCargo) {
        this.tecnicoResponsavel.setCargo(novoCargo);
    }

    public void alterarCentroAutomotivo(String novoCentroAutomotivo) {
        this.tecnicoResponsavel.setCentroAutomotivo(novoCentroAutomotivo);
    }
}