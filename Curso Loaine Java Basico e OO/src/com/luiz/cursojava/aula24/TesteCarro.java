package com.luiz.cursojava.aula24;

public class TesteCarro {

    public static void main(String[] args) {
        
       Carro van = new Carro();

       van.marca = "Fiat";
       van.modelo = "Ducato";
       van.nPassageiros = 10;
       van.capCombustivel = 100;
       van.consumoCombustivel = 0.2;

       System.out.println(van.modelo);
       System.out.println(van.marca); 

       Carro fusca = new Carro();
       fusca.marca = "Volkswagen";
       fusca.modelo = "Fusca";
       fusca.nPassageiros = 4;
       fusca.capCombustivel = 30;
       fusca.consumoCombustivel = 0.15;

       System.out.println(fusca.marca);
       System.out.println(fusca.modelo);

    }
}
