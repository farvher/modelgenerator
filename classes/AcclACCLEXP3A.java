package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class AcclACCLEXP3A implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @NotNull(message = "num_orden_originante cannot be null")
    @NotBlank(message = "num_orden_originante cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenOriginante;

    @NotNull(message = "num_orden_destinatario cannot be null")
    @NotBlank(message = "num_orden_destinatario cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenDestinatario;

    @NotNull(message = "tip_orden cannot be null")
    @NotBlank(message = "tip_orden cannot be blank")
    @Size(max = 3, min = 1)
    private String tipOrden;

    @NotNull(message = "cod_pais_destinatario cannot be null")
    @NotBlank(message = "cod_pais_destinatario cannot be blank")
    @Size(max = 4, min = 1)
    private String codPaisDestinatario;

    @NotNull(message = "num_orden_ach cannot be null")
    @NotBlank(message = "num_orden_ach cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenAch;

    @NotNull(message = "titular_destinatario cannot be null")
    @NotBlank(message = "titular_destinatario cannot be blank")
    @Size(max = 80, min = 1)
    private String titularDestinatario;

    @NotNull(message = "cod_respuesta cannot be null")
    @NotBlank(message = "cod_respuesta cannot be blank")
    @Size(max = 4, min = 1)
    private String codRespuesta;

    @NotNull(message = "cod_sucursal_destinatario cannot be null")
    @NotBlank(message = "cod_sucursal_destinatario cannot be blank")
    @Size(max = 10, min = 1)
    private String codSucursalDestinatario;


//getters
     public String getNumOrdenOriginante() {
        return numOrdenOriginante;
     }
     public String getNumOrdenDestinatario() {
        return numOrdenDestinatario;
     }
     public String getTipOrden() {
        return tipOrden;
     }
     public String getCodPaisDestinatario() {
        return codPaisDestinatario;
     }
     public String getNumOrdenAch() {
        return numOrdenAch;
     }
     public String getTitularDestinatario() {
        return titularDestinatario;
     }
     public String getCodRespuesta() {
        return codRespuesta;
     }
     public String getCodSucursalDestinatario() {
        return codSucursalDestinatario;
     }

    private AcclACCLEXP3A(Builder builder){
        this.numOrdenOriginante = builder.numOrdenOriginante;
        this.numOrdenDestinatario = builder.numOrdenDestinatario;
        this.tipOrden = builder.tipOrden;
        this.codPaisDestinatario = builder.codPaisDestinatario;
        this.numOrdenAch = builder.numOrdenAch;
        this.titularDestinatario = builder.titularDestinatario;
        this.codRespuesta = builder.codRespuesta;
        this.codSucursalDestinatario = builder.codSucursalDestinatario;
    }

    public static Builder newAcclACCLEXP3A() {
            return new Builder();
    }

      public static class Builder {
                private String numOrdenOriginante;
                private String numOrdenDestinatario;
                private String tipOrden;
                private String codPaisDestinatario;
                private String numOrdenAch;
                private String titularDestinatario;
                private String codRespuesta;
                private String codSucursalDestinatario;

            private Builder() {}

            public AcclACCLEXP3A build() {
                return new AcclACCLEXP3A(this);
            }
            public Builder withNumOrdenOriginante(String numOrdenOriginante) {
                this.numOrdenOriginante = numOrdenOriginante;
                return this;
            }
            public Builder withNumOrdenDestinatario(String numOrdenDestinatario) {
                this.numOrdenDestinatario = numOrdenDestinatario;
                return this;
            }
            public Builder withTipOrden(String tipOrden) {
                this.tipOrden = tipOrden;
                return this;
            }
            public Builder withCodPaisDestinatario(String codPaisDestinatario) {
                this.codPaisDestinatario = codPaisDestinatario;
                return this;
            }
            public Builder withNumOrdenAch(String numOrdenAch) {
                this.numOrdenAch = numOrdenAch;
                return this;
            }
            public Builder withTitularDestinatario(String titularDestinatario) {
                this.titularDestinatario = titularDestinatario;
                return this;
            }
            public Builder withCodRespuesta(String codRespuesta) {
                this.codRespuesta = codRespuesta;
                return this;
            }
            public Builder withCodSucursalDestinatario(String codSucursalDestinatario) {
                this.codSucursalDestinatario = codSucursalDestinatario;
                return this;
            }
      }


}