public class PantallaHoraYFecha
{
    private PantallaDosDigitos mes;
    private PantallaDosDigitos ano;
    private PantallaDosDigitos dia;
    private PantallaDosDigitos hora;
    private PantallaDosDigitos minutos;
    
    public PantallaHoraYFecha(){
        ano = new PantallaDosDigitos(1,100);
        mes = new PantallaDosDigitos(1,13);
        dia = new PantallaDosDigitos(1,31);
        hora = new PantallaDosDigitos(0,24);
        minutos = new PantallaDosDigitos(0,60);
    }
}
