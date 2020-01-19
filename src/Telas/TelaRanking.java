package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Jogo;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TelaRanking extends JFrame {

	private JPanel jpn;
	private JButton bFacil;
	private JButton bGeral;
	private JButton bMedio;
	private JButton bDificil;
	private JButton bSuperDificil;
	private JButton bVoltar;



	public TelaRanking() {
		
		super("Xenius - A melhor versão");
		
		//INSTANCIOANDO Tela, botoes e labels
		jpn = new JPanel();
		bGeral = new JButton("GERAL");
		bFacil = new JButton("FACIL");
		bMedio = new JButton("MEDIO");
		bDificil = new JButton("DIFICIL");
		bSuperDificil = new JButton("SUPER DIFICIL");
		bVoltar = new JButton("VOLTAR");
		
		//SET Foreground e Background
		jpn.setBackground(new Color(47, 79, 79));
		bGeral.setForeground(Color.BLACK);
		bGeral.setBackground(new Color(255, 215, 0));
		bFacil.setForeground(Color.BLACK);
		bFacil.setBackground(new Color(255, 215, 0));
		bMedio.setForeground(Color.BLACK);
		bMedio.setBackground(new Color(255, 215, 0));
		bDificil.setForeground(Color.BLACK);
		bDificil.setBackground(new Color(255, 215, 0));
		bSuperDificil.setForeground(Color.BLACK);
		bSuperDificil.setBackground(new Color(255, 215, 0));
		bVoltar.setForeground(Color.BLACK);
		bVoltar.setBackground(new Color(255, 215, 0));
		
		// set Tamanho
		jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
		bGeral.setBounds(255, 86, 124, 45);
		bFacil.setBounds(255, 142, 124, 45);
		bMedio.setBounds(255, 202, 124, 45);
		bDificil.setBounds(255, 258, 124, 45);
		bSuperDificil.setBounds(255, 314, 124, 45);
		bVoltar.setBounds(10, 48, 100, 37);
		
		//SET FONTE
		bGeral.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bFacil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bMedio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bDificil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bSuperDificil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		//ADICIONANDO BOTES E LABELS A TELA
		jpn.add(bGeral);
		jpn.add(bFacil);
		jpn.add(bMedio);
		jpn.add(bDificil);
		jpn.add(bSuperDificil);
		jpn.add(bVoltar);
		setContentPane(jpn);
		jpn.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		
		bGeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRanking_Geral Tela = new TelaRanking_Geral();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
	
			}
		});
		bGeral.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bGeral.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bGeral.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bGeral.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bGeral.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bGeral.setBackground(Color.YELLOW);
		}
    });
		
		bFacil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRanking_Facil Tela = new TelaRanking_Facil();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
			}
		});
		bFacil.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bFacil.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bFacil.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bFacil.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bFacil.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bFacil.setBackground(Color.YELLOW);
		}
    });
		
		bMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRanking_Medio Tela = new TelaRanking_Medio();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
			}
		});
		bMedio.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bMedio.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bMedio.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bMedio.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bMedio.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bMedio.setBackground(Color.YELLOW);
		}
    });
		bDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRanking_Dificil Tela = new TelaRanking_Dificil();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
			}
		});
		bDificil.addMouseListener(new MouseListener() {
		public void mouseExited(MouseEvent e) {
			bDificil.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bDificil.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bDificil.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bDificil.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bDificil.setBackground(Color.YELLOW);
		}
    });
		bSuperDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRanking_SuperDificil Tela = new TelaRanking_SuperDificil();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
			}
		});
		bSuperDificil.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bSuperDificil.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bSuperDificil.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bSuperDificil.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bSuperDificil.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bSuperDificil.setBackground(Color.YELLOW);
		}
    });
		bVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPrincipal Tela = new TelaPrincipal();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
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
	


