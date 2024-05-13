public abstract class Pokemon {
    protected int puntos;
    protected Tipo tipo;

    public int getPuntos() {
        return puntos;
    }

    public void recibirDaño(int daño) {
        if (puntos <= 0) {
            throw new PokemonEstaMuertoException();
        }
        puntos -= daño;
    }

}
