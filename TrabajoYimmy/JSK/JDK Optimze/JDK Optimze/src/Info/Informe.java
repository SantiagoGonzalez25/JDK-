package Info;

import java.io.File;
import java.sql.Date;

public class Informe {
    private long Id;
    private Date Periodo; // en vez de string date 
    private File FormatoDeImportacion; // En vez de string file 
    private boolean Informe = false;
    
    public Informe(long id, Date periodo, File formatoDeImportacion, boolean informe) {
        this.Id = id;
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
