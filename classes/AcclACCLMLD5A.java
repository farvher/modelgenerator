package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class AcclACCLMLD5A implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @Size(max = 20, min = 1)
    private String numOrdenOriginante;

    @Size(max = 255, min = 1)
    private String errorMensaje;

    @Size(max = 20, min = 1)
    private String numOrdenAch;

    @Size(max = 4, min = 1)
    private String error;


//getters
     public String getNumOrdenOriginante() {
        return numOrdenOriginante;
     }
     public String getErrorMensaje() {
        return errorMensaje;
     }
     public String getNumOrdenAch() {
        return numOrdenAch;
     }
     public String getError() {
        return error;
     }

    private AcclACCLMLD5A(Builder builder){
        this.numOrdenOriginante = builder.numOrdenOriginante;
        this.errorMensaje = builder.errorMensaje;
        this.numOrdenAch = builder.numOrdenAch;
        this.error = builder.error;
    }

    public static Builder newAcclACCLMLD5A() {
            return new Builder();
    }

      public static class Builder {
                private String numOrdenOriginante;
                private String errorMensaje;
                private String numOrdenAch;
                private String error;

            private Builder() {}

            public AcclACCLMLD5A build() {
                return new AcclACCLMLD5A(this);
            }
            public Builder withNumOrdenOriginante(String numOrdenOriginante) {
                this.numOrdenOriginante = numOrdenOriginante;
                return this;
            }
            public Builder withErrorMensaje(String errorMensaje) {
                this.errorMensaje = errorMensaje;
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