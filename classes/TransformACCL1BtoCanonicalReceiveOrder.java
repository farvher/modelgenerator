package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCL1B into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCL1BtoCanonicalReceiveOrder
implements ITransformation<ACCL1B, CanonicalReceiveOrder> {

    private ACCL1B s;

    public TransformACCL1BtoCanonicalReceiveOrder(ACCL1B s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCL1B into CanonicalReceiveOrder
    * @param s ACCL1B
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.responseDescription(this.s.getErrorMensaje())//V
				.houseCode(this.s.getCodCamara())//V
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getError())//P-C
				.build();

    }


}
