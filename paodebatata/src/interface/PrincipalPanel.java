
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalPanel extends TelaPanel {
    
    public PrincipalPanel(JPanel telas, JFrame janela){
        super(telas, janela);
        JLabel mensagem = new JLabel("Conteúdo princípal panel");
        JButton botao = new JButton("Voltar");
        botao.addActionListener(this);

        this.add(botao);
        this.add(mesagem);
    }
    public void executarbotao(ActionEvent e){
        trocaTela("Tela login");
    }
}
