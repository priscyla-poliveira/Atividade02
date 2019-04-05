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
public class EmpregadoAssalariado extends Empregado{
    
    private double salarioSemanal;
    
    public EmpregadoAssalariado(String primeiroNome, String ultimoNome, String numSegSocial, double salarioSemanal){
        super(primeiroNome, ultimoNome, numSegSocial);
        
        if(salarioSemanal < 0.0){
            throw new IllegalArgumentException("Salário semanal deve ser >= 0.0");
        }
        
        this.salarioSemanal = salarioSemanal;
    }
    
    public void setSalarioSemanal(double salarioSemanal){
        if(salarioSemanal < 0.0){
            throw new IllegalArgumentException("Salário semanal deve ser >= 0.0");
        }
        
        this.salarioSemanal = salarioSemanal;
    }
    
    public double getSalarioSemanal(){
        return salarioSemanal;
    }

    @Override
    public double ganhos() {
        return getSalarioSemanal();
    }
    
    public String toString(){
        return String.format("Empregado assalariado: %s%n%s: $%,.2f", super.toString(), "Salário semanal", getSalarioSemanal());
    }
}
