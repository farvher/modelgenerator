package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCL3A
 *
 * @author Cobiscorp
 */
public class TransformACCL3AtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCL3A> {

    private CanonicalReceiveOrder s;

    public TransformACCL3AtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCL3A
    * @param s CanonicalReceiveOrder
    * @return ACCL3A
    */
	@Override
    public ACCL3A transform() {

		return ACCL3A
				.newACCL3A()
				.withTitularDestinatario(this.s.getReceiverClientName())//V
				.withNumOrdenDestinatario(this.s.getReceiverNumberOrder())//V
				.withCodPaisDestinatario(EqACCL3A.receiverCountryCode(this.s.getReceiverCountryCode()))//C
				.withNumOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withTipOrden(EqACCL3A.operationType(this.s.getOperationType()))//C
				.withNumOrdenAch(this.s.getAchNumberOrder())//V
				.withCodRespuesta(this.s.getResponseCode())//P-C
				.withCodSucursalDestinatario(EqACCL3A.receiverBranchCode(this.s.getReceiverBranchCode()))//C
				.build();

    }


}
