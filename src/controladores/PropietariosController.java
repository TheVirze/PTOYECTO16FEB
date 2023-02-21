
package controladores;

import modelos.propietariosModel;
import vistas.frmPrincipal;
import vistas.frmPropietarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class PropietariosController implements ActionListener{
     frmPrincipal vistaPrincipal;
     frmPropietarios vistaPropietarios;
     propietariosModel ModeloPropietarios;
     public DefaultTableModel TablaUsuarios = new DefaultTableModel();
     
     public PropietariosController(frmPrincipal vistaPrincipal, frmPropietarios vistaPropietarios, propietariosModel ModeloPropietarios){
         this.vistaPrincipal = vistaPrincipal;
         this.vistaPropietarios = vistaPropietarios;
         this.ModeloPropietarios = ModeloPropietarios;
         
         
         this.vistaPrincipal.btnIngreso.addActionListener(this);
         
         this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
         this.vistaPrincipal.setVisible(true);
         
         
         this.TablaUsuarios.addColumn("Apellidos");
         this.TablaUsuarios.addColumn("Nombre");
         this.TablaUsuarios.addColumn("Telefono");
         
         this.vistaPropietarios.jtPropietarios.setModel(TablaUsuarios);
     }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.vistaPrincipal.btnIngreso)
        {
            
            this.vistaPropietarios.btnIngresodepropietarios.addActionListener(this);
            
            this.vistaPropietarios.setLocationRelativeTo(null);
            this.vistaPropietarios.setVisible(true);
        }
            
            if(e.getSource()==this.vistaPropietarios.btnIngresodepropietarios)
            {
                this.ModeloPropietarios.AgregarPropietario(this.vistaPropietarios.txtApellido.getText(),
                    this.vistaPropietarios.txtNombre.getText(), 
                    this.vistaPropietarios.txtTelefono.getText());
                    
                this.TablaUsuarios.addRow(new Object []{this.ModeloPropietarios.ListaPropietarios.get(0).getApellido(),
                    this.ModeloPropietarios.ListaPropietarios.get(0).getNombre(),
                    this.ModeloPropietarios.ListaPropietarios.get(0).getTelefono()});
            }
        }
    }
     