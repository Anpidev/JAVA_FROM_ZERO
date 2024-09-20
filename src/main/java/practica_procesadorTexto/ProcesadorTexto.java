package practica_procesadorTexto;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto {
    public static void main(String[] args) {
        MarcoProcesador miMarco = new MarcoProcesador();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoProcesador extends JFrame {
    public MarcoProcesador() {
        setBounds(500, 500, 700, 500);
        add(new LaminaProcesador());
        setVisible(true);
    }
}

class LaminaProcesador extends JPanel {
    private JTextPane texto;

    public LaminaProcesador() {
        setLayout(new BorderLayout());
        JPanel superior = new JPanel();
        JPanel central = new JPanel();

        // Elementos del panel superior
        JMenuBar barra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu size = new JMenu("Tamaño");

        // Items de cada menú
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem courier = new JMenuItem("Courier");
        JMenuItem verdana = new JMenuItem("Verdana");
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        JMenuItem size12 = new JMenuItem("12");
        JMenuItem size14 = new JMenuItem("14");
        JMenuItem size16 = new JMenuItem("16");
        JMenuItem size18 = new JMenuItem("18");

        // Añadiendo los elementos y menús
        fuente.add(arial);
        fuente.add(courier);
        fuente.add(verdana);
        estilo.add(negrita);
        estilo.add(cursiva);
        size.add(size12);
        size.add(size14);
        size.add(size16);
        size.add(size18);

        // Añadiendo los menús a la barra
        barra.add(fuente);
        barra.add(estilo);
        barra.add(size);
        superior.add(barra);

        // Añadiendo el panel superior
        add(superior, BorderLayout.NORTH);

        // Elementos del panel central
        texto = new JTextPane();
        central.add(texto);
        add(central, BorderLayout.CENTER);

        // ActionListener para cambiar la fuente usando StyledEditorKit
        arial.addActionListener(new StyledEditorKit.FontFamilyAction("fuenteArial", "Arial"));
        courier.addActionListener(new StyledEditorKit.FontFamilyAction("fuenteCourier", "Courier"));
        verdana.addActionListener(new StyledEditorKit.FontFamilyAction("fuenteVerdana", "Verdana"));

        // ActionListener para cambiar el estilo (negrita, cursiva)
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());

        // ActionListener para cambiar el tamaño usando StyledEditorKit
        size12.addActionListener(new StyledEditorKit.FontSizeAction("tamaño12", 12));
        size14.addActionListener(new StyledEditorKit.FontSizeAction("tamaño14", 14));
        size16.addActionListener(new StyledEditorKit.FontSizeAction("tamaño16", 16));
        size18.addActionListener(new StyledEditorKit.FontSizeAction("tamaño18", 18));
    }
}
