package trabalho;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Principal extends JFrame {
    private JPanel maiPanel;

    public Principal(String titulo) {
        super(titulo);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        maiPanel = new JPanel(new CardLayout());

        ArrayList<String[]> infos = new ArrayList<>();
        Tabela tabela = new Tabela(infos);
        Calcular calcular = new Calcular(infos);
        Registrar registrar = new Registrar(infos, tabela,calcular);

        maiPanel.add(registrar, "Registrar Corte");
        maiPanel.add(tabela, "Ver Tabela");
        maiPanel.add(calcular,"Cálculos");

        JMenuBar menuBar = new JMenuBar();
        JMenu opcoes = new JMenu("Opções");
        JMenuItem registrarCorte = new JMenuItem("Registrar corte");
        JMenuItem verTabela = new JMenuItem("Ver tabela dos cortes");
        JMenuItem calculos = new JMenuItem("Cálculos");

        registrarCorte.addActionListener(e -> showPanel("Registrar Corte"));
        verTabela.addActionListener(e -> showPanel("Ver Tabela"));
        calculos.addActionListener(e -> showPanel("Cálculos"));
        opcoes.add(registrarCorte);
        opcoes.add(verTabela);
        opcoes.add(calculos);
        menuBar.add(opcoes);

        add(menuBar, BorderLayout.NORTH);
        add(maiPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void showPanel(String panelName) {
        CardLayout cardLayout = (CardLayout) maiPanel.getLayout();
        cardLayout.show(maiPanel, panelName);
    }

    public static void main(String[] args) {
        new Principal("Sistema de corte de cabelo");
    }
}
