import java.util.Objects;

public class ListaDeDatos {
    private String cadenas;

    ListaDeDatos(String str){
        this.cadenas=str;
    }

    public void incluir(String txt){
        this.cadenas=txt;
    }
    public String getString(){
        return this.cadenas;
    }
    public boolean contiene(String str) {
        if (str==null||str=="") {return false;}
        else{return true;}
    }



    //void incluir(texto), boolean contiene(texto) y void MostrarDatosOrdenados()
}
