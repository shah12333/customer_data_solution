package org.example.customer.data.filter;

import org.example.customer.data.model.CustomerData;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerDataHelper {

    public void filterData(List<CustomerData> customerDataList){
        // Number of unique customerId for each contractId
        Map<String, Long> uniqueCustomerPerContract = customerDataList.stream()
                .collect(Collectors.groupingBy(CustomerData::getContractId, Collectors.mapping(CustomerData::getCustomerId, Collectors.toSet())))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> (long) entry.getValue().size()));

        System.out.println("Unique Customer IDs per Contract:");
        uniqueCustomerPerContract.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Number of unique customerId for each geozone
        Map<String, Long> uniqueCustomerPerGeoZone = customerDataList.stream()
                .collect(Collectors.groupingBy(CustomerData::getGeoZone, Collectors.mapping(CustomerData::getCustomerId, Collectors.toSet())))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> (long) entry.getValue().size()));

        System.out.println("\nUnique Customer IDs per GeoZone:");
        uniqueCustomerPerGeoZone.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Average buildDuration for each geozone
        Map<String, Double> averageBuildDurationPerGeoZone = customerDataList.stream()
                .collect(Collectors.groupingBy(CustomerData::getGeoZone,
                        Collectors.averagingDouble(customer -> parseBuildDuration(customer.getBuildDuration()))));

        System.out.println("\nAverage Build Duration per GeoZone:");
        averageBuildDurationPerGeoZone.forEach((key, value) -> System.out.println(key + " -> " + value));

        // List of unique customerId for each geozone
        Map<String, Set<String>> uniqueCustomersListPerGeoZone = customerDataList.stream()
                .collect(Collectors.groupingBy(CustomerData::getGeoZone,
                        Collectors.mapping(CustomerData::getCustomerId, Collectors.toSet())));

        System.out.println("\nUnique Customer IDs List per GeoZone:");
        uniqueCustomersListPerGeoZone.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    private double parseBuildDuration(String buildDuration) {
        try {
            return Double.parseDouble(buildDuration.replaceAll("[^0-9.]", ""));
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
