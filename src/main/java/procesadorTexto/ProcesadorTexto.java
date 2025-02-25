package procesadorTexto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyleConstants;

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
	private JToolBar herramientas;

	public LaminaProcesador() {
		setLayout(new BorderLayout());
		JPanel superior = new JPanel(new FlowLayout(FlowLayout.CENTER));

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

		// Añadir la barra al panel superior
		superior.add(barra);

		// Añadiendo el panel superior
		add(superior, BorderLayout.NORTH);

		// Elementos del panel central
		texto = new JTextPane();
		add(texto, BorderLayout.CENTER);

		// Crear barra de herramientas flotante y movible (inicialmente vertical)
		herramientas = new JToolBar(JToolBar.VERTICAL); // Inicialización vertical
		herramientas.setFloatable(true); // Permite que el usuario mueva la barra

		// Botones de la barra de herramientas
		JButton negritaBoton = new JButton(new ImageIcon("src/main/java/procesadorTexto/negrita.png"));
		JButton cursivaBoton = new JButton(new ImageIcon("src/main/java/procesadorTexto/cursiva.png"));
		JButton subrayaBoton = new JButton(new ImageIcon("src/main/java/procesadorTexto/subrayar.png"));
		JButton rojoBoton = new JButton(new ImageIcon("src/main/java/procesadorTexto/rojo.png"));
		JButton azulBoton = new JButton(new ImageIcon("src/main/java/procesadorTexto/azul.png"));
		JButton verdeBoton = new JButton(new ImageIcon("src/main/java/procesadorTexto/verde.png"));
		JButton aliCentro = new JButton(new ImageIcon("src/main/java/procesadorTexto/centro.png"));
		JButton aliDerecha = new JButton(new ImageIcon("src/main/java/procesadorTexto/derecha.png"));
		JButton aliIzquierda = new JButton(new ImageIcon("src/main/java/procesadorTexto/izquierda.png"));

		// Añadir ActionListener a los botones
		negritaBoton.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBoton.addActionListener(new StyledEditorKit.ItalicAction());
		subrayaBoton.addActionListener(new StyledEditorKit.UnderlineAction());

		// Acciones para colores del texto
		rojoBoton.addActionListener(new StyledEditorKit.ForegroundAction("color rojo", Color.RED));
		azulBoton.addActionListener(new StyledEditorKit.ForegroundAction("color azul", Color.BLUE));
		verdeBoton.addActionListener(new StyledEditorKit.ForegroundAction("color verde", Color.GREEN));

		// Acciones para alinear el texto
		aliCentro.addActionListener(new StyledEditorKit.AlignmentAction("Centro", StyleConstants.ALIGN_CENTER));
		aliDerecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", StyleConstants.ALIGN_RIGHT));
		aliIzquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", StyleConstants.ALIGN_LEFT));

		// Añadir botones a la barra de herramientas
		herramientas.add(negritaBoton);
		herramientas.add(cursivaBoton);
		herramientas.add(subrayaBoton);
		herramientas.add(rojoBoton);
		herramientas.add(azulBoton);
		herramientas.add(verdeBoton);
		herramientas.add(aliCentro);
		herramientas.add(aliDerecha);
		herramientas.add(aliIzquierda);

		// Añadir la barra de herramientas al panel en la parte izquierda (inicialmente)
		add(herramientas, BorderLayout.WEST);

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
