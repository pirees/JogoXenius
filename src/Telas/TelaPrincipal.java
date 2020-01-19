package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Ranking;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame {

	
	//TELA
	private JPanel jpn;
	
	//BOTOES
	private JButton bLogin;
	private JButton bCadastro;
	private JButton bSair;
	private JButton bRanking;
	
	//label
	private JLabel lblXenius;
	private JLabel lblGame;

	public TelaPrincipal() {
		
		super("Xenius - A melhor versão");
			
		//INSTANCIOANDO Tela, botoes e labels
		jpn = new JPanel();
		bLogin = new JButton("JOGAR");
		bCadastro = new JButton("NOVO AVATAR");
		bSair = new JButton("SAIR");
		bRanking = new JButton("RANKING");
		lblXenius = new JLabel("Xenius");
		lblGame = new JLabel("O Jogo");
		
		//SET Foreground e Background
		jpn.setForeground(new Color(47, 79, 79));
		jpn.setBackground(new Color(47, 79, 79));
		bLogin.setForeground(Color.BLACK);
		bLogin.setBackground(new Color(255, 215, 0));
		bCadastro.setBackground(new Color(255, 215, 0));
		bCadastro.setForeground(Color.BLACK);
		bSair.setBackground(new Color(255, 215, 0));
		bSair.setForeground(Color.BLACK);
		bRanking.setBackground(new Color(255, 215, 0));
		bRanking.setForeground(Color.BLACK);
		lblXenius.setForeground(Color.WHITE);
		lblGame.setForeground(Color.WHITE);
		
		// set Tamanho
		jpn.setBorder(new EmptyBorder(10, 10, 10, 10));
		bLogin.setBounds(10, 254, 142, 55);;
		bCadastro.setBounds(162, 254, 142, 55);
		bSair.setBounds(472, 254, 142, 55);
		bRanking.setBounds(320, 254, 142, 55);
		lblXenius.setBounds(148, 73, 345, 135);
		lblGame.setBounds(322, 149, 350, 84);
		
		//SET FONTE
		bLogin.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		bCadastro.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		bSair.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		bRanking.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		lblXenius.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 99));
		lblGame.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 32));
		
		//ADICIONANDO BOTES E LABELS A TELA
		setContentPane(jpn);
		jpn.setLayout(null);
		jpn.add(bLogin);
		jpn.add(bCadastro);
		jpn.add(bSair);
		jpn.add(bRanking);
		jpn.add(lblXenius);
		jpn.add(lblGame);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
				
		bLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaLogin Tela = new TelaLogin();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
			}
		});
		bLogin.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bLogin.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bLogin.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bLogin.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bLogin.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bLogin.setBackground(Color.YELLOW);
		}
    });
		
		bCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastro Tela = new TelaCadastro();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
				
			}
		});
		bCadastro.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bCadastro.setBackground(new Color(255, 215, 0));
		}
			public void mouseClicked(MouseEvent e) {
			bCadastro.setBackground(Color.YELLOW);
		}
			public void mousePressed(MouseEvent e) {
			bCadastro.setBackground(Color.YELLOW);
		}
			public void mouseReleased(MouseEvent e) {
			bCadastro.setBackground(Color.YELLOW);
		}
			public void mouseEntered(MouseEvent e) {
			bCadastro.setBackground(Color.YELLOW);
		}
		    });
		
		bSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setSize(640,480);
				setResizable(false);
				setVisible(false);
			}
		});
		bSair.addMouseListener(new MouseListener() {
		   public void mouseExited(MouseEvent e) {
		   bSair.setBackground(new Color(255, 215, 0));
		     }
		   public void mouseClicked(MouseEvent e) {
		   bSair.setBackground(Color.YELLOW);
		     }
	 	   public void mousePressed(MouseEvent e) {
		   bSair.setBackground(Color.YELLOW);
		    }
		   public void mouseReleased(MouseEvent e) {
		   bSair.setBackground(Color.YELLOW);
		   }
		   public void mouseEntered(MouseEvent e) {
		   bSair.setBackground(Color.YELLOW);
		   }
    });
		bRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaRanking Tela = new TelaRanking();
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Tela.setSize(640,480);
				Tela.setResizable(false);
				Tela.setVisible(true);
			}
		});
		bRanking.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bRanking.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bRanking.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bRanking.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bRanking.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bRanking.setBackground(Color.YELLOW);
		}
    });
		
	}
}
