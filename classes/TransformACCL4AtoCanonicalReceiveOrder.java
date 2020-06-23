package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCL4A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCL4AtoCanonicalReceiveOrder
implements ITransformation<ACCL4A, CanonicalReceiveOrder> {

    private ACCL4A s;

    public TransformACCL4AtoCanonicalReceiveOrder(ACCL4A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCL4A into CanonicalReceiveOrder
    * @param s ACCL4A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.receiverClientName(this.s.getTitularDestinatario())//V
				.receiverNumberOrder(this.s.getNumOrdenDestinatario())//V
				.receiverCountryCode(EqACCL4A.codPaisDestinatario(this.s.getCodPaisDestinatario()))//C
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.operationType(EqACCL4A.tipOrden(this.s.getTipOrden()))//C
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getCodRespuesta())//P-C
				.receiverBranchCode(EqACCL4A.codSucursalDestinatario(this.s.getCodSucursalDestinatario()))//C
				.build();

    }


}
