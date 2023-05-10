package com.mycompany.exerciciooverride;

public class Gato extends Animal{
       
        @Override
        public void emitirSom(){
            System.out.println("O Gato miauuuuuuuuuuuu. ");
        }
    @Override
        public void mover (){
      System.out.println("O Gato se movel. ");
       }
   }
