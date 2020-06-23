package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCL2A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCL2AtoCanonicalReceiveOrder
implements ITransformation<ACCL2A, CanonicalReceiveOrder> {

    private ACCL2A s;

    public TransformACCL2AtoCanonicalReceiveOrder(ACCL2A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCL2A into CanonicalReceiveOrder
    * @param s ACCL2A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.receiverClientName(this.s.getTitularDestinatario())//V
				.originatorAccountType(EqACCL2A.tipCuentaOrigen(this.s.getTipCuentaOrigen()))//C
				.serviceCode(this.s.getCodServicio())//V
				.subReceiverCode(this.s.getCodSubDestinatario())//V
				.documentType(this.s.getTipoDocumento())//P
				.procedureCode(this.s.getCodProcedimiento())//H
				.originatorBranchCode(EqACCL2A.codSucursalOriginante(this.s.getCodSucursalOriginante()))//C
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.description(this.s.getGlosa())//V
				.receiverCode(EqACCL2A.codDestinatario(this.s.getCodDestinatario()))//C
				.etc(this.s.getEtc())//V
				.originatorAccountNumber(this.s.getCuentaOrigen())//V
				.receiverIdentificationNumber(this.s.getCiNitDestinatario())//V
				.receiverAccountNumber(this.s.getCuentaDestino())//V
				.amount(new java.math.BigDecimal(this.s.getImporte()))//V
				.receiverAccountType(this.s.getTipCuentaDestino())//H
				.receiverCountryCode(EqACCL2A.codPaisDestinatario(this.s.getCodPaisDestinatario()))//C
				.originatorCode(EqACCL2A.codOriginante(this.s.getCodOriginante()))//C
				.sentOrderType(this.s.getTipOrden())//H
				.originatorFunds(this.s.getOrigenFondos())//V
				.originatorClientName(this.s.getTitularOriginante())//V
				.subOriginatorCode(this.s.getCodSubOriginante())//V
				.houseCode(this.s.getCodCamara())//V
				.originatorCountryCode(EqACCL2A.codPaisOriginante(this.s.getCodPaisOriginante()))//C
				.receiverFunds(this.s.getDestinoFondos())//V
				.houseDate(this.s.getFecCamara())//V
				.receiverChannel(this.s.getCanal())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.originatorIdentificationNumber(this.s.getCiNitOriginante())//V
				.currencyCode(EqACCL2A.codMoneda(this.s.getCodMoneda()))//C
				.build();

    }


}
