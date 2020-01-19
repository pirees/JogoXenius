package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.Jogador;
import Classes.Login;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel jpn;
	private JPasswordField txtSenha;
	private JTextField txtLogin;
	private JButton bEntrar;
	private JButton bVoltar;
	private JLabel lblLogin;
	private JLabel lblSenha;

	public TelaLogin() {
		
		super("Xenius - A melhor versão");
		
		//INSTANCIOANDO CLASSES
		Login l = new Login();
		Jogador c = new Jogador();
		
		//INSTANCIANDO TELA, BOTOES, TEXTFIELD E LABELS
		jpn = new JPanel();
		bEntrar = new JButton("COMEÇAR");
		bVoltar = new JButton("VOLTAR");
		lblLogin = new JLabel("AVATAR");
		lblSenha = new JLabel("SENHA");
		txtSenha = new JPasswordField(20);
		txtLogin = new JTextField(20);
		
		//SET Foreground e Background
		jpn.setBackground(new Color(47, 79, 79));
		bEntrar.setBackground(new Color(255, 215, 0));
		bEntrar.setForeground(Color.BLACK);
		bVoltar.setBackground(new Color(255, 215, 0));
		bVoltar.setForeground(Color.BLACK);
		lblLogin.setForeground(new Color(255, 255, 255));
		lblSenha.setForeground(new Color(255, 255, 255));
		
		// set Tamanho
		jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
		bEntrar.setBounds(137, 240, 165, 57);
		bVoltar.setBounds(334, 240, 165, 57);
		lblLogin.setBounds(184, 101, 133, 41);
		lblSenha.setBounds(184, 153, 133, 41);
		txtSenha.setBounds(334, 153, 151, 41);
		txtLogin.setBounds(334, 101, 151, 41);
		txtLogin.setColumns(10);
		
		//SET FONTE
		bEntrar.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		bVoltar.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		lblLogin.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblSenha.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		
		//ADICIONANDO BOTES E LABELS A TELA
		setContentPane(jpn);
		jpn.setLayout(null);
		jpn.add(bEntrar);
		jpn.add(bVoltar);
		jpn.add(lblLogin);
		jpn.add(lblSenha);
		jpn.add(txtSenha);
		jpn.add(txtLogin);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		
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
		
		bEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				c.setUsuario(txtLogin.getText());
				c.setSenha(txtSenha.getText());	
				
				
		
				try {		
					Boolean res = l.ValidarUsuario(c);
					if(res==true) {
						JOptionPane.showMessageDialog(null, "Seja Bem Vindo! Selecione um nível para iniciar o jogo!");
						dispose();
						Jogador jog = new Jogador();
						jog.setUsuario(txtLogin.getText());
						TelaJogo Tela = new TelaJogo(jog);
						Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						Tela.setSize(640,480);
						Tela.setResizable(true);
						Tela.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos :(");
				}
				} catch (IOException e1) {
					
					e1.printStackTrace();
					
					System.out.println(e1);
				}
			
			}
			});	
		
		bEntrar.addMouseListener(new MouseListener() {
			   public void mouseExited(MouseEvent e) {
			   bEntrar.setBackground(new Color(255, 215, 0));
			     }
			   public void mouseClicked(MouseEvent e) {
			   bEntrar.setBackground(Color.YELLOW);
			     }
		 	   public void mousePressed(MouseEvent e) {
			   bEntrar.setBackground(Color.YELLOW);
			    }
			   public void mouseReleased(MouseEvent e) {
			   bEntrar.setBackground(Color.YELLOW);
			   }
			   public void mouseEntered(MouseEvent e) {
			   bEntrar.setBackground(Color.YELLOW);
			   }
	    });
	}
}
