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

    public String getFechaYHora(){
        String aDevolver = "";
        aDevolver = hora.getTextoDeLaPantalla()+":"+minutos.getTextoDeLaPantalla()+" "+ dia.getTextoDeLaPantalla()+"-"+mes.getTextoDeLaPantalla()+"-"+ano.getTextoDeLaPantalla();
        return aDevolver;
    }

    public void avanzarMinuto(){
        minutos.incrementaValorAlmacenado();
        if(minutos.getValorAlmacenado() == 0){
            hora.incrementaValorAlmacenado();
            if(hora.getValorAlmacenado() == 0){
                dia.incrementaValorAlmacenado();
                if(dia.getValorAlmacenado() == 1){
                    mes.incrementaValorAlmacenado();
                    if(mes.getValorAlmacenado() == 1){
                        ano.incrementaValorAlmacenado();
                    }
                }
            }
        }
    }

    public void fijarFechaYHora(int nuevoValorHora, int nuevoValorMinutos, int nuevoValorDia, int nuevoValorMes, int nuevoValorAno){
        hora.setValorAlmacenado(nuevoValorHora);
        minutos.setValorAlmacenado(nuevoValorMinutos);
        dia.setValorAlmacenado(nuevoValorDia);
        mes.setValorAlmacenado(nuevoValorMes);
        ano.setValorAlmacenado(nuevoValorAno);
    }
}
