package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCL5A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCL5AtoCanonicalReceiveOrder
implements ITransformation<ACCL5A, CanonicalReceiveOrder> {

    private ACCL5A s;

    public TransformACCL5AtoCanonicalReceiveOrder(ACCL5A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCL5A into CanonicalReceiveOrder
    * @param s ACCL5A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.responseDescription(this.s.getErrorMensaje())//V
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getError())//P-C
				.build();

    }


}
