package com.company;

import jdk.nashorn.api.tree.Tree;
import java.util.*;

public class Prueba_treeSet {
    public static void main(String[] args) {
        /*TreeSet<String> ordenaPersonas=new TreeSet<>();
        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");

        mostrar(ordenaPersonas);*/

        Articulo a1=new Articulo(1,"Salsa verde");
        Articulo a2=new Articulo(2,"Bebida energetica");
        Articulo a3=new Articulo(6,"Bebida energetica ligth");
        Articulo a4=new Articulo(4,"Macarrones");

        // Ordena por numero
        TreeSet<Articulo> ordenaArticulos=new TreeSet<>();
        ordenaArticulos.add(a1);
        ordenaArticulos.add(a2);
        ordenaArticulos.add(a3);
        ordenaArticulos.add(a4);


        //for (Articulo articulo: ordenaArticulos) {
          //  System.out.println(articulo.getNum()+" "+articulo.getDesc());
        //}

        // Ordena por descripcion
        Articulo comparadorArticulos=new Articulo();
        TreeSet <Articulo> ordenaArticulos2=new TreeSet<>(comparadorArticulos); //Hay que pasarle el comparador por la sobrecarga
        ordenaArticulos2.add(a1);
        ordenaArticulos2.add(a2);
        ordenaArticulos2.add(a3);
        ordenaArticulos2.add(a4);
        /*for (Articulo articulo: ordenaArticulos2) {
            System.out.println(articulo.getNum()+" "+articulo.getDesc());
        }*/


    }

    public static void mostrar(TreeSet<String> a){
        assert a!=null : "Error: la lista no puede ser nula";

        for (String s: a) {
            System.out.println(s);
        }
    }
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
    private int num;
    private String desc;

    public Articulo() {
    }

    public Articulo(int num, String desc){
        setNum(num);
        setDesc(desc);
    }

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String dA=o1.getDesc();
        String dB=o2.getDesc();

        return dA.compareTo(dB);
    }

    @Override
    public int compareTo(Articulo o) {
        return num-o.getNum();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        assert num>0;
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        assert desc!=null;
        assert desc.length()>0;
        this.desc = desc;
    }

}
