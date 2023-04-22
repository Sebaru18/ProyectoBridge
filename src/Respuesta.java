import java.util.ArrayList;

public abstract class Respuesta {
    ArrayList<String> respuestas;
    int id;

    public abstract boolean agregarRespuesta(String rsta);
    public abstract int identificarTipo(String rsta);

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }
    
    public void addRespuesta(String rsta){
        respuestas.add(rsta);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
