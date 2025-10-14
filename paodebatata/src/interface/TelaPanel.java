
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPanel {
    public class TelaPanel extends JPanel
    implements  ActionListener{
        private JPanel telas;
        private CardLayout controletela;
        private JFrame janelas;

        public TelaPanel(JPanel telas, JFrame janelas){
            this.telas = telas;
            this.controletela = (CardLayout) telas.getLayout();
            this.janelas = janelas;
            this.setBackground(Color.decode("#202028"));

            Imagem botaofechar = new Imagem("");
        }
    }
}
