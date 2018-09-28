package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            /*Integer i = -8; // (1)
            // Unboxing en paso de parámetros
            int va = valorAbsoluto(i);
            System.out.println("valor absoluto de " + i + " = " + va);
            List<Double> ld = new ArrayList<>();
            ld.add(Math.PI); // (2)
            // Unboxing en asignación
            double pi = ld.get(0);
            System.out.println("pi = " + pi);*/

            List<Integer> li=new ArrayList<>();
            li.add(3);
            li.add(2);
            li.add(4);
            System.out.println(sumarPares(li));

        }

        // ACT 1
        public static int valorAbsoluto(int i) {
            return (i < 0) ? -i : i;
        }

        public static int sumarPares(List<Integer> li) {
            int sum = 0;
            for (Integer i : li) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;
        }

        //act 3

    }


