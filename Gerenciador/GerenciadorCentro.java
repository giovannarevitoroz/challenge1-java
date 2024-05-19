package Gerenciador;

import java.util.ArrayList;
import java.util.List;
import Model.CentroAutomotivo;

public class GerenciadorCentro {
    private List<CentroAutomotivo> centrosAutomotivos;

    public GerenciadorCentro() {
        this.centrosAutomotivos = new ArrayList<>();
    }

    public void adicionarUnidade(CentroAutomotivo centroAutomotivo) {
        this.centrosAutomotivos.add(centroAutomotivo);
    }

    public void listarUnidades() {
        System.out.println("Lista de unidades:");
        for (CentroAutomotivo centroAutomotivo : this.centrosAutomotivos) {
            System.out.println("ID: " + centroAutomotivo.getIdUnidade() +
                    " Endereço: " + centroAutomotivo.getEndereco() +
                    " Telefone: " + centroAutomotivo.getTelefone() +
                    " Serviço: " + centroAutomotivo.getServico() +
                    " Horário de funcionamento: " + centroAutomotivo.getHorarioFuncionamento());
        }
    }
}