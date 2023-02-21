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
    public DefaultTableModel TablaReparacion = new DefaultTableModel();
    
    public reparacionController(frmPrincipal vistaPrincipal, frmReparacion vistaReparacion,
            reparacionModel modeloReparacion) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaReparacion = vistaReparacion;
        this.modeloReparacion = modeloReparacion;
        
        
        this.vistaPrincipal.btnEntregar.addActionListener(this);
        
        this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.vistaPrincipal.setVisible(true);
        this.TablaReparacion.addColumn("CODIGO DE EQUIPO");
        this.TablaReparacion.addColumn("DESCRIPCION DE LA REPARACIÓN A REALIZAR");
        this.TablaReparacion.addColumn("TÉCNICO ASIGNADO");
        this.TablaReparacion.addColumn("FECHA DE INGRESO");    
        this.vistaReparacion.jtReparacion.setModel(TablaReparacion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.vistaPrincipal.btnReparacion1){
            this.vistaReparacion.btnReparacion.addActionListener(this);
            this.vistaReparacion.setLocationRelativeTo(null);
            this.vistaReparacion.setVisible(true);
        }
        
        if(e.getSource() == this.vistaReparacion.btnReparacion){
                 this.modeloReparacion.AgregarReparacion(this.vistaReparacion.txtCodigo.getText(),
                    this.vistaReparacion.txtReparacionA.getText(),
                    this.vistaReparacion.txtTecnico.getText(),
                    this.vistaReparacion.txtFecha.getText());
            
            this.TablaReparacion.addRow(new Object[]{this.modeloReparacion.ListaReparacion.get(0).getCodigo(),
            this.modeloReparacion.ListaReparacion.get(0).getReparacion(), 
            this.modeloReparacion.ListaReparacion.get(0).getTecnico(),
            this.modeloReparacion.ListaReparacion.get(0).getFecha()});
                
            }
        
    }
 
        
}
