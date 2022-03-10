public class Kart {
    String nome;
    Motor motor;

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
