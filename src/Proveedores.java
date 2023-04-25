import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proveedores {
    private JPanel panelProv;
    private JPanel panelProv1;
    private JButton stockButton;
    private JButton facturarButton;
    private JButton clientesButton1;
    private JButton agregarButton;
    private JButton modificarButton;
    private JTextField IDtextField1;
    private JTextField NombretextField2;
    private JTextField PreciotextField3;
    private JTextField CantidadtextField4;
    private JTextField ProveedortextField5;
    private JTextField DetallestextField6;
    private JTable table1;
    private JButton empleadosButton;
    private JButton eliminarButton;

    public Proveedores() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Precio");
        tbl.addColumn("Cantidad");
        tbl.addColumn("Proveedor");
        tbl.addColumn("Detalles");
        facturarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                facturacion fac = new facturacion();
                fac.setVisible(true);
            }
        });
        stockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StockBoton stb = new StockBoton();
                stb.setVisible(true);
            }
        });
        clientesButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clientes cl = new Clientes();
                cl.setVisible(true);
            }
        });
        empleadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Empleados emp = new Empleados();
                emp.setVisible(true);
            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] fila = new Object[6];
                fila[0] = IDtextField1.getText();
                fila[1] = NombretextField2.getText();
                fila[2] = PreciotextField3. getText();
                fila[3] = CantidadtextField4.getText();
                fila[4] = ProveedortextField5.getText();
                fila[5] = DetallestextField6.getText();
                tbl.addRow(fila);
                table1.setModel(tbl);
            }
        });
    }

    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Proveedores");
        frame.setContentPane(new Proveedores().panelProv);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
