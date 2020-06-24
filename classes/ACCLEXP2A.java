package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class ACCLEXP2A implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @NotNull(message = "ciNitOrigen cannot be null")
    @NotBlank(message = "ciNitOrigen cannot be blank")
    @Size(max = 15, min = 1)
    private String ciNitOrigen;

    @NotNull(message = "fecCamara cannot be null")
    @NotBlank(message = "fecCamara cannot be blank")
    @Size(max = 10, min = 1)
    private String fecCamara;

    @NotNull(message = "codSucursalOriginante cannot be null")
    @NotBlank(message = "codSucursalOriginante cannot be blank")
    @Size(max = 3, min = 1)
    private String codSucursalOriginante;

    @NotNull(message = "codOriginante cannot be null")
    @NotBlank(message = "codOriginante cannot be blank")
    @Size(max = 3, min = 1)
    private String codOriginante;

    @NotNull(message = "codMoneda cannot be null")
    @NotBlank(message = "codMoneda cannot be blank")
    @Size(max = 3, min = 1)
    private String codMoneda;

    @NotNull(message = "codDestinatario cannot be null")
    @NotBlank(message = "codDestinatario cannot be blank")
    @Size(max = 9, min = 1)
    private String codDestinatario;

    @NotNull(message = "tipoCuentaDestino cannot be null")
    @NotBlank(message = "tipoCuentaDestino cannot be blank")
    @Size(max = 15, min = 1)
    private String tipoCuentaDestino;

    @NotNull(message = "titularOrigen cannot be null")
    @NotBlank(message = "titularOrigen cannot be blank")
    @Size(max = 80, min = 1)
    private String titularOrigen;

    @NotNull(message = "codProcedimiento cannot be null")
    @NotBlank(message = "codProcedimiento cannot be blank")
    @Size(max = 3, min = 1)
    private String codProcedimiento;

    @NotNull(message = "canal cannot be null")
    @NotBlank(message = "canal cannot be blank")
    @Size(max = 10, min = 1)
    private String canal;

    @NotNull(message = "titularDestino cannot be null")
    @NotBlank(message = "titularDestino cannot be blank")
    @Size(max = 80, min = 1)
    private String titularDestino;

    @NotNull(message = "numOrdenAch cannot be null")
    @NotBlank(message = "numOrdenAch cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenAch;

    @Size(max = 128, min = 1)
    private String origenFondos;

    @NotNull(message = "cuentaDestino cannot be null")
    @NotBlank(message = "cuentaDestino cannot be blank")
    @Size(max = 20, min = 1)
    private String cuentaDestino;

    @NotNull(message = "tipoOrden cannot be null")
    @NotBlank(message = "tipoOrden cannot be blank")
    @Size(max = 3, min = 1)
    private String tipoOrden;

    @NotNull(message = "glosa cannot be null")
    @NotBlank(message = "glosa cannot be blank")
    @Size(max = 100, min = 1)
    private String glosa;

    @NotNull(message = "codPaisOriginante cannot be null")
    @NotBlank(message = "codPaisOriginante cannot be blank")
    @Size(max = 4, min = 1)
    private String codPaisOriginante;

    @NotNull(message = "idQr cannot be null")
    @NotBlank(message = "idQr cannot be blank")
    @Size(max = 20, min = 1)
    private String idQr;

    @NotNull(message = "importe cannot be null")
    @NotBlank(message = "importe cannot be blank")
    @Size(max = 17, min = 1)
    private String importe;

    @NotNull(message = "numOrdenOriginante cannot be null")
    @NotBlank(message = "numOrdenOriginante cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenOriginante;

    @NotNull(message = "tipoDocumento cannot be null")
    @NotBlank(message = "tipoDocumento cannot be blank")
    @Size(max = 10, min = 1)
    private String tipoDocumento;

    @NotNull(message = "codPaisDestinatario cannot be null")
    @NotBlank(message = "codPaisDestinatario cannot be blank")
    @Size(max = 4, min = 1)
    private String codPaisDestinatario;

    @NotNull(message = "ciNitDestino cannot be null")
    @NotBlank(message = "ciNitDestino cannot be blank")
    @Size(max = 15, min = 1)
    private String ciNitDestino;

    @NotNull(message = "cuentaOrigen cannot be null")
    @NotBlank(message = "cuentaOrigen cannot be blank")
    @Size(max = 20, min = 1)
    private String cuentaOrigen;

    @NotNull(message = "tipoCuentaOrigen cannot be null")
    @NotBlank(message = "tipoCuentaOrigen cannot be blank")
    @Size(max = 15, min = 1)
    private String tipoCuentaOrigen;

    @Size(max = 128, min = 1)
    private String destinoFondos;

    @Size(max = 50, min = 1)
    private String codServicio;


//getters
     public String getCiNitOrigen() {
        return ciNitOrigen;
     }
     public String getFecCamara() {
        return fecCamara;
     }
     public String getCodSucursalOriginante() {
        return codSucursalOriginante;
     }
     public String getCodOriginante() {
        return codOriginante;
     }
     public String getCodMoneda() {
        return codMoneda;
     }
     public String getCodDestinatario() {
        return codDestinatario;
     }
     public String getTipoCuentaDestino() {
        return tipoCuentaDestino;
     }
     public String getTitularOrigen() {
        return titularOrigen;
     }
     public String getCodProcedimiento() {
        return codProcedimiento;
     }
     public String getCanal() {
        return canal;
     }
     public String getTitularDestino() {
        return titularDestino;
     }
     public String getNumOrdenAch() {
        return numOrdenAch;
     }
     public String getOrigenFondos() {
        return origenFondos;
     }
     public String getCuentaDestino() {
        return cuentaDestino;
     }
     public String getTipoOrden() {
        return tipoOrden;
     }
     public String getGlosa() {
        return glosa;
     }
     public String getCodPaisOriginante() {
        return codPaisOriginante;
     }
     public String getIdQr() {
        return idQr;
     }
     public String getImporte() {
        return importe;
     }
     public String getNumOrdenOriginante() {
        return numOrdenOriginante;
     }
     public String getTipoDocumento() {
        return tipoDocumento;
     }
     public String getCodPaisDestinatario() {
        return codPaisDestinatario;
     }
     public String getCiNitDestino() {
        return ciNitDestino;
     }
     public String getCuentaOrigen() {
        return cuentaOrigen;
     }
     public String getTipoCuentaOrigen() {
        return tipoCuentaOrigen;
     }
     public String getDestinoFondos() {
        return destinoFondos;
     }
     public String getCodServicio() {
        return codServicio;
     }

    private ACCLEXP2A(Builder builder){
        this.ciNitOrigen = builder.ciNitOrigen;
        this.fecCamara = builder.fecCamara;
        this.codSucursalOriginante = builder.codSucursalOriginante;
        this.codOriginante = builder.codOriginante;
        this.codMoneda = builder.codMoneda;
        this.codDestinatario = builder.codDestinatario;
        this.tipoCuentaDestino = builder.tipoCuentaDestino;
        this.titularOrigen = builder.titularOrigen;
        this.codProcedimiento = builder.codProcedimiento;
        this.canal = builder.canal;
        this.titularDestino = builder.titularDestino;
        this.numOrdenAch = builder.numOrdenAch;
        this.origenFondos = builder.origenFondos;
        this.cuentaDestino = builder.cuentaDestino;
        this.tipoOrden = builder.tipoOrden;
        this.glosa = builder.glosa;
        this.codPaisOriginante = builder.codPaisOriginante;
        this.idQr = builder.idQr;
        this.importe = builder.importe;
        this.numOrdenOriginante = builder.numOrdenOriginante;
        this.tipoDocumento = builder.tipoDocumento;
        this.codPaisDestinatario = builder.codPaisDestinatario;
        this.ciNitDestino = builder.ciNitDestino;
        this.cuentaOrigen = builder.cuentaOrigen;
        this.tipoCuentaOrigen = builder.tipoCuentaOrigen;
        this.destinoFondos = builder.destinoFondos;
        this.codServicio = builder.codServicio;
    }

    public static Builder newACCLEXP2A() {
            return new Builder();
    }

      public static class Builder {
                private String ciNitOrigen;
                private String fecCamara;
                private String codSucursalOriginante;
                private String codOriginante;
                private String codMoneda;
                private String codDestinatario;
                private String tipoCuentaDestino;
                private String titularOrigen;
                private String codProcedimiento;
                private String canal;
                private String titularDestino;
                private String numOrdenAch;
                private String origenFondos;
                private String cuentaDestino;
                private String tipoOrden;
                private String glosa;
                private String codPaisOriginante;
                private String idQr;
                private String importe;
                private String numOrdenOriginante;
                private String tipoDocumento;
                private String codPaisDestinatario;
                private String ciNitDestino;
                private String cuentaOrigen;
                private String tipoCuentaOrigen;
                private String destinoFondos;
                private String codServicio;

            private Builder() {}

            public ACCLEXP2A build() {
                return new ACCLEXP2A(this);
            }
            public Builder withCiNitOrigen(String ciNitOrigen) {
                this.ciNitOrigen = ciNitOrigen;
                return this;
            }
            public Builder withFecCamara(String fecCamara) {
                this.fecCamara = fecCamara;
                return this;
            }
            public Builder withCodSucursalOriginante(String codSucursalOriginante) {
                this.codSucursalOriginante = codSucursalOriginante;
                return this;
            }
            public Builder withCodOriginante(String codOriginante) {
                this.codOriginante = codOriginante;
                return this;
            }
            public Builder withCodMoneda(String codMoneda) {
                this.codMoneda = codMoneda;
                return this;
            }
            public Builder withCodDestinatario(String codDestinatario) {
                this.codDestinatario = codDestinatario;
                return this;
            }
            public Builder withTipoCuentaDestino(String tipoCuentaDestino) {
                this.tipoCuentaDestino = tipoCuentaDestino;
                return this;
            }
            public Builder withTitularOrigen(String titularOrigen) {
                this.titularOrigen = titularOrigen;
                return this;
            }
            public Builder withCodProcedimiento(String codProcedimiento) {
                this.codProcedimiento = codProcedimiento;
                return this;
            }
            public Builder withCanal(String canal) {
                this.canal = canal;
                return this;
            }
            public Builder withTitularDestino(String titularDestino) {
                this.titularDestino = titularDestino;
                return this;
            }
            public Builder withNumOrdenAch(String numOrdenAch) {
                this.numOrdenAch = numOrdenAch;
                return this;
            }
            public Builder withOrigenFondos(String origenFondos) {
                this.origenFondos = origenFondos;
                return this;
            }
            public Builder withCuentaDestino(String cuentaDestino) {
                this.cuentaDestino = cuentaDestino;
                return this;
            }
            public Builder withTipoOrden(String tipoOrden) {
                this.tipoOrden = tipoOrden;
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
            public Builder withIdQr(String idQr) {
                this.idQr = idQr;
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
            public Builder withTipoDocumento(String tipoDocumento) {
                this.tipoDocumento = tipoDocumento;
                return this;
            }
            public Builder withCodPaisDestinatario(String codPaisDestinatario) {
                this.codPaisDestinatario = codPaisDestinatario;
                return this;
            }
            public Builder withCiNitDestino(String ciNitDestino) {
                this.ciNitDestino = ciNitDestino;
                return this;
            }
            public Builder withCuentaOrigen(String cuentaOrigen) {
                this.cuentaOrigen = cuentaOrigen;
                return this;
            }
            public Builder withTipoCuentaOrigen(String tipoCuentaOrigen) {
                this.tipoCuentaOrigen = tipoCuentaOrigen;
                return this;
            }
            public Builder withDestinoFondos(String destinoFondos) {
                this.destinoFondos = destinoFondos;
                return this;
            }
            public Builder withCodServicio(String codServicio) {
                this.codServicio = codServicio;
                return this;
            }
      }


}