public class RespuestaSeleccionUnica extends Respuesta{

    @Override
    public boolean agregarRespuesta(String rsta) {
        if(identificarTipo(rsta)==1){
            String[] rstas = rsta.split("/**/");
            addRespuesta(rstas[0]);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int identificarTipo(String rsta) {
        int tipo=0;
        for (int i = rsta.length()-1; i > rsta.length()-2; i--) {
            tipo=Character.getNumericValue(rsta.charAt(i));
            
        }
        return tipo;
    }
    
}
