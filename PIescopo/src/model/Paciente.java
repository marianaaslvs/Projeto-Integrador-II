/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Paciente {
    
    private String nomePaciente;
    private int nAtendimento;
    private int RG;
    private int CPF;
    private int nCarteirinha;
    private int telefone;
    private String email;
    private String endereco;
    private String Convenio;
    private String planoConvenio;
    private int IDagendamento;
    private String observacoes;

    public String getNome() {
        return nomePaciente;
    }

    public void setNome(String nome) {
        this.nomePaciente = nome;
    }

    public int getnAtendimento() {
        return nAtendimento;
    }

    public void setnAtendimento(int nAtendimento) {
        this.nAtendimento = nAtendimento;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getnCarteirinha() {
        return nCarteirinha;
    }

    public void setnCarteirinha(int nCarteirinha) {
        this.nCarteirinha = nCarteirinha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getConvenio() {
        return Convenio;
    }

    public void setConvenio(String Convenio) {
        this.Convenio = Convenio;
    }

    public String getPlanoConvenio() {
        return planoConvenio;
    }

    public void setPlanoConvenio(String planoConvenio) {
        this.planoConvenio = planoConvenio;
    }

    public double getAgendamento() {
        return IDagendamento;
    }

    public void setAgendamento(double agendamento) {
        this.IDagendamento = IDagendamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
   
 
   
}
