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
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TelaCadastro extends JFrame {

	private JPanel jpn;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtAvatar;
	private JPasswordField txtSenha;
	private JButton bVoltar;
	private JButton bSalvar;
	private JLabel lblNome;
	private JLabel lblSobrenome;
	private JLabel lblAvatar;
	private JLabel lblSenha;
	
	Jogador user = new Jogador();

	public TelaCadastro() {
		
		super("Xenius - A melhor versão");
		
		//INSTANCIANDO TELA, BOTOES, TEXTFIELD E LABELS
		jpn = new JPanel();
		lblNome = new JLabel("Nome");
		lblSobrenome = new JLabel("Sobrenome");
		lblAvatar = new JLabel("Avatar");
		lblSenha = new JLabel("Senha");
		bVoltar = new JButton("VOLTAR");
		bSalvar = new JButton("SALVAR");
		txtNome = new JTextField();
		txtSobrenome = new JTextField();
		txtAvatar = new JTextField();
		txtSenha = new JPasswordField();
		
		//SET Foreground e Background
		jpn.setBackground(new Color(47, 79, 79));
		lblNome.setForeground(new Color(255, 255, 255));
		lblSobrenome.setForeground(new Color(255, 255, 255));
		lblAvatar.setForeground(new Color(255, 255, 255));
		lblSenha.setForeground(new Color(255, 255, 255));
		bSalvar.setForeground(Color.BLACK);
		bSalvar.setBackground(new Color(255, 215, 0));
		bVoltar.setForeground(Color.BLACK);
		bVoltar.setBackground(new Color(255, 215, 0));
		
		// set Tamanho
		jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNome.setBounds(167, 86, 100, 22);
		lblSobrenome.setBounds(167, 135, 155, 27);
		lblAvatar.setBounds(167, 173, 90, 45);
		lblSenha.setBounds(162, 219, 83, 45);
		bVoltar.setBounds(199, 293, 123, 55);
		bSalvar.setBounds(371, 293, 123, 55);
		txtNome.setBounds(364, 87, 141, 33);
		txtNome.setColumns(10);
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(364, 135, 141, 33);
		txtAvatar.setColumns(10);
		txtAvatar.setBounds(364, 185, 141, 33);
		txtSenha.setBounds(364, 231, 141, 33);
		
		//SET FONTE
		lblNome.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblSobrenome.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblAvatar.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblSenha.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		
		//ADICIONANDO BOTES E LABELS A TELA
		setContentPane(jpn);
		jpn.setLayout(null);
		jpn.add(lblNome);
		jpn.add(lblSobrenome);	
		jpn.add(lblAvatar);
		jpn.add(lblSenha);
		jpn.add(bVoltar);
		jpn.add(bSalvar);
		jpn.add(txtNome);
		jpn.add(txtSobrenome);
		jpn.add(txtAvatar);
		jpn.add(txtSenha);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);

		bSalvar.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Jogador user = new Jogador();	
				user.setNome(txtNome.getText());
				user.setSenha(txtSenha.getText());
				user.setUsuario(txtAvatar.getText());
				user.setSobrenome(txtSobrenome.getText());
				txtNome.setText("");
			    txtSenha.setText("");
			    txtAvatar.setText("");
				txtSobrenome.setText("");
				Boolean res = user.verificaAvatar();
				if(res==true) {
					JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso :)");
					dispose();
				    TelaPrincipal Tela = new TelaPrincipal();
				    Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				    Tela.setSize(640, 480);
				    Tela.setResizable(false);
				    Tela.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Avatar já existe, faça outro :)");				
}
			
			}
			});	
			
		
		bSalvar.addMouseListener(new MouseListener() {
		    public void mouseExited(MouseEvent e) {
		    bSalvar.setBackground(new Color(255, 215, 0));
		}
		public void mouseClicked(MouseEvent e) {
			bSalvar.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			bSalvar.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			bSalvar.setBackground(Color.YELLOW);
		}
		public void mouseEntered(MouseEvent e) {
			bSalvar.setBackground(Color.YELLOW);
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
