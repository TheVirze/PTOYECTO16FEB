package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelos.reparacionModel;
import vistas.frmReparacion;
import vistas.frmPrincipal;

public class reparacionController implements ActionListener {
    
    frmPrincipal vistaPrincipal;
    frmReparacion vistaReparacion;
    reparacionModel modeloReparacion;
    public DefaultTableModel TablaUsuarios = new DefaultTableModel();
    
    public reparacionController(frmPrincipal vistaPrincipal, frmReparacion vistaReparacion,
            reparacionModel modeloReparacion) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaReparacion = vistaReparacion;
        this.modeloReparacion = modeloReparacion;
        
        
        this.vistaPrincipal.btnEntregar.addActionListener(this);
        
        this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.vistaPrincipal.setVisible(true);
        this.TablaUsuarios.addColumn("CODIGO DE EQUIPO");
        this.TablaUsuarios.addColumn("DESCRIPCION DE LA REPARACIÓN A REALIZAR");
        this.TablaUsuarios.addColumn("TÉCNICO ASIGNADO");
        this.TablaUsuarios.addColumn("FECHA DE INGRESO");    
        this.vistaReparacion.jtReparacion.setModel(TablaUsuarios);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.vistaPrincipal.btnReparacion1){
            this.vistaReparacion.btnReparacion.addActionListener(this);
            this.vistaReparacion.setLocationRelativeTo(null);
            this.vistaReparacion.setVisible(true);
        }
        
        if(e.getSource() == this.vistaReparacion.btnReparacion){
            this.vistaReparacion.txtCodigo.getText();
            this.vistaReparacion.txtReparacionA.getText();
            this.vistaReparacion.txtTecnico.getText();
            this.vistaReparacion.txtFecha.getText();
            
            this.TablaUsuarios.addRow(new Object[]{this.modeloReparacion.
        }
        
    }
 
        
}
