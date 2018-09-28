package com.company;


import java.util.Comparator;
import java.util.TreeSet;

class ArticuloII implements Comparable<Articulo>{
    private int num;
    private String desc;

    public static void main(String[] args) {
        ArticuloII a1=new ArticuloII(1,"Salsa verde");
        ArticuloII a2=new ArticuloII(2,"Bebida energetica");
        ArticuloII a3=new ArticuloII(6,"Bebida energetica ligth");
        ArticuloII a4=new ArticuloII(4,"Macarrones");

        ComparadorArticulos compara_art = new ComparadorArticulos();
        TreeSet<ArticuloII> ordenaArticulos3=new TreeSet<>(compara_art);
        ordenaArticulos3.add(a1);
        ordenaArticulos3.add(a2);
        ordenaArticulos3.add(a3);
        ordenaArticulos3.add(a4);
        for (ArticuloII articulo: ordenaArticulos3) {
            System.out.println(articulo.getNum()+" "+articulo.getDesc());
        }
    }

    public ArticuloII(int num, String desc){
        setNum(num);
        setDesc(desc);
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

class ComparadorArticulos implements Comparator<ArticuloII>{

    @Override
    public int compare(ArticuloII o1, ArticuloII o2) {
        String d1=o1.getDesc();
        String d2=o2.getDesc();
        return d1.compareTo(d2);
    }
}