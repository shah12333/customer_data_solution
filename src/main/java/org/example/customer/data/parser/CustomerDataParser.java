package org.example.customer.data.parser;

import org.example.customer.data.model.CustomerData;

import java.util.List;

public interface CustomerDataParser {

    List<CustomerData> parseCustomerrData(String input);
}
