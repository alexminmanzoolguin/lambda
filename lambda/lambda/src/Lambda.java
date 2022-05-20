/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.function.*;
/**
 *
 * @author alex_
 */
public class Lambda {
    public static<T>List<T>consultar(List<T> lista,Predicate<T> predicate){
        List<T>consultar= new ArrayList<>();
        for(T t:lista){
            if(predicate.test(t)){
                consultar.add(t);
            }
        }
        return consultar;
    }
    public static void main(String[] args) {
      List<Materias> Listar_Materias = new ArrayList<>();
      Listar_Materias.add(new Materias("matematicas",1760100));
      Listar_Materias.add(new Materias("fisica",1760101));
      Listar_Materias.add(new Materias("quimica",1760102));
      Listar_Materias.add(new Materias("español",2010103));
       List<Materias> consultar = consultar(Listar_Materias, (Materias nom_materia) -> nom_materia.getMatricula() > 300000);

        for (Materias nom_materia : consultar) {
            System.out.println("La materia: " + " " + nom_materia.getNom_materia() + " " + "tiene una matricula mayor o igual a 300000");
        }
    }
}

