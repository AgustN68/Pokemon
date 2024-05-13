public class Normal extends Tipo{
    @Override
    public int modificarDaño(Tipo tipo, int daño) {
        return 0;
    }

    @Override
    public boolean esIgual(Tipo tipo) {
        return false;
    }
}
