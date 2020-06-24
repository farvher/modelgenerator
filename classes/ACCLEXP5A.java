package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 *
 * @author Cobiscorp
 */
public class ACCLEXP5A implements Serializable{

    private static final long serialVersionUID = 312312412312312312L;

    @Size(max = 20, min = 1)
    private String numOrdenAch;

    @NotNull(message = "numOrdenOriginante cannot be null")
    @NotBlank(message = "numOrdenOriginante cannot be blank")
    @Size(max = 20, min = 1)
    private String numOrdenOriginante;

    @NotNull(message = "codigo cannot be null")
    @NotBlank(message = "codigo cannot be blank")
    @Size(max = 4, min = 1)
    private String codigo;

    @Size(max = 255, min = 1)
    private String codigoDescripcion;


//getters
     public String getNumOrdenAch() {
        return numOrdenAch;
     }
     public String getNumOrdenOriginante() {
        return numOrdenOriginante;
     }
     public String getCodigo() {
        return codigo;
     }
     public String getCodigoDescripcion() {
        return codigoDescripcion;
     }

    private ACCLEXP5A(Builder builder){
        this.numOrdenAch = builder.numOrdenAch;
        this.numOrdenOriginante = builder.numOrdenOriginante;
        this.codigo = builder.codigo;
        this.codigoDescripcion = builder.codigoDescripcion;
    }

    public static Builder newACCLEXP5A() {
            return new Builder();
    }

      public static class Builder {
                private String numOrdenAch;
                private String numOrdenOriginante;
                private String codigo;
                private String codigoDescripcion;

            private Builder() {}

            public ACCLEXP5A build() {
                return new ACCLEXP5A(this);
            }
            public Builder withNumOrdenAch(String numOrdenAch) {
                this.numOrdenAch = numOrdenAch;
                return this;
            }
            public Builder withNumOrdenOriginante(String numOrdenOriginante) {
                this.numOrdenOriginante = numOrdenOriginante;
                return this;
            }
            public Builder withCodigo(String codigo) {
                this.codigo = codigo;
                return this;
            }
            public Builder withCodigoDescripcion(String codigoDescripcion) {
                this.codigoDescripcion = codigoDescripcion;
                return this;
            }
      }


}