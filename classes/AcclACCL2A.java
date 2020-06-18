package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class AcclACCL2A implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @NotNull(message = "destino_fondos cannot be null")
    @Size(max = 128, min = 1)
    private String destinoFondos;

    @NotNull(message = "cod_procedimiento cannot be null")
    @NotBlank(message = "cod_procedimiento cannot be blank")
    @Size(max = 3, min = 1)
    private String codProcedimiento;

    @NotNull(message = "cuenta_origen cannot be null")
    @NotBlank(message = "cuenta_origen cannot be blank")
    @Size(max = 20, min = 1)
    private String cuentaOrigen;

    @NotNull(message = "num_orden_ach cannot be null")
    @NotBlank(message = "num_orden_ach cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenAch;

    @NotNull(message = "cuenta_destino cannot be null")
    @NotBlank(message = "cuenta_destino cannot be blank")
    @Size(max = 20, min = 1)
    private String cuentaDestino;

    @NotNull(message = "origen_fondos cannot be null")
    @Size(max = 128, min = 1)
    private String origenFondos;

    @NotNull(message = "titular_originante cannot be null")
    @NotBlank(message = "titular_originante cannot be blank")
    @Size(max = 80, min = 1)
    private String titularOriginante;

    @NotNull(message = "cod_sucursal_originante cannot be null")
    @NotBlank(message = "cod_sucursal_originante cannot be blank")
    @Size(max = 3, min = 1)
    private String codSucursalOriginante;

    @Size(max = 264, min = 1)
    private String etc;

    @NotNull(message = "cod_sub_destinatario cannot be null")
    @Size(max = 64, min = 1)
    private String codSubDestinatario;

    @NotNull(message = "cod_sub_originante cannot be null")
    @Size(max = 64, min = 1)
    private String codSubOriginante;

    @Size(max = 50, min = 1)
    private String codServicio;

    @NotNull(message = "canal cannot be null")
    @NotBlank(message = "canal cannot be blank")
    @Size(max = 10, min = 1)
    private String canal;

    @NotNull(message = "tip_orden cannot be null")
    @NotBlank(message = "tip_orden cannot be blank")
    @Size(max = 3, min = 1)
    private String tipOrden;

    @NotNull(message = "cod_originante cannot be null")
    @NotBlank(message = "cod_originante cannot be blank")
    @Size(max = 3, min = 1)
    private String codOriginante;

    @NotNull(message = "glosa cannot be null")
    @Size(max = 100, min = 1)
    private String glosa;

    @NotNull(message = "cod_pais_originante cannot be null")
    @NotBlank(message = "cod_pais_originante cannot be blank")
    @Size(max = 4, min = 1)
    private String codPaisOriginante;

    @NotNull(message = "titular_destinatario cannot be null")
    @NotBlank(message = "titular_destinatario cannot be blank")
    @Size(max = 80, min = 1)
    private String titularDestinatario;

    @NotNull(message = "tip_cuenta_destino cannot be null")
    @NotBlank(message = "tip_cuenta_destino cannot be blank")
    @Size(max = 15, min = 1)
    private String tipCuentaDestino;

    @NotNull(message = "importe cannot be null")
    @NotBlank(message = "importe cannot be blank")
    @Size(max = 17, min = 1)
    private String importe;

    @NotNull(message = "num_orden_originante cannot be null")
    @NotBlank(message = "num_orden_originante cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenOriginante;

    @NotNull(message = "ci_nit_originante cannot be null")
    @NotBlank(message = "ci_nit_originante cannot be blank")
    @Size(max = 15, min = 1)
    private String ciNitOriginante;

    @NotNull(message = "tipo_documento cannot be null")
    @NotBlank(message = "tipo_documento cannot be blank")
    @Size(max = 10, min = 1)
    private String tipoDocumento;

    @NotNull(message = "cod_destinatario cannot be null")
    @NotBlank(message = "cod_destinatario cannot be blank")
    @Size(max = 9, min = 1)
    private String codDestinatario;

    @NotNull(message = "cod_moneda cannot be null")
    @NotBlank(message = "cod_moneda cannot be blank")
    @Size(max = 3, min = 1)
    private String codMoneda;

    @NotNull(message = "cod_pais_destinatario cannot be null")
    @NotBlank(message = "cod_pais_destinatario cannot be blank")
    @Size(max = 4, min = 1)
    private String codPaisDestinatario;

    @NotNull(message = "tip_cuenta_origen cannot be null")
    @NotBlank(message = "tip_cuenta_origen cannot be blank")
    @Size(max = 15, min = 1)
    private String tipCuentaOrigen;

    @NotNull(message = "cod_camara cannot be null")
    @NotBlank(message = "cod_camara cannot be blank")
    @Size(max = 1, min = 1)
    private String codCamara;

    @NotNull(message = "ci_nit_destinatario cannot be null")
    @NotBlank(message = "ci_nit_destinatario cannot be blank")
    @Size(max = 15, min = 1)
    private String ciNitDestinatario;

    @NotNull(message = "fec_camara cannot be null")
    @NotBlank(message = "fec_camara cannot be blank")
    @Size(max = 10, min = 1)
    private String fecCamara;


//getters
     public String getDestinoFondos() {
        return destinoFondos;
     }
     public String getCodProcedimiento() {
        return codProcedimiento;
     }
     public String getCuentaOrigen() {
        return cuentaOrigen;
     }
     public String getNumOrdenAch() {
        return numOrdenAch;
     }
     public String getCuentaDestino() {
        return cuentaDestino;
     }
     public String getOrigenFondos() {
        return origenFondos;
     }
     public String getTitularOriginante() {
        return titularOriginante;
     }
     public String getCodSucursalOriginante() {
        return codSucursalOriginante;
     }
     public String getEtc() {
        return etc;
     }
     public String getCodSubDestinatario() {
        return codSubDestinatario;
     }
     public String getCodSubOriginante() {
        return codSubOriginante;
     }
     public String getCodServicio() {
        return codServicio;
     }
     public String getCanal() {
        return canal;
     }
     public String getTipOrden() {
        return tipOrden;
     }
     public String getCodOriginante() {
        return codOriginante;
     }
     public String getGlosa() {
        return glosa;
     }
     public String getCodPaisOriginante() {
        return codPaisOriginante;
     }
     public String getTitularDestinatario() {
        return titularDestinatario;
     }
     public String getTipCuentaDestino() {
        return tipCuentaDestino;
     }
     public String getImporte() {
        return importe;
     }
     public String getNumOrdenOriginante() {
        return numOrdenOriginante;
     }
     public String getCiNitOriginante() {
        return ciNitOriginante;
     }
     public String getTipoDocumento() {
        return tipoDocumento;
     }
     public String getCodDestinatario() {
        return codDestinatario;
     }
     public String getCodMoneda() {
        return codMoneda;
     }
     public String getCodPaisDestinatario() {
        return codPaisDestinatario;
     }
     public String getTipCuentaOrigen() {
        return tipCuentaOrigen;
     }
     public String getCodCamara() {
        return codCamara;
     }
     public String getCiNitDestinatario() {
        return ciNitDestinatario;
     }
     public String getFecCamara() {
        return fecCamara;
     }

    private AcclACCL2A(Builder builder){
        this.destinoFondos = builder.destinoFondos;
        this.codProcedimiento = builder.codProcedimiento;
        this.cuentaOrigen = builder.cuentaOrigen;
        this.numOrdenAch = builder.numOrdenAch;
        this.cuentaDestino = builder.cuentaDestino;
        this.origenFondos = builder.origenFondos;
        this.titularOriginante = builder.titularOriginante;
        this.codSucursalOriginante = builder.codSucursalOriginante;
        this.etc = builder.etc;
        this.codSubDestinatario = builder.codSubDestinatario;
        this.codSubOriginante = builder.codSubOriginante;
        this.codServicio = builder.codServicio;
        this.canal = builder.canal;
        this.tipOrden = builder.tipOrden;
        this.codOriginante = builder.codOriginante;
        this.glosa = builder.glosa;
        this.codPaisOriginante = builder.codPaisOriginante;
        this.titularDestinatario = builder.titularDestinatario;
        this.tipCuentaDestino = builder.tipCuentaDestino;
        this.importe = builder.importe;
        this.numOrdenOriginante = builder.numOrdenOriginante;
        this.ciNitOriginante = builder.ciNitOriginante;
        this.tipoDocumento = builder.tipoDocumento;
        this.codDestinatario = builder.codDestinatario;
        this.codMoneda = builder.codMoneda;
        this.codPaisDestinatario = builder.codPaisDestinatario;
        this.tipCuentaOrigen = builder.tipCuentaOrigen;
        this.codCamara = builder.codCamara;
        this.ciNitDestinatario = builder.ciNitDestinatario;
        this.fecCamara = builder.fecCamara;
    }

    public static Builder newAcclACCL2A() {
            return new Builder();
    }

      public static class Builder {
                private String destinoFondos;
                private String codProcedimiento;
                private String cuentaOrigen;
                private String numOrdenAch;
                private String cuentaDestino;
                private String origenFondos;
                private String titularOriginante;
                private String codSucursalOriginante;
                private String etc;
                private String codSubDestinatario;
                private String codSubOriginante;
                private String codServicio;
                private String canal;
                private String tipOrden;
                private String codOriginante;
                private String glosa;
                private String codPaisOriginante;
                private String titularDestinatario;
                private String tipCuentaDestino;
                private String importe;
                private String numOrdenOriginante;
                private String ciNitOriginante;
                private String tipoDocumento;
                private String codDestinatario;
                private String codMoneda;
                private String codPaisDestinatario;
                private String tipCuentaOrigen;
                private String codCamara;
                private String ciNitDestinatario;
                private String fecCamara;

            private Builder() {}

            public AcclACCL2A build() {
                return new AcclACCL2A(this);
            }
            public Builder withDestinoFondos(String destinoFondos) {
                this.destinoFondos = destinoFondos;
                return this;
            }
            public Builder withCodProcedimiento(String codProcedimiento) {
                this.codProcedimiento = codProcedimiento;
                return this;
            }
            public Builder withCuentaOrigen(String cuentaOrigen) {
                this.cuentaOrigen = cuentaOrigen;
                return this;
            }
            public Builder withNumOrdenAch(String numOrdenAch) {
                this.numOrdenAch = numOrdenAch;
                return this;
            }
            public Builder withCuentaDestino(String cuentaDestino) {
                this.cuentaDestino = cuentaDestino;
                return this;
            }
            public Builder withOrigenFondos(String origenFondos) {
                this.origenFondos = origenFondos;
                return this;
            }
            public Builder withTitularOriginante(String titularOriginante) {
                this.titularOriginante = titularOriginante;
                return this;
            }
            public Builder withCodSucursalOriginante(String codSucursalOriginante) {
                this.codSucursalOriginante = codSucursalOriginante;
                return this;
            }
            public Builder withEtc(String etc) {
                this.etc = etc;
                return this;
            }
            public Builder withCodSubDestinatario(String codSubDestinatario) {
                this.codSubDestinatario = codSubDestinatario;
                return this;
            }
            public Builder withCodSubOriginante(String codSubOriginante) {
                this.codSubOriginante = codSubOriginante;
                return this;
            }
            public Builder withCodServicio(String codServicio) {
                this.codServicio = codServicio;
                return this;
            }
            public Builder withCanal(String canal) {
                this.canal = canal;
                return this;
            }
            public Builder withTipOrden(String tipOrden) {
                this.tipOrden = tipOrden;
                return this;
            }
            public Builder withCodOriginante(String codOriginante) {
                this.codOriginante = codOriginante;
                return this;
            }
            public Builder withGlosa(String glosa) {
                this.glosa = glosa;
                return this;
            }
            public Builder withCodPaisOriginante(String codPaisOriginante) {
                this.codPaisOriginante = codPaisOriginante;
                return this;
            }
            public Builder withTitularDestinatario(String titularDestinatario) {
                this.titularDestinatario = titularDestinatario;
                return this;
            }
            public Builder withTipCuentaDestino(String tipCuentaDestino) {
                this.tipCuentaDestino = tipCuentaDestino;
                return this;
            }
            public Builder withImporte(String importe) {
                this.importe = importe;
                return this;
            }
            public Builder withNumOrdenOriginante(String numOrdenOriginante) {
                this.numOrdenOriginante = numOrdenOriginante;
                return this;
            }
            public Builder withCiNitOriginante(String ciNitOriginante) {
                this.ciNitOriginante = ciNitOriginante;
                return this;
            }
            public Builder withTipoDocumento(String tipoDocumento) {
                this.tipoDocumento = tipoDocumento;
                return this;
            }
            public Builder withCodDestinatario(String codDestinatario) {
                this.codDestinatario = codDestinatario;
                return this;
            }
            public Builder withCodMoneda(String codMoneda) {
                this.codMoneda = codMoneda;
                return this;
            }
            public Builder withCodPaisDestinatario(String codPaisDestinatario) {
                this.codPaisDestinatario = codPaisDestinatario;
                return this;
            }
            public Builder withTipCuentaOrigen(String tipCuentaOrigen) {
                this.tipCuentaOrigen = tipCuentaOrigen;
                return this;
            }
            public Builder withCodCamara(String codCamara) {
                this.codCamara = codCamara;
                return this;
            }
            public Builder withCiNitDestinatario(String ciNitDestinatario) {
                this.ciNitDestinatario = ciNitDestinatario;
                return this;
            }
            public Builder withFecCamara(String fecCamara) {
                this.fecCamara = fecCamara;
                return this;
            }
      }


}