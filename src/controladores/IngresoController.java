
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelos.ingresos;
import modelos.ingresosModel;
import vistas.frmIngreso;
import vistas.frmPrincipal;


public class IngresoController implements ActionListener 
{
frmPrincipal vistaPrincipal;
frmIngreso vistaIngreso;
ingresosModel ModeloIngreso;
    public DefaultTableModel TablaIngresos = new DefaultTableModel();

    public IngresoController(frmPrincipal vistaPrincipal, frmIngreso vistaIngreso, ingresos modeloIngreso) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaIngreso = vistaIngreso;
        this.ModeloIngreso = ModeloIngreso;
        
        
        this.vistaPrincipal.btnIngreso.addActionListener(this);
        
         this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.vistaPrincipal.setVisible(true);
        this.TablaIngresos.addColumn("MARCA");
        this.TablaIngresos.addColumn("MODELO");
        this.TablaIngresos.addColumn("TIPO");
        this.TablaIngresos.addColumn("PROBLEMA");    
        this.vistaIngreso.jtIngresoC.setModel(TablaIngresos);
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== this.vistaPrincipal.btnIngreso){
           
           this.vistaIngreso.btnIngresarPc.addActionListener(this);
           
           this.vistaIngreso.setLocationRelativeTo(null);
           this.vistaIngreso.setVisible(true);
           
           
            if(e.getSource()== this.vistaIngreso.btnIngresarPc){
                
                 this.ModeloIngreso.AgregarIngresos(this.vistaIngreso.txtMarca.getText(),
                    this.vistaIngreso.txtModelo.getText(),
                    this.vistaIngreso.txtTipo.getText(),
                    this.vistaIngreso.txtProblema.getText());
            this.TablaIngresos.addRow(new Object[]{this.ModeloIngreso.ListaIngresos.get(0).getMarca(),
            this.ModeloIngreso.ListaIngresos.get(0).getModelo(), 
            this.ModeloIngreso.ListaIngresos.get(0).getTipo(),
            this.ModeloIngreso.ListaIngresos.get(0).getProblema()});
                
            }
       }
    }
    
}
