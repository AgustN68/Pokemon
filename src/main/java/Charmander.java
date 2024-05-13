public class Charmander extends Pokemon {
    private static final int PUNTOS_INICIALES = 120;
    private static final int DAÑO_BRASAS = 10;

    public Charmander() {
        puntos = PUNTOS_INICIALES;
        tipo = new Fuego();
    }
    public void brasas(Pokemon pokemon){
        int daño = this.tipo.modificarDaño(pokemon.tipo ,DAÑO_BRASAS);
        pokemon.recibirDaño(daño);
    }
}
