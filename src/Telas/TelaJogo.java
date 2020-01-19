package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Classes.Dificuldade;
import Classes.Jogador;
import Classes.Jogo;
import Classes.Ranking;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TelaJogo extends JFrame {

	private JPanel jpn;
	private JLabel label_pontos;
	private JLabel lblPontos;
	private JButton bFacil;
	private JButton bMedio;
	private JButton bDificil;
	private JButton bSuperDificil;
	private JButton bVoltar;
	private JButton bVermelho;
	private JButton bAmarelo;
	private JButton bVerde;
	private JButton bMaiorSequencia;
	private JButton bAzul;
	private JButton bJogar;
	private JButton bSalvar;
	private JButton bRepetir;

	Jogo J = new Jogo();
	Jogador jj = new Jogador();
	Dificuldade dif = new Dificuldade();
	Ranking r = new Ranking();

	public TelaJogo(Jogador jog) {

		super("Xenius - A melhor versão");

		// INSTANCIANDO TELA, BOTOES, TEXTFIELD E LABELS
		jpn = new JPanel();
		bVoltar = new JButton("VOLTAR");
		bFacil = new JButton("FÁCIL");
		bMedio = new JButton("MÉDIO");
		bDificil = new JButton("DIFÍCIL");
		bSuperDificil = new JButton("SUPER DIFÍCIL");
		bMaiorSequencia = new JButton("+ SEQUÊNCIA");
		bAzul = new JButton("");
		bVermelho = new JButton("");
		bVerde = new JButton("");
		bAmarelo = new JButton("");
		bSalvar = new JButton("SALVAR");
		bJogar = new JButton("JOGAR");
		lblPontos = new JLabel("Pontos:");
		label_pontos = new JLabel("");
		label_pontos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bRepetir = new JButton("REPETIR");

		// SET Foreground e Background
		jpn.setBackground(new Color(47, 79, 79));
		bAmarelo.setForeground(Color.YELLOW);
		bAmarelo.setBackground(Color.WHITE);
		bVerde.setBackground(Color.WHITE);
		bVerde.setForeground(Color.GREEN);
		bAzul.setBackground(Color.WHITE);
		bAzul.setForeground(Color.BLUE);
		bVermelho.setForeground(Color.RED);
		bVermelho.setBackground(Color.WHITE);
		label_pontos.setForeground(Color.WHITE);
		lblPontos.setForeground(Color.WHITE);
		bFacil.setBackground(Color.WHITE);
		bFacil.setForeground(Color.BLACK);
		bSalvar.setBackground(Color.WHITE);
		bSalvar.setForeground(Color.RED);
		bMedio.setBackground(Color.WHITE);
		bMedio.setForeground(Color.BLACK);
		bDificil.setBackground(Color.WHITE);
		bDificil.setForeground(Color.BLACK);
		bSuperDificil.setBackground(Color.WHITE);
		bSuperDificil.setForeground(Color.BLACK);
		bMaiorSequencia.setBackground(Color.WHITE);
		bMaiorSequencia.setForeground(Color.RED);
		bVoltar.setBackground(new Color(255, 215, 0));
		bVoltar.setForeground(Color.BLACK);
		bRepetir.setForeground(Color.RED);
		bRepetir.setBackground(Color.WHITE);

		// set Tamanho
		jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
		bVoltar.setBounds(10, 48, 100, 37);
		bFacil.setBounds(10, 118, 127, 37);
		bMedio.setBounds(10, 166, 127, 37);
		bDificil.setBounds(10, 214, 127, 37);
		bSuperDificil.setBounds(10, 262, 127, 37);
		bMaiorSequencia.setBounds(10, 340, 127, 37);
		bAzul.setBounds(271, 81, 127, 111);
		bVermelho.setBounds(271, 203, 127, 111);
		bVerde.setBounds(405, 81, 127, 111);
		bAmarelo.setBounds(405, 203, 127, 111);
		bSalvar.setBounds(271, 340, 127, 37);
		bJogar.setBounds(405, 340, 127, 37);
		lblPontos.setBounds(405, 35, 67, 22);
		label_pontos.setBounds(476, 35, 67, 22);
		bRepetir.setBounds(134, 48, 127, 37);

		// SET FONTE
		lblPontos.setFont(new Font("Tahoma", Font.PLAIN, 20));

		// ADICIONANDO BOTES E LABELS A TELA
		setContentPane(jpn);
		jpn.setLayout(null);
		jpn.add(bVoltar);
		jpn.add(bFacil);
		jpn.add(bMedio);
		jpn.add(bDificil);
		jpn.add(bSuperDificil);
		jpn.add(bMaiorSequencia);
		jpn.add(bAzul);
		jpn.add(bVermelho);
		jpn.add(bVerde);
		jpn.add(bAmarelo);
		jpn.add(bSalvar);
		jpn.add(bJogar);
		jpn.add(lblPontos);
		jpn.add(label_pontos);
		jpn.add(bRepetir);
		setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);

		bVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPrincipal p = new TelaPrincipal();
				p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				p.setSize(640, 480);
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

		bSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPrincipal p = new TelaPrincipal();
				p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				p.setSize(640, 480);
				p.setResizable(false);
				p.setVisible(true);
				r.setDificuldade(dif);
				r.setJogo(J);
				r.setUser(jog);
				r.SalvarRanking();
				J.setUser(jog);
				J.Salvar();

			}
		});

		bJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				J.setPontos(0);
				label_pontos.setText(null);
				J.sorteia();

				bJogar.setEnabled(false);
				bFacil.setEnabled(false);
				bMedio.setEnabled(false);
				bDificil.setEnabled(false);
				bSuperDificil.setEnabled(false);
				

				bAmarelo.setEnabled(true);
				bVerde.setEnabled(true);
				bAzul.setEnabled(true);
				bVermelho.setEnabled(true);
				bMaiorSequencia.setEnabled(true);
				bRepetir.setEnabled(true);
				bSalvar.setEnabled(true);

				label_pontos.setText(Integer.toString(J.getPontos()));
				try {
					piscar();
				} catch (InterruptedException g) {
					g.printStackTrace();
				}

			}

		});

		bJogar.setEnabled(false);
		bRepetir.setEnabled(false);
		bMaiorSequencia.setEnabled(false);
		bSalvar.setEnabled(false);

		// B AMARELO
		bAmarelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				J.getJogador_Jogada().add(0);
				J.verifica();
				Mensagem();
				ResetPiscar();

			}
		});
		bAmarelo.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				bAmarelo.setBackground(Color.WHITE);
			}

			public void mouseClicked(MouseEvent e) {
				bAmarelo.setBackground(Color.WHITE);
			}

			public void mousePressed(MouseEvent e) {
				bAmarelo.setBackground(Color.WHITE);
			}

			public void mouseReleased(MouseEvent e) {
				bAmarelo.setBackground(Color.WHITE);
			}

			public void mouseEntered(MouseEvent e) {
				bAmarelo.setBackground(Color.YELLOW);
			}
		});
		bAmarelo.setEnabled(false);

		// B VERDE
		bVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J.getJogador_Jogada().add(1);
				J.verifica();
				Mensagem();
				ResetPiscar();
			}
		});
		bVerde.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				bVerde.setBackground(Color.WHITE);
			}

			public void mouseClicked(MouseEvent e) {
				bVerde.setBackground(Color.WHITE);
			}

			public void mousePressed(MouseEvent e) {
				bVerde.setBackground(Color.WHITE);
			}

			public void mouseReleased(MouseEvent e) {
				bVerde.setBackground(Color.WHITE);
			}

			public void mouseEntered(MouseEvent e) {
				bVerde.setBackground(Color.GREEN);
			}
		});
		bVerde.setEnabled(false);

		// BOTÃO AZUL
		bAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J.getJogador_Jogada().add(2);
				J.verifica();
				Mensagem();
				ResetPiscar();
			}
		});
		bAzul.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				bAzul.setBackground(Color.WHITE);
			}

			public void mouseClicked(MouseEvent e) {
				bAzul.setBackground(Color.WHITE);
			}

			public void mousePressed(MouseEvent e) {
				bAzul.setBackground(Color.WHITE);
			}

			public void mouseReleased(MouseEvent e) {
				bAzul.setBackground(Color.WHITE);
			}

			public void mouseEntered(MouseEvent e) {
				bAzul.setBackground(Color.BLUE);
			}
		});
		bAzul.setEnabled(false);

		// B VERMELHO
		bVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J.getJogador_Jogada().add(3);
				J.verifica();
				Mensagem();
				ResetPiscar();
			}
		});
		bVermelho.addMouseListener(new MouseListener() {
			public void mouseExited(MouseEvent e) {
				bVermelho.setBackground(Color.WHITE);
			}

			public void mouseClicked(MouseEvent e) {
				bVermelho.setBackground(Color.WHITE);
			}

			public void mousePressed(MouseEvent e) {
				bVermelho.setBackground(Color.WHITE);
			}

			public void mouseReleased(MouseEvent e) {
				bVermelho.setBackground(Color.WHITE);
			}

			public void mouseEntered(MouseEvent e) {
				bVermelho.setBackground(Color.RED);
			}
		});
		bVermelho.setEnabled(false);

		// B +Sequencoa
		bMaiorSequencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					piscar();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		bRepetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					piscar();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		// B FÁCIL
		bFacil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dif.setTempo(1000);
				dif.setID(1);
				dif.setNome("Fácil");
				J.setDificuldade(dif);
				bJogar.setEnabled(true);
				JOptionPane.showMessageDialog(null, "Nível de jogo selecionado para: Fácil");
				bJogar.setBackground(Color.RED);
				bJogar.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(500);
				} catch (Exception z) {
				}
				bJogar.setBackground(Color.WHITE);
				bJogar.setForeground(Color.RED);
			}
		});

		// B MEDIO
		bMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dif.setTempo(800);
				dif.setNome("Médio");
				dif.setID(2);
				J.setDificuldade(dif);
				bJogar.setEnabled(true);
				JOptionPane.showMessageDialog(null, "Nível de jogo selecionado para: Médio");
				bJogar.setBackground(Color.RED);
				bJogar.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(500);
				} catch (Exception z) {
				}
				bJogar.setBackground(Color.WHITE);
				bJogar.setForeground(Color.RED);
			}
		});

		// B DIFICIL
		bDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dif.setTempo(600);
				dif.setNome("Díficil");
				dif.setID(3);
				J.setDificuldade(dif);
				bJogar.setEnabled(true);
				JOptionPane.showMessageDialog(null, "Nível de jogo selecionado para: Difícil");
				bJogar.setBackground(Color.RED);
				bJogar.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(500);
				} catch (Exception z) {
				}
				bJogar.setBackground(Color.WHITE);
				bJogar.setForeground(Color.RED);
			}
		});

		// B SUPER DIFICIL
		bSuperDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dif.setTempo(300);
				dif.setNome("Super Difícil");
				dif.setID(4);
				J.setDificuldade(dif);
				bJogar.setEnabled(true);
				JOptionPane.showMessageDialog(null, "Nível de jogo selecionado para: Super Dificil");
				bJogar.setBackground(Color.RED);
				bJogar.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(500);
				} catch (Exception z) {
				}
				bJogar.setBackground(Color.WHITE);
				bJogar.setForeground(Color.RED);
			}
		});

	}

	// BOTOES PISCAM
	public void piscar() throws InterruptedException {
		for (int i = 0; i < J.getJogada_Jogo().size(); i++) {
			if (J.getJogada_Jogo().get(i) == 0) {
				bAmarelo.setBackground(Color.YELLOW);
				bAmarelo.setForeground(Color.WHITE);

				try {
					update(getGraphics());
					Thread.sleep(J.getDificuldade().getTempo());
				} catch (Exception e) {
				}
				bAmarelo.setBackground(Color.WHITE);
				bAmarelo.setForeground(Color.YELLOW);
				update(getGraphics());
				Thread.sleep(J.getDificuldade().getTempo());

			} else if (J.getJogada_Jogo().get(i) == 1) {
				bVerde.setBackground(Color.GREEN);
				bVerde.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(J.getDificuldade().getTempo());
				} catch (Exception e) {
				}
				bVerde.setBackground(Color.WHITE);
				bVerde.setForeground(Color.GREEN);
				update(getGraphics());
				Thread.sleep(J.getDificuldade().getTempo());

			} else if (J.getJogada_Jogo().get(i) == 2) {
				bAzul.setBackground(Color.BLUE);
				bAzul.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(J.getDificuldade().getTempo());
				} catch (Exception e) {
				}
				bAzul.setBackground(Color.WHITE);
				bAzul.setForeground(Color.BLUE);
				update(getGraphics());
				Thread.sleep(J.getDificuldade().getTempo());

			} else if (J.getJogada_Jogo().get(i) == 3) {
				bVermelho.setBackground(Color.RED);
				bVermelho.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(J.getDificuldade().getTempo());
				} catch (Exception e) {
				}
				bVermelho.setBackground(Color.WHITE);
				bVermelho.setForeground(Color.RED);
				update(getGraphics());
				Thread.sleep(J.getDificuldade().getTempo());

			}
		}
	}

	// RESET PISCAR E ATUALIZA OS PONTOS
	public void ResetPiscar() {
		if (J.getContinua() == 1) {
			JOptionPane.showMessageDialog(null, "Acertou, próxima jogada");
			J.setContinua(0);
			label_pontos.setText(Integer.toString(J.getPontos()));
			try {
				piscar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void Mensagem() {
		Boolean res = J.verifica();
		if (res == false) {
			JOptionPane.showMessageDialog(null, "Jogada errada, salve sua pontuação");
			bRepetir.setEnabled(false);
		}
	}
}
