package br.com.frota.model;
import java.time;

public class Resultado_exame extends GenericModel{
    private DateTimeFormatter dt_exame;
    private String valor;

    public Resultado_exame(DateTimeFormatter dt_exame, String valor){
        this.dt_exame = dt_exame;
        this.valor = valor;

    }

    public Resultado_exame(Integer id, DateTimeFormatter dt_exame, String valor){
        this.dt_exame = dt_exame;
        this.valor = valor;
        super.setId(id);
    }

    public void setDt_exame(DateTimeFormatter dt_exame) {
        this.dt_exame = dt_exame;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public DateTimeFormatter getDt_exame() {
        return dt_exame;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Resultado_exame {" +
                "id ='" + this.getId() + "\'" +
                "dt_exame ='" + dt_exame + "\'" +
                "valor ='" + valor + "\'" +
                '}';
    }
}