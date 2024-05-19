package Gerenciador;

import Model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GerenciadorVeiculo {
    private List<Veiculo> veiculos;

    public GerenciadorVeiculo() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        return this.veiculos;
    }

    public List<Veiculo> buscarVeiculosPorModelo(String modelo) {
        List<Veiculo> veiculosEncontrados = new ArrayList<>();
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                veiculosEncontrados.add(veiculo);
            }
        }
        return veiculosEncontrados;
    }
}