/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Materias {
    private String nom_materia;
     private int matricula;
     public Materias(String nom_materia,int matricula){
         this.nom_materia=nom_materia;
         this.matricula=matricula;
     }
     public int getMatricula(){
    return matricula;
}
     public void setMatricula(int matricula){
         this.matricula=matricula;
     }
     
     public String getNom_materia(){
         return nom_materia;
     }
     public void setNom_materia(String nom_materia){
         this.nom_materia=nom_materia;
     }
     
}
