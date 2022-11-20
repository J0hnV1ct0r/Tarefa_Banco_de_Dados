package br.com.frota.model;

public class Valor_referencia_composicao_exame extends GenericModel{
    private String valor_minimo;
    private String valor_maximo;
    private String limitador_minimo;
    private String limitador_maximo;

    public Valor_referencia_composicao_exame(String valor_minimo, String valor_maximo, String limitador_minimo, String limitador_maximo){
        this.valor_minimo = valor_minimo;
        this.limitador_maximo = limitador_maximo;
        this.valor_maximo = valor_maximo;
        this.limitador_minimo = limitador_minimo;

    }

    public Valor_referencia_composicao_exame(Integer id, String valor_minimo, String valor_maximo, String limitador_minimo, String limitador_maximo){
        this.valor_minimo = valor_minimo;
        this.limitador_maximo = limitador_maximo;
        this.valor_maximo = valor_maximo;
        this.limitador_minimo = limitador_minimo;
        super.setId(id);
    }

    public void setLimitador_maximo(String limitador_maximo) {
        this.limitador_maximo = limitador_maximo;
    }

    public void setLimitador_minimo(String limitador_minimo) {
        this.limitador_minimo = limitador_minimo;
    }

    public void setValor_maximo(String valor_maximo) {
        this.valor_maximo = valor_maximo;
    }

    public void setValor_minimo(String valor_minimo) {
        this.valor_minimo = valor_minimo;
    }

    public String getLimitador_maximo() {
        return limitador_maximo;
    }

    public String getValor_maximo() {
        return valor_maximo;
    }

    public String getValor_minimo() {
        return valor_minimo;
    }

    public String getLimitador_minimo() {
        return limitador_minimo;
    }

    @Override
    public String toString() {
        return "Valor_referencia_composicao_exame {" +
                "id ='" + this.getId() + "\'" +
                "valor_minimo ='" + valor_minimo + "\'" +
                "valor_maximo ='" + valor_maximo + "\'" +
                "limitador_minimo ='" + limitador_minimo + "\'" +
                "limitador_maximo ='" + limitador_maximo + "\'" +
                '}';
    }
}