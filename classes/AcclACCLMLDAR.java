package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class AcclACCLMLDAR implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @NotNull(message = "num_orden_originante cannot be null")
    @NotBlank(message = "num_orden_originante cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenOriginante;

    @NotNull(message = "error_mensaje cannot be null")
    @NotBlank(message = "error_mensaje cannot be blank")
    @Size(max = 255, min = 1)
    private String errorMensaje;

    @NotNull(message = "cod_camara cannot be null")
    @NotBlank(message = "cod_camara cannot be blank")
    @Size(max = 1, min = 1)
    private String codCamara;

    @Size(max = 20, min = 1)
    private String numOrdenAch;

    @NotNull(message = "error cannot be null")
    @NotBlank(message = "error cannot be blank")
    @Size(max = 4, min = 1)
    private String error;


//getters
     public String getNumOrdenOriginante() {
        return numOrdenOriginante;
     }
     public String getErrorMensaje() {
        return errorMensaje;
     }
     public String getCodCamara() {
        return codCamara;
     }
     public String getNumOrdenAch() {
        return numOrdenAch;
     }
     public String getError() {
        return error;
     }

    private AcclACCLMLDAR(Builder builder){
        this.numOrdenOriginante = builder.numOrdenOriginante;
        this.errorMensaje = builder.errorMensaje;
        this.codCamara = builder.codCamara;
        this.numOrdenAch = builder.numOrdenAch;
        this.error = builder.error;
    }

    public static Builder newAcclACCLMLDAR() {
            return new Builder();
    }

      public static class Builder {
                private String numOrdenOriginante;
                private String errorMensaje;
                private String codCamara;
                private String numOrdenAch;
                private String error;

            private Builder() {}

            public AcclACCLMLDAR build() {
                return new AcclACCLMLDAR(this);
            }
            public Builder withNumOrdenOriginante(String numOrdenOriginante) {
                this.numOrdenOriginante = numOrdenOriginante;
                return this;
            }
            public Builder withErrorMensaje(String errorMensaje) {
                this.errorMensaje = errorMensaje;
                return this;
            }
            public Builder withCodCamara(String codCamara) {
                this.codCamara = codCamara;
                return this;
            }
            public Builder withNumOrdenAch(String numOrdenAch) {
                this.numOrdenAch = numOrdenAch;
                return this;
            }
            public Builder withError(String error) {
                this.error = error;
                return this;
            }
      }


}