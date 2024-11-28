package org.example.customer.data.filter;

import org.example.customer.data.model.CustomerData;

import java.util.List;
import java.util.Map;

public interface CustomerDataFilter {

    Map<String, Long> countUniqueCustomersByContract(List<CustomerData> customerDataList);
    Map<String, Long> getUniqueCustomersPerContract(List<CustomerData> customerDataList);
    Map<String, Long> countUniqueCustomersByGeoZone(List<CustomerData> customerDataList);

}
