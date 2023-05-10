package com.mycompany.exerciciooverride;

public class ExercicioOverride {

    public static void main(String[] args) {
        
        Cachorro Animal = new Cachorro();
        Animal.emitirSom();
        Animal.mover();
        
        Gato Animall = new Gato();
        Animall.emitirSom();
        Animall.mover();
        
        Animal animal = new Animal();
        animal.emitirSom();
        animal.mover();
    }
}
