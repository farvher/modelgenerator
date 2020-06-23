package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCL1A
 *
 * @author Cobiscorp
 */
public class TransformACCL1AtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCL1A> {

    private CanonicalReceiveOrder s;

    public TransformACCL1AtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCL1A
    * @param s CanonicalReceiveOrder
    * @return ACCL1A
    */
	@Override
    public ACCL1A transform() {

		return ACCL1A
				.newACCL1A()
				.withTitularDestinatario(this.s.getReceiverClientName())//V
				.withTipCuentaOrigen(EqACCL1A.originatorAccountType(this.s.getOriginatorAccountType()))//C
				.withCodSubDestinatario(this.s.getSubReceiverCode())//V
				.withTipoDocumento(this.s.getDocumentType())//P
				.withCodProcedimiento(this.s.getProcedureCode())//H
				.withCodSucursalOriginante(EqACCL1A.originatorBranchCode(this.s.getOriginatorBranchCode()))//C
				.withCanal(EqACCL1A.channel(this.s.getChannel()))//C
				.withNumOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withGlosa(this.s.getDescription())//V
				.withCodDestinatario(EqACCL1A.receiverCode(this.s.getReceiverCode()))//C
				.withEtc(this.s.getEtc())//V
				.withCuentaOrigen(this.s.getOriginatorAccountNumber())//V
				.withCiNitDestinatario(this.s.getReceiverIdentificationNumber())//V
				.withCuentaDestino(this.s.getReceiverAccountNumber())//V
				.withImporte(this.s.getAmount().toPlainString())//V
				.withTipCuentaDestino(this.s.getReceiverAccountType())//H
				.withCodPaisDestinatario(EqACCL1A.receiverCountryCode(this.s.getReceiverCountryCode()))//C
				.withTipOrden(this.s.getSentOrderType())//H
				.withOrigenFondos(this.s.getOriginatorFunds())//V
				.withTitularOriginante(this.s.getOriginatorClientName())//V
				.withCodSubOriginante(this.s.getSubOriginatorCode())//V
				.withCodPaisOriginante(EqACCL1A.originatorCountryCode(this.s.getOriginatorCountryCode()))//C
				.withDestinoFondos(this.s.getReceiverFunds())//V
				.withFecCamara(this.s.getHouseDate())//V
				.withCiNitOriginante(this.s.getOriginatorIdentificationNumber())//V
				.withCodMoneda(EqACCL1A.currencyCode(this.s.getCurrencyCode()))//C
				.build();

    }


}
