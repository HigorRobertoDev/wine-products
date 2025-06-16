package br.com.wine_products.clients.dto;

import java.util.List;

public record CustomerPurchasesDTO(
        String nome,
        String cpf,
        List<PurchasesDTO> compras
) {
}
