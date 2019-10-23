package xyz.staffjoy.faraday.core.balancer;

import java.util.List;

/**
 * 负载均衡实现(k8s支持，实际未启用)
 */
public interface LoadBalancer {
    String chooseDestination(List<String> destnations);
}
