import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class facturacion {
    private JPanel panelFacturas;
    private JPanel panelFacturacion2;
    private JButton stockButton;
    private JButton proveedoresButton;
    private JButton clientesButton1;
    private JButton agregarButton;
    private JButton modificarButton;
    private JTextField CantidadtextField2;
    private JTextField PreciotextField3;
    private JTextField ProductotextField4;
    private JTextField DescuentotextField5;
    private JTable table1;
    private JButton empleadosButton;
    private JButton eliminarButton;
    private JButton facturarButton;
    private JLabel TotalLabel;

    public facturacion() {


        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tbl = (DefaultTableModel)table1.getModel();
                tbl.removeRow(table1.getSelectedRow());
            }
        });
        facturarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculoFak FK = new CalculoFak();

                String a,b;
                a=ProductotextField4.getText();
                b=CantidadtextField2.getText();
                Double.parseDouble(a);
                Double.parseDouble(b);
                FK.Ina(a);
                FK.Inb(b);
                FK.Calcular();
                String gg;
                gg = String.valueOf(FK.Calcular());
                TotalLabel.setText(gg);



            }
        });
    }

    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Facturacion  ");
        frame.setContentPane(new facturacion().panelFacturas);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
