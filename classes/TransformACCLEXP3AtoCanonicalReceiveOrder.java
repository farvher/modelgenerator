package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCLEXP3A
 *
 * @author Cobiscorp
 */
public class TransformACCLEXP3AtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCLEXP3A> {

    private CanonicalReceiveOrder s;

    public TransformACCLEXP3AtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCLEXP3A
    * @param s CanonicalReceiveOrder
    * @return ACCLEXP3A
    */
	@Override
    public ACCLEXP3A transform() {

		return ACCLEXP3A
				.newACCLEXP3A()
				.withTitularDestinatario(this.s.getReceiverClientName())//V
				.withNumOrdenDestinatario(this.s.getReceiverNumberOrder())//V
				.withCodPaisDestinatario(EqACCLEXP3A.receiverCountryCode(this.s.getReceiverCountryCode()))//C
				.withNumOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withTipOrden(EqACCLEXP3A.operationType(this.s.getOperationType()))//C
				.withNumOrdenAch(this.s.getAchNumberOrder())//V
				.withCodRespuesta(this.s.getResponseCode())//P-C
				.withCodSucursalDestinatario(EqACCLEXP3A.receiverBranchCode(this.s.getReceiverBranchCode()))//C
				.build();

    }


}
