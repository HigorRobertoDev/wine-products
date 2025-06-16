package br.com.wine_products.dto.response;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record CustomerRecurrenceStats(
        CustomerPurchasesDetailResponseDTO cliente,
        int contagemRecorrencias,
        BigDecimal valorTotalRecorrencias
) {
}
