package SistemaLivraria;

public class Editora {
   private String nome;
   private String ano;
   private String cnpj;
   private String endereco;
   private String pais;
   private String Estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Editora(String nome, String ano, String cnpj, String endereco, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.pais = pais;
        Estado = estado;

    }
}
