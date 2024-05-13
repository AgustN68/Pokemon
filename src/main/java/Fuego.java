public class Fuego extends Tipo{
    @Override
    public int modificarDaño(Tipo tipoDelPokemon, int daño) {

        if (tipoDelPokemon instanceof Agua){
        /*if (tipoDelPokemon.equals(new Agua())){*/
            return (daño/2);
        }
        /*else if (tipoDelPokemon.esIgual(new Planta())){*/
        else if (tipoDelPokemon instanceof Planta){
            return (daño*2);
        }
        else{
            return daño;
        }
    }
    @Override
    public boolean esIgual(Tipo tipo) {
        return this == tipo;
    }
}
