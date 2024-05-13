public class Pikachu extends Pokemon {
    private static final int PUNTOS_INICIALES = 100;
    private static final int DAÑO_IMPACTRUENO = 20;

    public Pikachu() {
        this.puntos = PUNTOS_INICIALES;
    }
    public void impacTrueno(Pokemon pokemon) {
        pokemon.recibirDaño(DAÑO_IMPACTRUENO);
    }
}
