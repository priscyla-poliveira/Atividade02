/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author priscyla.poliveira
 */
public class EmpregadoMaisBaseComissao extends EmpregadoComissao{
    
    private double baseSalario;
    
    public EmpregadoMaisBaseComissao(String primeiroNome, String ultimoNome, String numSegSocial, double vendasBrutas,
                                     double taxaComissao, double baseSalario){
        super(primeiroNome, ultimoNome, numSegSocial, vendasBrutas, taxaComissao);
        
        if(baseSalario < 0.0){
            throw new IllegalArgumentException("Base salário deve ser >= 0.0");
        }
        
        this.baseSalario = baseSalario;
    }
    
    /**
     * @return the baseSalario
     */
    public double getBaseSalario() {
        return baseSalario;
    }

    /**
     * @param baseSalario the baseSalario to set
     */
    public void setBaseSalario(double baseSalario) {
        this.baseSalario = baseSalario;
    }

}
