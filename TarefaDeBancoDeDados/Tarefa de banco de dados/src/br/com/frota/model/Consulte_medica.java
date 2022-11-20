package br.com.frota.model;

public class Consulte_medica extends GenericModel{
    private DateTime dt_consulta;
    private String nm_atendimento;

    public Consulte_medica(DateTime dt_consulta, String nm_atendimento){
        this.dt_consulta = dt_consulta;
        this.nm_atendimento = nm_atendimento;
    }

    public Consulte_medica(Integer id, DateTime dt_consulta, String nm_atendimento){
        this.dt_consulta = dt_consulta;
        this.nm_atendimento = nm_atendimento;
        super.setId(id);
    }

    public void setDt_consulta(DateTime dt_consulta) {
        this.dt_consulta = dt_consulta;
    }

    public void setNm_atendimento(String nm_atendimento) {
        this.nm_atendimento = nm_atendimento;
    }

    public DateTime getDt_consulta() {
        return dt_consulta;
    }

    public String getNm_atendimento() {
        return nm_atendimento;
    }

    @Override
    public String toString() {
        return "Paceiente {" +
                "id ='" + this.getId() + "\'" +
                "dt_consulta ='" + dt_consulta + "\'" +
                "nm_atendimento =" + nm_atendimento + "\'" +
                '}';
    }
}