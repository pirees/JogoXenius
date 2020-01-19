package Telas;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.border.EmptyBorder;
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

public class TelaRanking_Medio extends JFrame {

	private JPanel jpn;
	private JTable table;
	private JButton bVoltar;
	private JLabel lblPontos;
	private JLabel lblAvatar;
	public DefaultTableModel modelo;
	private TableRowSorter tableSorter;

	public TelaRanking_Medio() {
		
		super("Xenius - A melhor versão");
		//INSTANCIOANDO Tela, botoes e labels
		jpn = new JPanel();
		table = new JTable();
		lblPontos = new JLabel("PONTOS");
		bVoltar = new JButton("VOLTAR");
		lblAvatar = new JLabel("AVATAR");
		
		//SET Foreground e Background
		jpn.setBackground(new Color(47, 79, 79));
		bVoltar.setBackground(new Color(255, 215, 0));
		bVoltar.setForeground(Color.BLACK);
		
		// set Tamanho
		jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblAvatar.setBounds(272, 79, 70, 14);
		table.setBounds(234, 104, 273, 256);
		lblPontos.setBounds(405, 79, 70, 14);
		bVoltar.setBounds(10, 48, 100, 37);
		
		//SET FONTE
		lblAvatar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPontos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		//ADICIONANDO BOTES E LABELS A TELA
		jpn.add(lblAvatar);
		jpn.add(lblPontos);
		jpn.add(bVoltar);
		jpn.add(table);
		setContentPane(jpn);
		jpn.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		
		Ranking R = new Ranking();
		
		modelo =(DefaultTableModel) table.getModel();
		modelo.setNumRows(0);
		modelo.addColumn("Avatar");
		modelo.addColumn("Pontos");

		tableSorter = new TableRowSorter(modelo);
		table.setRowSorter(tableSorter);
		List<RowSorter.SortKey> sortKeys = new ArrayList<>();		 
		sortKeys.add(new RowSorter.SortKey(1,SortOrder.DESCENDING));
	    tableSorter.setSortKeys(sortKeys);
		
		List <Ranking> lista_ranking = R.Ler();
		Object dados [] = new Object[2];
		for (int i = 0; i<lista_ranking.size(); i++) {
			if(lista_ranking.get(i).getDificuldade().getNome().equals("Médio")) {
				dados [0] = lista_ranking.get(i).getJogo().getNomeUsuario();
				dados [1] = lista_ranking.get(i).getJogo().getPontos();
				modelo.addRow(dados);	
			}
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
