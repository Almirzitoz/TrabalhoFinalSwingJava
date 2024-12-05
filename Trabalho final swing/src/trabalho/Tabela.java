package trabalho;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Tabela extends JPanel {
    private DefaultTableModel dados;
    private ArrayList<String[]> infos;

    public Tabela(ArrayList<String[]> infos) {
        this.infos = infos;
        setLayout(new BorderLayout());

        String[] colunas = {"Funcionário", "Valor"};
        dados = new DefaultTableModel(colunas, 0);

        JTable table = new JTable(dados);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
        atualizarTabela();
    }

    public void atualizarTabela() {
        dados.setRowCount(0);
        for (String[] info : infos) {
            dados.addRow(info);
        }
    }
}
