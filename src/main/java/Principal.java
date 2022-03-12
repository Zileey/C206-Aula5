public class Principal {
    public static void main(String[] args) {
        Piloto player1 = new Piloto();
        Piloto player2 = new Piloto();

        player1.nome = "Mario";
        player1.vilao = true;

        player2.nome = "Bowser";
        player2.vilao = false;

        Kart moto1 = new Kart();
        Kart moto2 = new Kart();

        moto1.nome = "Moto";
        moto1.piloto = player1;
        moto2.nome = "Carro";
        moto2.piloto = player2;

        moto1.motor.cilindradas = "150";
        moto1.motor.velocidadeMaxima = 135.09f;

        moto2.motor.cilindradas = "100";
        moto2.motor.velocidadeMaxima = 129.45f;


    }
}
