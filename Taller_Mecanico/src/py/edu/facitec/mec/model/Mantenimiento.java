package py.edu.facitec.mec.model;

import java.util.Date;

public class Mantenimiento {
    private int codigo;
    private Date fecha;
    private int cliente_codigo;
    private String condicion;
    private Double importe_total;
    private String observacion;
    private String situacion;

    public Mantenimiento() {
        this.codigo = 0;
        this.fecha = new Date();
        this.cliente_codigo = 0;
        this.condicion = "";
        this.importe_total = 0d;
        this.observacion = "";
        this.situacion = "";
    }

    public Mantenimiento(Date fecha, int cliente_codigo, String condicion, Double importe_total, String observacion, String situacion) {
        this.fecha = fecha;
        this.cliente_codigo = cliente_codigo;
        this.condicion = condicion;
        this.importe_total = importe_total;
        this.observacion = observacion;
        this.situacion = situacion;
    }

    public Mantenimiento(int codigo, Date fecha, int cliente_codigo, String condicion, Double importe_total, String observacion, String situacion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente_codigo = cliente_codigo;
        this.condicion = condicion;
        this.importe_total = importe_total;
        this.observacion = observacion;
        this.situacion = situacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCliente_codigo() {
        return cliente_codigo;
    }

    public void setCliente_codigo(int cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Double getImporte_total() {
        return importe_total;
    }

    public void setImporte_total(Double importe_total) {
        this.importe_total = importe_total;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
    
    
}
