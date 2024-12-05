package trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registrar extends JPanel {
    private ArrayList<String[]> infos;

    public Registrar(ArrayList<String[]> infos, Tabela tabela, Calcular calcular) {
        this.infos = infos;
        setLayout(new GridLayout(4, 1));

        JPanel p1 = new JPanel();
        JLabel label = new JLabel("Funcionário: ");
        String[] nomes = {"Jõao", "Abner", "Almir", "Et de Varginha"};
        JComboBox<String> comboBox = new JComboBox<>(nomes);
        p1.add(label);
        p1.add(comboBox);

        JPanel p2 = new JPanel();
        JCheckBox checkBox1 = new JCheckBox("Corte");
        JCheckBox checkBox2 = new JCheckBox("Barba");
        JCheckBox checkBox3 = new JCheckBox("Nevou");
        p2.add(checkBox1);
        p2.add(checkBox2);
        p2.add(checkBox3);

        JPanel p3 = new JPanel();
        JButton botao = new JButton("Registrar");
        p3.add(botao);

        add(p1);
        add(p2);
        add(p3);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = (String) comboBox.getSelectedItem();
                int valor = 0;

                if (checkBox1.isSelected()) valor += 25;
                if (checkBox2.isSelected()) valor += 15;
                if (checkBox3.isSelected()) valor += 30;

                infos.add(new String[]{nome, String.valueOf(valor)});
                tabela.atualizarTabela();
                calcular.atualizarCalculos();
            }
        });
    }
}
