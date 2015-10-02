import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pcqs on 02/10/2015.
 */
public class JanelaPrincipal extends JFrame{

    private JButton celsiusF;
    private JTextField entrada, saida;
    private JRadioButton celsius, fahrenheint;
    private ButtonGroup grupo;

    private class BotaoCelsius implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(entrada.getText().matches("[\\d].?[0-9]?.*" )) {
                if (celsius.isSelected()) {
                    saida.setText(Double.toString(Conversor.paraFahrenheint(Double.parseDouble(entrada.getText()))));
                } else if (fahrenheint.isSelected()) {
                    saida.setText(Double.toString(Conversor.paraCelsius(Double.parseDouble(entrada.getText()))));
                }
            }
            else {
                mostraAviso();
            }
        }
    }

    public JanelaPrincipal() {
        Inicializa();
    }

    public void Inicializa() {
        this.getContentPane().setLayout(new GridLayout(3,2));
        celsiusF = new JButton();
        entrada = new JTextField();
        saida = new JTextField();
        entrada.setBounds(1, 1, 20, 5);
        saida.setBounds(21, 1, 20, 5);
        celsius = new JRadioButton("P/ Fahrenheint");
        fahrenheint = new JRadioButton("P/ Celsius");
        grupo = new ButtonGroup();
        grupo.add(celsius);
        grupo.add(fahrenheint);
        this.setSize(new Dimension(400, 300));
        this.setTitle("Conversor de Temperatura");
        celsiusF.setText("Converter");
        celsiusF.addActionListener(new BotaoCelsius());
        celsius.setText("P/ Fahrenheint");
        fahrenheint.setText("P/ Celsius");
        this.getContentPane().add(entrada);
        this.getContentPane().add(saida);
        this.getContentPane().add(celsius);
        this.getContentPane().add(fahrenheint);
        this.getContentPane().add(celsiusF);
    }

    public void mostraAviso() {
        JOptionPane.showMessageDialog(this,"A entrada deve ser um número.");
    }
}
