
package com.currency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

//import org.json.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.nextLine();
        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        try {
            String urlStr = "https://api.exchangerate-api.com/v4/latest/" + baseCurrency;
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();

            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

//                ConditionObject json = new ConditionObject();
//                double exchangeRate = ((Object) json).getJSONObject("rates").getDouble(targetCurrency);
//                double convertedAmount = amount * exchangeRate;
//                System.out.println(amount + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);
            } else {
                System.out.println("X Error: Unable to get exchange rates.");
            }
        } catch (Exception e) {
            System.out.println("X Error: " + e.getMessage());
        }

        scanner.close();
    }
}
