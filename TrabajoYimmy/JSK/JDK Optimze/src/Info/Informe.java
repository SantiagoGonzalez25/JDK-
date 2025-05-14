package Info;

import java.io.File;
import java.sql.Date;

public class Informe {
    private long idinforme; // en vez de string id
    private Date periodo; // en vez de string date 
    private File formatoDeImportacion; // En vez de string file 
    private boolean generado;
    
    public Informe(long idinforme, Date periodo, File formatoDeImportacion, boolean generado) {
        this.idinforme = idinforme;
        this.periodo = periodo;
        this. formatoDeImportacion = formatoDeImportacion;
        this.generado = generado;
    }
    
    public boolean generarReporte(){
        this.generado = true;
        return generado;
    }

    public File exportarInforme(){
        return formatoDeImportacion;
    }

    public long getIdinforme() {
        return idinforme;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public boolean isGenerado() {
        return generado;
    }


}
