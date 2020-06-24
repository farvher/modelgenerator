package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class ACCLEXP1A implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @NotNull(message = "origenFondos cannot be null")
    @NotBlank(message = "origenFondos cannot be blank")
    @Size(max = 128, min = 1)
    private String origenFondos;

    @NotNull(message = "ciNitOrigen cannot be null")
    @NotBlank(message = "ciNitOrigen cannot be blank")
    @Size(max = 15, min = 1)
    private String ciNitOrigen;

    @NotNull(message = "cuentaDestino cannot be null")
    @NotBlank(message = "cuentaDestino cannot be blank")
    @Size(max = 20, min = 1)
    private String cuentaDestino;

    @NotNull(message = "glosa cannot be null")
    @NotBlank(message = "glosa cannot be blank")
    @Size(max = 100, min = 1)
    private String glosa;

    @NotNull(message = "numeroOrdenOriginante cannot be null")
    @NotBlank(message = "numeroOrdenOriginante cannot be blank")
    @Size(max = 20, min = 1)
    private String numeroOrdenOriginante;

    @NotNull(message = "idQr cannot be null")
    @NotBlank(message = "idQr cannot be blank")
    @Size(max = 20, min = 1)
    private String idQr;

    @NotNull(message = "importe cannot be null")
    @NotBlank(message = "importe cannot be blank")
    @Size(max = 17, min = 1)
    private String importe;

    @NotNull(message = "ciNitDestino cannot be null")
    @NotBlank(message = "ciNitDestino cannot be blank")
    @Size(max = 15, min = 1)
    private String ciNitDestino;

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

    @NotNull(message = "cuentaOrigen cannot be null")
    @NotBlank(message = "cuentaOrigen cannot be blank")
    @Size(max = 20, min = 1)
    private String cuentaOrigen;

    @NotNull(message = "tipoCuentaOrigen cannot be null")
    @NotBlank(message = "tipoCuentaOrigen cannot be blank")
    @Size(max = 15, min = 1)
    private String tipoCuentaOrigen;

    @NotNull(message = "destinoFondos cannot be null")
    @NotBlank(message = "destinoFondos cannot be blank")
    @Size(max = 128, min = 1)
    private String destinoFondos;

    @NotNull(message = "titularOrigen cannot be null")
    @NotBlank(message = "titularOrigen cannot be blank")
    @Size(max = 80, min = 1)
    private String titularOrigen;

    @NotNull(message = "canal cannot be null")
    @NotBlank(message = "canal cannot be blank")
    @Size(max = 10, min = 1)
    private String canal;

    @NotNull(message = "titularDestino cannot be null")
    @NotBlank(message = "titularDestino cannot be blank")
    @Size(max = 80, min = 1)
    private String titularDestino;

    @NotNull(message = "codServicio cannot be null")
    @NotBlank(message = "codServicio cannot be blank")
    @Size(max = 50, min = 1)
    private String codServicio;


//getters
     public String getOrigenFondos() {
        return origenFondos;
     }
     public String getCiNitOrigen() {
        return ciNitOrigen;
     }
     public String getCuentaDestino() {
        return cuentaDestino;
     }
     public String getGlosa() {
        return glosa;
     }
     public String getNumeroOrdenOriginante() {
        return numeroOrdenOriginante;
     }
     public String getIdQr() {
        return idQr;
     }
     public String getImporte() {
        return importe;
     }
     public String getCiNitDestino() {
        return ciNitDestino;
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
     public String getCuentaOrigen() {
        return cuentaOrigen;
     }
     public String getTipoCuentaOrigen() {
        return tipoCuentaOrigen;
     }
     public String getDestinoFondos() {
        return destinoFondos;
     }
     public String getTitularOrigen() {
        return titularOrigen;
     }
     public String getCanal() {
        return canal;
     }
     public String getTitularDestino() {
        return titularDestino;
     }
     public String getCodServicio() {
        return codServicio;
     }

    private ACCLEXP1A(Builder builder){
        this.origenFondos = builder.origenFondos;
        this.ciNitOrigen = builder.ciNitOrigen;
        this.cuentaDestino = builder.cuentaDestino;
        this.glosa = builder.glosa;
        this.numeroOrdenOriginante = builder.numeroOrdenOriginante;
        this.idQr = builder.idQr;
        this.importe = builder.importe;
        this.ciNitDestino = builder.ciNitDestino;
        this.codMoneda = builder.codMoneda;
        this.codDestinatario = builder.codDestinatario;
        this.tipoCuentaDestino = builder.tipoCuentaDestino;
        this.cuentaOrigen = builder.cuentaOrigen;
        this.tipoCuentaOrigen = builder.tipoCuentaOrigen;
        this.destinoFondos = builder.destinoFondos;
        this.titularOrigen = builder.titularOrigen;
        this.canal = builder.canal;
        this.titularDestino = builder.titularDestino;
        this.codServicio = builder.codServicio;
    }

    public static Builder newACCLEXP1A() {
            return new Builder();
    }

      public static class Builder {
                private String origenFondos;
                private String ciNitOrigen;
                private String cuentaDestino;
                private String glosa;
                private String numeroOrdenOriginante;
                private String idQr;
                private String importe;
                private String ciNitDestino;
                private String codMoneda;
                private String codDestinatario;
                private String tipoCuentaDestino;
                private String cuentaOrigen;
                private String tipoCuentaOrigen;
                private String destinoFondos;
                private String titularOrigen;
                private String canal;
                private String titularDestino;
                private String codServicio;

            private Builder() {}

            public ACCLEXP1A build() {
                return new ACCLEXP1A(this);
            }
            public Builder withOrigenFondos(String origenFondos) {
                this.origenFondos = origenFondos;
                return this;
            }
            public Builder withCiNitOrigen(String ciNitOrigen) {
                this.ciNitOrigen = ciNitOrigen;
                return this;
            }
            public Builder withCuentaDestino(String cuentaDestino) {
                this.cuentaDestino = cuentaDestino;
                return this;
            }
            public Builder withGlosa(String glosa) {
                this.glosa = glosa;
                return this;
            }
            public Builder withNumeroOrdenOriginante(String numeroOrdenOriginante) {
                this.numeroOrdenOriginante = numeroOrdenOriginante;
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
            public Builder withCiNitDestino(String ciNitDestino) {
                this.ciNitDestino = ciNitDestino;
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
            public Builder withTitularOrigen(String titularOrigen) {
                this.titularOrigen = titularOrigen;
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
            public Builder withCodServicio(String codServicio) {
                this.codServicio = codServicio;
                return this;
            }
      }


}