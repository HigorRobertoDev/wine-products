package br.com.wine_products.clients;

import br.com.wine_products.clients.dto.CustomerPurchasesDTO;
import br.com.wine_products.clients.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "api-products-client", url = "${spring.api-products-client.url}")
public interface ProductsClient {

    @GetMapping("/produtos-mnboX5IPl6VgG390FECTKqHsD9SkLS.json")
    List<ProductDTO> getProducts();

    @GetMapping("/clientes-Vz1U6aR3GTsjb3W8BRJhcNKmA81pVh.json")
    List<CustomerPurchasesDTO> getCustumerPurchases();

}