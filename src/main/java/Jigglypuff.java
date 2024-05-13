public class Jigglypuff extends Pokemon {
    private static final int PUNTOS_INICIALES = 60;
    private static final int DAÑO_CACHETAZO = 10;

    public Jigglypuff() {
        puntos = PUNTOS_INICIALES;
        tipo = new Normal();
    }
    public void cachetazo(Pokemon pokemon){
        pokemon.recibirDaño(DAÑO_CACHETAZO);
    }
}
