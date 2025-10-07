
import java.awt.CardLayout;
import java.security.Principal;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class janela extends JFrame{
    public janela(){
        this.setBounds(0,0,1920,1080);
        CardLayout ControlDeTela = new CardLayout();
        JPanel telas = new JPanel(ControlDeTela);
        LoginPanel LoginPanel = new LoginPanel(telas, this);
        Principalpanel Principalpanel = new Principalpanel(telas, this);

        this.add(telas);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
        
    }
}
