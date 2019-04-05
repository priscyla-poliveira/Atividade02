/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author sunse
 */
public class EmpregadoComissao extends Empregado{
    
    private double vendasBrutas;
    private double taxaComissao;
    
    public EmpregadoComissao(String primeiroNome, String ultimoNome, String numSegSocial, double vendasBrutas, double taxaComissao){
        super(primeiroNome, ultimoNome, numSegSocial);
        
        if(taxaComissao <= 0.0 || taxaComissao >= 1.0){
            throw new IllegalArgumentException("Taxa de comissão deve ser > 0.0 e < 1.0");
        }
        
        if(vendasBrutas < 0.0){
            throw new IllegalArgumentException("Vendas brutas devem ser >= 0.0");
        }
        
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    /**
     * @return the vendasBrutas
     */
    public double getVendasBrutas() {
        return vendasBrutas;
    }

    /**
     * @param vendasBrutas the vendasBrutas to set
     */
    public void setVendasBrutas(double vendasBrutas) {
        if(vendasBrutas < 0.0){
            throw new IllegalArgumentException("Vendas brutas devem ser >= 0.0");
        }
        
        this.vendasBrutas = vendasBrutas;
    }

    /**
     * @return the taxaComissao
     */
    public double getTaxaComissao() {
        return taxaComissao;
    }

    /**
     * @param taxaComissao the taxaComissao to set
     */
    public void setTaxaComissao(double taxaComissao) {
        if(taxaComissao <= 0.0 || taxaComissao >= 1.0){
            throw new IllegalArgumentException("Taxa de comissão deve ser > 0.0 e < 1.0");
        }
        
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double ganhos() {
        return getTaxaComissao() * getVendasBrutas();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %2.f", "Comissão do empregado", super.toString(), "Vendas brutas", getVendasBrutas(), "Taxa de comissão", getTaxaComissao());
    }
}
