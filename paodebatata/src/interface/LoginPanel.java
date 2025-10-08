
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoginPanel extends TelaPanel{
    
    private JButton BotaoLogin;
    public LoginPanel(JPanel telas, JFrame janela){
           super(telas,janela);
           JLabel mensagem = new JLabel("conteudo de login Panel");
           JButton botao = new JButton("fazer login");
           botao.addActionListener(this);

           this.add(mensagem);
           this.add(botao);
    }
    public void executarBotao(ActionEvent e){
        trocaTela("Tela principal");
    }
}
