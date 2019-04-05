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
public class EmpregadoHora extends Empregado{
    
    private double salario;
    private double horas;
    
    public EmpregadoHora(String primeiroNome, String ultimoNome, String numSegSocial, double salario, double horas){
        super(primeiroNome, ultimoNome, numSegSocial);
        
        if(salario < 0.0){
            throw new IllegalArgumentException("Salario por hora deve ser >= 0.0");
        }
        if(horas < 0.0 || horas > 168.0){
            throw new IllegalArgumentException("Horas trabalhadas devem ser >= 0.0 e <= 168.0");
        }
        
        this.salario = salario;
        this.horas = horas;
    }
    
    public void setSalario(double salario){
        if(salario < 0.0){
            throw new IllegalArgumentException("Salario por hora deve ser >= 0.0");
        }
        
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setHoras(double horas){
        if(horas < 0.0 || horas > 168.0){
            throw new IllegalArgumentException("Horas trabalhadas devem ser >= 0.0 e <= 168.0");
        }
        
        this.horas = horas;
    }
    
    public double getHoras(){
        return horas;
    }

    @Override
    public double ganhos() {
        if(getHoras() <= 40){
            return getSalario() * getHoras();
        }
        else{
            return 40 * getSalario() + (getHoras() - 40) * getSalario() * 1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Empregado por hora: %s%n%s: $%,2.f; %s: %,.2f", super.toString(), "Salario por hora", getSalario(), "horas trabalhadas", getHoras());
    }

}
