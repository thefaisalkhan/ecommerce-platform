package com.faisal.ecommerce.api_gateway;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/discovery")
public class ApiGatewayDiscoveryController {

  private final DiscoveryClient discoveryClient;

  public ApiGatewayDiscoveryController(DiscoveryClient discoveryClient) {
    this.discoveryClient = discoveryClient;
  }

  @GetMapping("/services")
  public List<String> services() {
    return discoveryClient.getServices();
  }

  @GetMapping("/instances")
  public Map<String, List<ServiceInstance>> instances() {
    Map<String, List<ServiceInstance>> instancesByService = new HashMap<>();
    for (String service : discoveryClient.getServices()) {
      instancesByService.put(service, discoveryClient.getInstances(service));
    }
    return instancesByService;
  }
}
