import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmEstadistica extends JFrame {

    // metodo constructor
    public FrmEstadistica() {
        setSize(500, 300);
        setTitle("Estadística");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDato = new JLabel("Dato:");
        lblDato.setBounds(10, 10, 100, 25);
        getContentPane().add(lblDato);

        JTextField txtDato = new JTextField();
        txtDato.setBounds(110, 10, 100, 25);
        getContentPane().add(txtDato);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(110, 40, 100, 25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar = new JButton("Quitar");
        btnQuitar.setBounds(110, 70, 100, 25);
        getContentPane().add(btnQuitar);

        JLabel lblMuestra = new JLabel("Muestra:");
        lblMuestra.setBounds(220, 10, 100, 25);
        lblMuestra.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblMuestra);

        JList lstMuestra = new JList();
        JScrollPane spMuestra = new JScrollPane(lstMuestra);
        spMuestra.setBounds(220, 40, 100, 150);
        getContentPane().add(spMuestra);

        JButton btnEstadistica = new JButton("Estadística");
        btnEstadistica.setBounds(10, 200, 100, 25);
        getContentPane().add(btnEstadistica);

        JComboBox cmbEstadistica = new JComboBox();
        String[] opciones = new String[] { "Sunatoria", "Promedio", "Desviación Estandar", "Máximo", "Mínimo", "Moda" };
        DefaultComboBoxModel mdlEstadistica = new DefaultComboBoxModel(opciones);
        cmbEstadistica.setModel(mdlEstadistica);
        cmbEstadistica.setBounds(110, 200, 100, 25);
        getContentPane().add(cmbEstadistica);

        JTextField txtEstadistica = new JTextField();
        txtEstadistica.setBounds(220, 200, 100, 25);
        txtEstadistica.setEnabled(false);
        getContentPane().add(txtEstadistica);

        // Agregar eventos
        btnAgregar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hizo clic en AGREGAR");
            }
            
        });

        btnQuitar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hizo clic en QUITAR");
            }
            
        });

        btnEstadistica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hizo clic en ESTADISTICA");
            }
            
        });
    }

}
