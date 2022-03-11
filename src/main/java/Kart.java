public class Kart {
    String nome;
    Motor motor;
    Piloto piloto; //Agregação do piloto entre o Kart

    public Kart(){ // Construtor para a criação da composição entre Kart e motor
        motor = new Motor(); //Novo motor criado no Kart
    }



    void pular(){
        System.out.println("O kart "+nome+" pulou!");
    }

    void soltarTurbo(){
        System.out.println("O kart "+nome+" acabou de soltar o Turbo!");
    }

    void fazerDrift(){
        System.out.println("O kart "+nome+" fez um drift!");
    }
}
