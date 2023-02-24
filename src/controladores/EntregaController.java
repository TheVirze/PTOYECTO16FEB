
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelos.Entrega;
import modelos.entregaModel;
import vistas.frmEntrega;
import vistas.frmPrincipal;

public class EntregaController implements ActionListener
{
    frmPrincipal vistaPrincipal;
    frmEntrega vistaEntrega;
    entregaModel modeloEntrega;
    public DefaultTableModel TablaUsuarios = new DefaultTableModel();

    public EntregaController(frmPrincipal vistaPrincipal, frmEntrega vistaEntrega, entregaModel modeloEntrega) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaEntrega = vistaEntrega;
        this.modeloEntrega = modeloEntrega;
        
        
        this.vistaPrincipal.btnEntregar.addActionListener(this);
        
        this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.vistaPrincipal.setVisible(true);
        this.TablaUsuarios.addColumn("CODIGO");
        this.TablaUsuarios.addColumn("PERSONA");
        this.TablaUsuarios.addColumn("FECHA");
        this.TablaUsuarios.addColumn("DESCRIPCION");    
        this.vistaEntrega.jtEntrega.setModel(TablaUsuarios);
    }
 
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()== this.vistaPrincipal.btnEntregar){
              
              this.vistaEntrega.btnEntregarEquipo.addActionListener(this);
              
              this.vistaEntrega.setLocationRelativeTo(null);
              this.vistaEntrega.setVisible(true);
              
              
               if(e.getSource()== this.vistaEntrega.btnEntregarEquipo){
            this.modeloEntrega.AgregarUsuarios(this.vistaEntrega.txtCodEquipo.getText(),
                    this.vistaEntrega.txtNombre.getText(),
                    this.vistaEntrega.txtFecha.getText(),
                    this.vistaEntrega.txtDescripcion.getText());
            
            
            this.TablaUsuarios.addRow(new Object[]{this.modeloEntrega.ListaUsuarios.get(0).getCodEquipo(),
            this.modeloEntrega.ListaUsuarios.get(0).getDesSolucion(),
            this.modeloEntrega.ListaUsuarios.get(0).getFecha(),
            this.modeloEntrega.ListaUsuarios.get(0).getDesSolucion()});
              
               }
          }
    
    }
}
