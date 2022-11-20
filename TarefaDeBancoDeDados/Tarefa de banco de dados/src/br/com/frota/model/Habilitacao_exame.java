package br.com.frota.model;

public class Habilitacao_exame extends GenericModel{
    private String observacao;
    private int custo;

    public Habilitacao_exame(String observacao, int custo){
        this.custo = custo;
        this.observacao = observacao;
    }

    public Habilitacao_exame(Integer id, String observacao, int custo){
        this.custo = custo;
        this.observacao = observacao;
        super.setId(id);
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getObservacao() {
        return observacao;
    }

    public int getCusto() {
        return custo;
    }
    @Override
    public String toString() {
        return "Habilitacao_exame {" +
                "id ='" + this.getId() + "\'" +
                "observacao ='" + observacao + "\'" +
                "custo =" + custo + "\'" +
                '}';
    }
}
