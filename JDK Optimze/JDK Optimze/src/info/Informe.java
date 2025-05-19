package info;

import java.io.File;
import java.sql.Date;

public class Informe {
    private long idInforme;
    private Date periodo;
    private File formatoExportacion;
    private boolean generado;

    public Informe(long idInforme, Date periodo, File formatoExportacion, boolean generado) {
        this.idInforme = idInforme;
        this.periodo = periodo;
        this.formatoExportacion = formatoExportacion;
        this.generado = generado;
    }

    public boolean generarReporte() {
        this.generado = true;
        return generado;
    }

    public File exportarInforme() {
        return formatoExportacion;
    }

    
    public long getIdInforme() {
        return idInforme;
    }

    public boolean isGenerado() {
        return generado;
    }

    public Date getPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    public void setFormatoExportacion(File formatoExportacion) {
        this.formatoExportacion = formatoExportacion;
    }
}
