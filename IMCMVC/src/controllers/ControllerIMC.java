package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelIMC;
import views.ViewIMC;

public class ControllerIMC implements ActionListener {
    private final ModelIMC modelIMC;
    private final ViewIMC viewIMC;
     
    public ControllerIMC(ViewIMC viewIMC, ModelIMC modelIMC){
        this.viewIMC = viewIMC;
        this.modelIMC = modelIMC;
        viewIMC.jb_calcular.addActionListener(this);
        initView();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==viewIMC.jb_calcular) {
            jb_calcularActionPerformed();
    }
    }

    private void initView() {
        viewIMC.setTitle("IMC");
        viewIMC.setLocationRelativeTo(null);
        viewIMC.jb_calcular(modelIMC.getResultado());
        viewIMC.setVisible(true);
    }

    private void jb_calcularActionPerformed(int peso, int altura, int resultado) {
    try{
        if (peso < 0 ){
            JOptionPane.showMessageDialog(null,"Estas ingresando números negativos.Verifica los datos ingresados en Peso");   
        }
        if (peso < 40 ){
            JOptionPane.showMessageDialog(null,"Por favor ingresa números reales en peso");
        }
        if (peso > 200){
            JOptionPane.showMessageDialog(null,"Por favor ingresa números reales en peso");
        }
        if (altura < 0 ){
            JOptionPane.showMessageDialog(null,"Estas ingresando números negativos.Verifica los datos ingresados en altura");
        }
        if (altura >= 2){
            JOptionPane.showMessageDialog(null,"Por favor Ingresa la altura en metros no en centimetros");
        }
        else{
        if(peso >=40 && peso <=200){
            if (altura >= 1 && altura <= 2 ){
            int sexo2=jcb_sexo.getSelectedIndex();
            if(sexo2==0){
                if(resultado < 19){
                    JOptionPane.showMessageDialog(null,"Es del sexo Femenino y se encuentra en un grado de desnutrición :u ");
                }
                if(resultado >= 20 && resultado <= 23 ){
                    JOptionPane.showMessageDialog(null,"Es del sexo Femenino y se encuetra en la normalidad :D ");
                }
                if(resultado >= 24 && resultado <= 27 ){
                    JOptionPane.showMessageDialog(null,"Es del sexo Femenino y tiene sobrepeso :c ");
                    }
                if(resultado >= 28 && resultado <= 32){
                    JOptionPane.showMessageDialog(null,"Es del sexo Femenino y  tiene obesidad :u");
                    }
                if(resultado >32){
                    JOptionPane.showMessageDialog(null,"Es del sexo Femenino y tiene obesidad grave :u ");
                    }
            }
            if(sexo2==1){
                if(resultado < 20){
                    JOptionPane.showMessageDialog(null,"Es del sexo Masculino y se encuentra en un grado de desnutrición :u ");
                }
                if(resultado >= 20 && resultado <= 24.9 ){
                    JOptionPane.showMessageDialog(null,"Es del sexo Masculino y se encuetra en la normalidad :D ");
                }
                if(resultado >= 25 && resultado <= 29.9 ){
                    JOptionPane.showMessageDialog(null,"Es del sexo Masculino y tiene sobrepeso :u ");
                    }
                if(resultado >= 30 && resultado <= 40){
                    JOptionPane.showMessageDialog(null,"Es del sexo Masculino y tiene obesidad :u ");
                    }
                if(resultado > 40){
                    JOptionPane.showMessageDialog(null,"Es del sexo Masculino y tiene obesidad grave :u ");
                }     
             }
         }
        }
        }
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"No has llenado los campos");
        }
    }

    private void jb_calcularActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
