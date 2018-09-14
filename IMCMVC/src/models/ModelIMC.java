package models;

/**
 *
 * @author Jocelyn
 */
public class ModelIMC {
    private Float peso;
    private Float altura;
    private float resultado=peso/(altura*altura);
    private int sexo2= jcb_sexo.getSelectedIndex();

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.jtf_resultado.setText(String.valueOf(resultado));
        this.resultado = resultado;
    }
   
    
    public Float getPeso() {
        peso = Float.parseFloat(this.jtf_peso.getText());
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        altura = Float.parseFloat(this.jtf_altura.getText());
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public int getSexo2() {
        return sexo2;
    }
    public void setSexo2(int sexo2) {
        this.sexo2 = sexo2;
    }
}
