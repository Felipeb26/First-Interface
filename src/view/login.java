package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import constroller.LoginController;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField inputNome;
	private JPasswordField inputSenha;

	LoginController controll = new LoginController(this);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        	System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogin = new JLabel("LOGIN");
		labelLogin.setFont(new Font("Arial Black", Font.PLAIN, 18));
		labelLogin.setForeground(Color.WHITE);
		labelLogin.setBounds(238, 122, 78, 20);
		contentPane.add(labelLogin);
		
		JLabel labelUsuario = new JLabel("USUARIO");
		labelUsuario.setFont(new Font("Arial Black", Font.PLAIN, 12));
		labelUsuario.setForeground(Color.WHITE);
		labelUsuario.setBounds(238, 176, 68, 20);
		contentPane.add(labelUsuario);
		
		inputNome = new JTextField();
		inputNome.setFont(new Font("Arial Black", Font.PLAIN, 12));
		inputNome.setBounds(223, 207, 116, 24);
		contentPane.add(inputNome);
		inputNome.setColumns(10);
		
		JLabel labelSenha = new JLabel("SENHA");
		labelSenha.setFont(new Font("Arial Black", Font.PLAIN, 14));
		labelSenha.setForeground(Color.WHITE);
		labelSenha.setBounds(238, 254, 55, 32);
		contentPane.add(labelSenha);
		
		inputSenha = new JPasswordField();
		inputSenha.setFont(new Font("Arial Black", Font.PLAIN, 12));
		inputSenha.setBounds(223, 299, 116, 20);
		contentPane.add(inputSenha);
		inputSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginControll(this);
			}
		});
		btnEntrar.setBackground(Color.BLACK);
		btnEntrar.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setBounds(227, 341, 103, 32);
		contentPane.add(btnEntrar);
		
		JLabel fundoLogin = new JLabel("");
		fundoLogin.setIcon(new ImageIcon(login.class.getResource("/images/fundoLogin.jpg")));
		fundoLogin.setBounds(189, 101, 182, 274);
		contentPane.add(fundoLogin);
		
		JButton btnCadastrar = new JButton("CADASTRO");
		btnCadastrar.setBackground(Color.BLACK);
		btnCadastrar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBounds(10, 499, 116, 41);
		contentPane.add(btnCadastrar);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(login.class.getResource("/images/fundo.png")));
		fundo.setBounds(-11, 0, 600, 590);
		contentPane.add(fundo);
	}
	
	protected void loginControll(ActionListener e) {
		if(rootPaneCheckingEnabled == true) {
			controll.iMadeIt();
		}else {
			System.out.println(e);
		}
		
	}

	public void showMessage(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public JTextField getInputNome() {
		return inputNome;
	}

	public void setInputNome(JTextField inputNome) {
		this.inputNome = inputNome;
	}

	public JPasswordField getInputSenha() {
		return inputSenha;
	}

	public void setInputSenha(JPasswordField inputSenha) {
		this.inputSenha = inputSenha;
	}
}






