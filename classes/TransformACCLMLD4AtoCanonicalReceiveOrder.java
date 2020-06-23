package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLMLD4A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLMLD4AtoCanonicalReceiveOrder
implements ITransformation<ACCLMLD4A, CanonicalReceiveOrder> {

    private ACCLMLD4A s;

    public TransformACCLMLD4AtoCanonicalReceiveOrder(ACCLMLD4A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLMLD4A into CanonicalReceiveOrder
    * @param s ACCLMLD4A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.receiverClientName(this.s.getTitularDestinatario())//V
				.receiverNumberOrder(this.s.getNumOrdenDestinatario())//V
				.receiverCountryCode(EqACCLMLD4A.codPaisDestinatario(this.s.getCodPaisDestinatario()))//C
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.operationType(EqACCLMLD4A.tipOrden(this.s.getTipOrden()))//C
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getCodRespuesta())//P-C
				.receiverBranchCode(EqACCLMLD4A.codSucursalDestinatario(this.s.getCodSucursalDestinatario()))//C
				.build();

    }


}
