package etec.com.br.giovanna.focus.modelo;

import java.io.Serializable;
import java.util.Date;

public class Responsavel implements Serializable {

    private int id;
    private String nome;
    private String datanasc;
    private String email;
    private String senha;


    public Responsavel(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeResp() {
        return nome;
    }

    public void setNomeResp(String nome) {
        this.nome = nome;
    }

    public String getdatanasc() {
        return datanasc;
    }

    public void setData(String data) {
        this.datanasc = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override //Para nao aparecer o nome do objeto
    public String toString() {
        return nome.toString();
    }


}
