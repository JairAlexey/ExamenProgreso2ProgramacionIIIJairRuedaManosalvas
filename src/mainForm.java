import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Modifier;

public class mainForm extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textIngresoNombre;
    private JButton ingresarPlatoButton;
    private JTextArea textAIngresoPlatos;
    private JButton QuemarDatosButton;
    private JTextField textIngresoPrecio;
    private JTextField textIngresoCalorias;
    private JTextField textIngresoPreparacion;
    private JButton buscarModifButton;
    private JButton modificarModifButton;
    private JTextField textoModifNombre;
    private JTextField textoModifPrecio;
    private JTextField textoModifCalorias;
    private JTextField textoModifPreparacion;
    private JTextArea textAModif;
    private JButton ButtonBuscarEliminar;
    private JTextField textNombreEliminar;
    private JTextArea textAEliminar;
    private JButton eliminarButton;
    private JComboBox comboBoxOrder;
    private JButton mostrarButton;
    private JTextArea textAMostrar;
    private JButton buscarButton;
    private JTextField textBuscarPlatoOrden;

    private Menu m = new Menu();

    public mainForm() {

        ingresarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarPlato();
            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPlatoModificar();
            }
        });
        modificarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarPlato();
            }
        });
        ButtonBuscarEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPlatoEliminar();
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPlato();
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //Get mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void ingresarPlato() {
        if (m.ingresarPlato(textIngresoNombre.getText(), Double.parseDouble(textIngresoPrecio.getText()), Double.parseDouble(textIngresoCalorias.getText()), Integer.parseInt(textIngresoPreparacion.getText()))) {
            textAIngresoPlatos.setText("Se agrego el plato correctamente el libro\n");
        } else {
            textAIngresoPlatos.setText("Error el plato ya existe\n");
        }
    }

    public void buscarPlatoModificar(){
        Plato p = m.buscarPlatoPorNombre(textoModifNombre.getText());
        if (p != null) {
            textAModif.setText(p.toString());
            textoModifPrecio.setEditable(true);
            textoModifCalorias.setEditable(true);
            textoModifPreparacion.setEditable(true);
        } else {
            textAModif.setText("No se ha encontrado ningun plato con ese nombre.");
        }
    }
    public void modificarPlato(){
        Plato p = m.modificarPlato(textoModifNombre.getText(), Double.parseDouble(textoModifPrecio.getText()), Double.parseDouble(textoModifCalorias.getText()), Integer.parseInt(textoModifPreparacion.getText()));
        textAModif.setText(p.toString());
    }

    public void buscarPlatoEliminar(){
        Plato p = m.buscarPlatoPorNombre(textoModifNombre.getText());
        if (p != null) {
            textAEliminar.setText(p.toString());
        } else {
            textAModif.setText("No se ha encontrado ningun plato con ese nombre.");
        }
    }
    public void eliminarPlato(){
        Plato p = m.eliminarPlatoPorNombre(textoModifNombre.getText());
        textAEliminar.setText(p.toString());
    }
}
