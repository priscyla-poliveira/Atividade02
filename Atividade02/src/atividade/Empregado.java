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
public abstract class Empregado {
    
    private final String primeiroNome;
    private final String ultimoNome;
    private final String numSegSocial;
    
    public Empregado(String primeiroNome, String ultimoNome, String numSegSocial){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.numSegSocial = numSegSocial;
    }

    /**
     * @return the primeiroNome
     */
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     * @return the ultimoNome
     */
    public String getUltimoNome() {
        return ultimoNome;
    }

    /**
     * @return the numSegSocial
     */
    public String getNumSegSocial() {
        return numSegSocial;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s%nNúmero da Segurança Social: %s", getPrimeiroNome(), getUltimoNome(), getUltimoNome());
    }
    
    public abstract double ganhos();
}
