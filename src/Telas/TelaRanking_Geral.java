package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Classes.Ranking;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import javax.swing.JButton;

public class TelaRanking_Geral extends JFrame {

	private JPanel jpn;
	private JButton bVoltar;
	private JLabel lblAvatar;
	private JLabel lblPontos;
	private JLabel lblNivel;
	public DefaultTableModel modelo;
	private JTable table;
	private TableRowSorter tableSorter;

	public TelaRanking_Geral(){
		
		
		super("Xenius - A melhor versão");
		//INSTANCIOANDO Tela, botoes e labels
		jpn = new JPanel();
		table = new JTable();
		lblAvatar = new JLabel("AVATAR");
		lblPontos = new JLabel("PONTOS");
		lblNivel = new JLabel("NIVEL");
	    bVoltar = new JButton("VOLTAR");
	   
		//SET Foreground e Background
	    jpn.setBackground(new Color(47, 79, 79));
	    bVoltar.setBackground(new Color(255, 215, 0));
		bVoltar.setForeground(Color.BLACK);
	    
	    // set Tamanho
	    jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
	    lblAvatar.setBounds(151, 95, 80, 14);
	    lblPontos.setBounds(271, 95, 73, 14);
	    lblNivel.setBounds(412, 95, 57, 14);
	    bVoltar.setBounds(10, 48, 100, 37);
	    table.setBounds(132, 120, 361, 226);
	    
	    //SET FONTE
	    lblAvatar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
	    lblPontos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
	    lblNivel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
	    
	  //ADICIONANDO BOTES E LABELS A TELA
	    setContentPane(jpn);
		jpn.setLayout(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		jpn.add(lblAvatar);		
		jpn.add(lblPontos);	
		jpn.add(lblNivel);
		jpn.add(bVoltar);
		jpn.add(table);

		Ranking R = new Ranking();
		
		modelo =(DefaultTableModel) table.getModel();
		modelo.setNumRows(0);
		modelo.addColumn("Avatar");
		modelo.addColumn("Dificuldade");
		modelo.addColumn("Pontos");

		tableSorter = new TableRowSorter(modelo);
		table.setRowSorter(tableSorter);
		List<RowSorter.SortKey> sortKeys = new ArrayList<>();		 
		sortKeys.add(new RowSorter.SortKey(1,SortOrder.DESCENDING));
	    tableSorter.setSortKeys(sortKeys);
		
		for(Ranking rk: R.Ler()) {
			 modelo.addRow(new Object[] {
					 rk.getJogo().getNomeUsuario(), rk.getJogo().getPontos(), rk.getDificuldade().getNome()
			 });
		}
		
		bVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRanking p = new TelaRanking();
				p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				p.setSize(640,480);
				p.setResizable(false);
				p.setVisible(true);
			}
		});
		bVoltar.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bVoltar.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bVoltar.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bVoltar.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bVoltar.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bVoltar.setBackground(Color.YELLOW);
		}
    });
	}
}
