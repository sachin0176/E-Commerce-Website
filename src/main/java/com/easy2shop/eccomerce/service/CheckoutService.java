package com.easy2shop.eccomerce.service;

import com.easy2shop.eccomerce.dto.PaymentInfo;
import com.easy2shop.eccomerce.dto.Purchase;
import com.easy2shop.eccomerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
