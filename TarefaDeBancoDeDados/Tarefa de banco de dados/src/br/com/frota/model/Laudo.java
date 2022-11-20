package br.com.frota.model;

public class Laudo extends GenericModel{
    private String assinatura_digital;
    private String dt_resultado;
    private String codigo;

    public Laudo(String assinatura_digital, String dt_resultado, String codigo){
        this.assinatura_digital = assinatura_digital;
        this.codigo = codigo;
        this.dt_resultado = dt_resultado;
    }

    public Laudo(Integer id, String assinatura_digital, String dt_resultado, String codigo){
        this.assinatura_digital = assinatura_digital;
        this.codigo = codigo;
        this.dt_resultado = dt_resultado;
        super.setId(id);
    }

    public void setAssinatura_digital(String assinatura_digital) {
        this.assinatura_digital = assinatura_digital;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDt_resultado(String dt_resultado) {
        this.dt_resultado = dt_resultado;
    }

    public String getAssinatura_digital() {
        return assinatura_digital;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDt_resultado() {
        return dt_resultado;
    }
    @Override
    public String toString() {
        return "Laudo {" +
                "id ='" + this.getId() + "\'" +
                "assinatura_digital ='" + assinatura_digital + "\'" +
                "codigo =" + codigo + "\'" +
                "dt_resultado =" + dt_resultado + "\'" +
                '}';
    }
}
