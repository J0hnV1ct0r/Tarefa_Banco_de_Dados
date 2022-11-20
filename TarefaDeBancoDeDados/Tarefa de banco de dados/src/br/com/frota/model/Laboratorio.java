package br.com.frota.model;

public class Laboratorio extends GenericModel{
    private String descricao;
    private String nome_fantasia;
    private String cnes;
    private String cnpj;
    private String crbm;

    public Laboratorio(String descricao,String nome_fantasia, String cnes, String cnpj,Sting crbm){
        this.descricao =  descricao;
        this.nome_fantasia = nome_fantasia;
        this.cnes = cnes;
        this.cnpj = cnpj;
        this.crbm =  crbm;
    }

    public Laboratorio(Integer id, String descricao,String nome_fantasia, String cnes, String cnpj,Sting crbm){
        this.descricao =  descricao;
        this.nome_fantasia = nome_fantasia;
        this.cnes = cnes;
        this.cnpj = cnpj;
        this.crbm =  crbm;
        super.setId(id);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome_fantasia(String nome_fantasia) {

        this.nome_fantasia = nome_fantasia;
    }

    public void setCnes(String cnes) {

        this.cnes = cnes;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public void setCrbm(String crbm) {

        this.crbm = crbm;
    }

    //
    public String getDescricao(){
        return descricao;
    }

    public String getCnes() {
        return cnes;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCrbm() {
        return crbm;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    @Override
    public String toString() {
        return "Laboratorio {" +
                "id ='" + this.getId() + "\'" +
                "descricao ='" + descricao + "\'" +
                "nome_fantasia =" + nome_fantasia + "\'" +
                "cnes =" + cnes + "\'" +
                "cnpj =" + cnpj + "\'" +
                "crbm =" + crbm +"\'" +
                '}';
    }



}
