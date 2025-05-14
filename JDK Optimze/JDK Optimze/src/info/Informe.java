package info;

import java.io.File;
import java.sql.Date;

public class Informe {
    @SuppressWarnings("unused")
    private long IdInforme;
    @SuppressWarnings("unused")
    private Date Periodo; // en vez de string date 
    private File FormatoDeImportacion; // En vez de string file 
    private boolean Informe = false;
    
    public Informe(long IdInforme, Date periodo, File formatoDeImportacion, boolean informe) {
        this.IdInforme = IdInforme;
        this.Periodo = periodo;
        this.FormatoDeImportacion = formatoDeImportacion;
        this.Informe = informe;
    }
    public boolean GenerarReporte(){
        Informe = true;
        return Informe;
    }
    public File ExportarInforme(){
        return FormatoDeImportacion;
    }


}
