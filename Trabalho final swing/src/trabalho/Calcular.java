package trabalho;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Calcular extends JPanel {
    private ArrayList<String[]> infos;

    public Calcular(ArrayList<String[]> infos) {
        this.infos = infos;
        setLayout(new GridLayout(0, 1));
    }

    public void atualizarCalculos() {
        removeAll();
        double totalArrecadado = 0;
        double totalPagamentoFuncionarios = 0;

        java.util.Map<String, Double> pagamentos = new java.util.HashMap<>();

        for (String[] info : infos) {
            String nome = info[0];
            double valorArrecadado = Double.parseDouble(info[1]);
            double pagamentoFuncionario = valorArrecadado * 0.4;

            pagamentos.put(nome, pagamentos.getOrDefault(nome, 0.0) + pagamentoFuncionario);

            totalArrecadado += valorArrecadado;
            totalPagamentoFuncionarios += pagamentoFuncionario;
        }

        for (String nome : pagamentos.keySet()) {
            add(new JLabel(nome + " deve receber: R$ " + pagamentos.get(nome)));
        }

        double lucro = totalArrecadado - totalPagamentoFuncionarios;
        double valorRetirado = lucro * 0.3;
        double caixa = lucro - valorRetirado;

        add(new JLabel("Total arrecadado: R$ " + totalArrecadado));
        add(new JLabel("Total a pagar aos funcionários: R$ " + totalPagamentoFuncionarios));
        add(new JLabel("Lucro: R$ " + lucro));
        add(new JLabel("Valor que pode ser retirado (30% do lucro): R$ " + valorRetirado));
        add(new JLabel("Valor restante no caixa: R$ " + caixa));

        revalidate();
        repaint();
    }
}
