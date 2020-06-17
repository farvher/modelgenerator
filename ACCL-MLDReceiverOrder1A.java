package com.cobiscorp.accl.messagetransformation.bsl.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

public class ACCL-MLDReceiverOrder1A.java implements Serializable{
private static final long serialVersionUID=-3027297081943227365L;

@NotBlank(message = "destino_fondos cannot be null")
private String destino_fondos;

@NotBlank(message = "cod_procedimiento cannot be null") private String cod_procedimiento;

@NotBlank(message = "cuenta_origen cannot be null") private String cuenta_origen;

@NotBlank(message = "cuenta_destino cannot be null") private String cuenta_destino;

@NotBlank(message = "origen_fondos cannot be null") private String origen_fondos;

@NotBlank(message = "titular_originante cannot be null") private String titular_originante;

@NotBlank(message = "cod_sucursal_originante cannot be null") private String cod_sucursal_originante;

@NotBlank(message = "etc cannot be null") private String etc;

@NotBlank(message = "cod_sub_destinatario cannot be null") private String cod_sub_destinatario;

@NotBlank(message = "cod_sub_originante cannot be null") private String cod_sub_originante;

@NotBlank(message = "canal cannot be null") private String canal;

@NotBlank(message = "tip_orden cannot be null") private String tip_orden;

@NotBlank(message = "glosa cannot be null") private String glosa;

@NotBlank(message = "cod_compensador cannot be null") private String cod_compensador;

@NotBlank(message = "cod_pais_originante cannot be null") private String cod_pais_originante;

@NotBlank(message = "titular_destinatario cannot be null") private String titular_destinatario;

@NotBlank(message = "tip_cuenta_destino cannot be null") private String tip_cuenta_destino;

@NotBlank(message = "importe cannot be null") private String importe;

@NotBlank(message = "num_orden_originante cannot be null") private String num_orden_originante;

@NotBlank(message = "ci_nit_originante cannot be null") private String ci_nit_originante;

@NotBlank(message = "cod_destinatario cannot be null") private String cod_destinatario;

@NotBlank(message = "tipo_documento cannot be null") private String tipo_documento;

@NotBlank(message = "cod_moneda cannot be null") private String cod_moneda;

@NotBlank(message = "cod_pais_destinatario cannot be null") private String cod_pais_destinatario;

@NotBlank(message = "tip_cuenta_origen cannot be null") private String tip_cuenta_origen;

@NotBlank(message = "ci_nit_destinatario cannot be null") private String ci_nit_destinatario;

@NotBlank(message = "fec_camara cannot be null") private String fec_camara;


        }