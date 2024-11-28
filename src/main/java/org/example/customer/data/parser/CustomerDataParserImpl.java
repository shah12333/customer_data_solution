package org.example.customer.data.parser;

import org.example.customer.data.model.CustomerData;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataParserImpl implements CustomerDataParser {

    @Override
    public List<CustomerData> parseCustomerrData(String input) {
        List<CustomerData> docs = new ArrayList<>();
        String[] splitInput = input.split("\n");
        for (String s : splitInput) {
            String[] field = s.split(",");
            CustomerData customerData = new CustomerData(field[0], field[1], field[2], field[3], field[4], field[5]);
            docs.add(customerData);
        }
        return docs;
    }
}
