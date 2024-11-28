package org.example.customer.data;

import org.example.customer.data.filter.CustomerDataHelper;
import org.example.customer.data.model.CustomerData;
import org.example.customer.data.parser.CustomerDataParser;
import org.example.customer.data.parser.CustomerDataParserImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String input = "2343225,2345,us_east,RedTeam,ProjectApple,3445s\n" +
                "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s\n" +
                "3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s\n" +
                "1233456,2345,us_west,BlueTeam,ProjectDate,2221s\n" +
                "3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s";

        CustomerDataParser customerDataParser = new CustomerDataParserImpl();
        List<CustomerData> customerDataList = customerDataParser.parseCustomerrData(input);
        CustomerDataHelper customerDataHelper = new CustomerDataHelper();
        customerDataHelper.filterData(customerDataList);
    }
}