import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {
    private JButton OKButton;
    private JTextField textField1;
    private JPanel panelLogin;
    private JPasswordField passwordField1;
    public Login() {
        //ACCION DEL BOTON PARA INGRESAR LOS DATOS
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a, b;
                a = textField1.getText();
                b = passwordField1.getText();
                if (a.equals("") && b.equals("")) {
                    Stock stk = new Stock();
                    stk.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
                }
            }
        });
        // LINEAS PARA QUE LA TECLA ENTER HAGA FOCUS EN EL OKBUTTON Y LO CLICKEE
        passwordField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER){
                    OKButton.requestFocus();
                    OKButton.doClick();
                }
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                    passwordField1.requestFocus();
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panelLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

