package br.com.frota.model;

public class Solicitacao_exame extends GenericModel{
    private String n_prescrito;
    private String dt_solocitac ;

    public Solicitacao_exame(String n_prescrito, String dt_solocitac ){
        this.dt_solocitac  = dt_solocitac ;
        this.n_prescrito = n_prescrito;

    }

    public Solicitacao_exame(Integer id, String n_prescrito, String dt_solocitac ){
        this.dt_solocitac  = dt_solocitac ;
        this.n_prescrito = n_prescrito;
        super.setId(id);
    }

    public void setDt_solocitac (String dt_solocitac ) {
        this.dt_solocitac  = dt_solocitac ;
    }



    public void setN_prescrito(String n_prescrito) {
        this.n_prescrito = n_prescrito;
    }

    public String getDt_solocitac() {
        return dt_solocitac ;
    }


    public String getN_prescrito() {
        return n_prescrito;
    }

    @Override
    public String toString() {
        return "Solicitacao_exame {" +
                "id ='" + this.getId() + "\'" +
                "n_prescrito ='" + n_prescrito + "\'" +
                "dt_solocitac =" + dt_solocitac + "\'" +

                '}';
    }
}