package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLEXP4A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLEXP4AtoCanonicalReceiveOrder
implements ITransformation<ACCLEXP4A, CanonicalReceiveOrder> {

    private ACCLEXP4A s;

    public TransformACCLEXP4AtoCanonicalReceiveOrder(ACCLEXP4A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLEXP4A into CanonicalReceiveOrder
    * @param s ACCLEXP4A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.receiverClientName(this.s.getTitularDestinatario())//V
				.receiverNumberOrder(this.s.getNumeroOrdenDestinatario())//V
				.responseDescription(this.s.getDescripcionRespuesta())//V
				.originatorNumberOrder(this.s.getNumeroOrdenOriginante())//V
				.achNumberOrder(this.s.getNumeroOrdenCamara())//V
				.receiverBranchCode(EqACCLEXP4A.sucursalDestinatario(this.s.getSucursalDestinatario()))//C
				.responseCode(this.s.getCodigoRespuesta())//P-C
				.build();

    }


}
