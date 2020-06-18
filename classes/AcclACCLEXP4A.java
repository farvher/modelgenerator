package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class AcclACCLEXP4A implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @NotNull(message = "descripcionRespuesta cannot be null")
    @NotBlank(message = "descripcionRespuesta cannot be blank")
    @Size(max = 255, min = 1)
    private String descripcionRespuesta;

    @Size(max = 80, min = 1)
    private String titularDestinatario;

    @Size(max = 20, min = 1)
    private String numeroOrdenCamara;

    @Size(max = 20, min = 1)
    private String numeroOrdenOriginante;

    @Size(max = 20, min = 1)
    private String numeroOrdenDestinatario;

    @NotNull(message = "codigoRespuesta cannot be null")
    @NotBlank(message = "codigoRespuesta cannot be blank")
    @Size(max = 4, min = 1)
    private String codigoRespuesta;

    @Size(max = 10, min = 1)
    private String sucursalDestinatario;


//getters
     public String getDescripcionRespuesta() {
        return descripcionRespuesta;
     }
     public String getTitularDestinatario() {
        return titularDestinatario;
     }
     public String getNumeroOrdenCamara() {
        return numeroOrdenCamara;
     }
     public String getNumeroOrdenOriginante() {
        return numeroOrdenOriginante;
     }
     public String getNumeroOrdenDestinatario() {
        return numeroOrdenDestinatario;
     }
     public String getCodigoRespuesta() {
        return codigoRespuesta;
     }
     public String getSucursalDestinatario() {
        return sucursalDestinatario;
     }

    private AcclACCLEXP4A(Builder builder){
        this.descripcionRespuesta = builder.descripcionRespuesta;
        this.titularDestinatario = builder.titularDestinatario;
        this.numeroOrdenCamara = builder.numeroOrdenCamara;
        this.numeroOrdenOriginante = builder.numeroOrdenOriginante;
        this.numeroOrdenDestinatario = builder.numeroOrdenDestinatario;
        this.codigoRespuesta = builder.codigoRespuesta;
        this.sucursalDestinatario = builder.sucursalDestinatario;
    }

    public static Builder newAcclACCLEXP4A() {
            return new Builder();
    }

      public static class Builder {
                private String descripcionRespuesta;
                private String titularDestinatario;
                private String numeroOrdenCamara;
                private String numeroOrdenOriginante;
                private String numeroOrdenDestinatario;
                private String codigoRespuesta;
                private String sucursalDestinatario;

            private Builder() {}

            public AcclACCLEXP4A build() {
                return new AcclACCLEXP4A(this);
            }
            public Builder withDescripcionRespuesta(String descripcionRespuesta) {
                this.descripcionRespuesta = descripcionRespuesta;
                return this;
            }
            public Builder withTitularDestinatario(String titularDestinatario) {
                this.titularDestinatario = titularDestinatario;
                return this;
            }
            public Builder withNumeroOrdenCamara(String numeroOrdenCamara) {
                this.numeroOrdenCamara = numeroOrdenCamara;
                return this;
            }
            public Builder withNumeroOrdenOriginante(String numeroOrdenOriginante) {
                this.numeroOrdenOriginante = numeroOrdenOriginante;
                return this;
            }
            public Builder withNumeroOrdenDestinatario(String numeroOrdenDestinatario) {
                this.numeroOrdenDestinatario = numeroOrdenDestinatario;
                return this;
            }
            public Builder withCodigoRespuesta(String codigoRespuesta) {
                this.codigoRespuesta = codigoRespuesta;
                return this;
            }
            public Builder withSucursalDestinatario(String sucursalDestinatario) {
                this.sucursalDestinatario = sucursalDestinatario;
                return this;
            }
      }


}