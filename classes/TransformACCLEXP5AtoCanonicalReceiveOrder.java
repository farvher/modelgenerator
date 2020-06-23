package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLEXP5A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLEXP5AtoCanonicalReceiveOrder
implements ITransformation<ACCLEXP5A, CanonicalReceiveOrder> {

    private ACCLEXP5A s;

    public TransformACCLEXP5AtoCanonicalReceiveOrder(ACCLEXP5A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLEXP5A into CanonicalReceiveOrder
    * @param s ACCLEXP5A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.responseDescription(this.s.getCodigoDescripcion())//V
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getCodigo())//P-C
				.build();

    }


}
