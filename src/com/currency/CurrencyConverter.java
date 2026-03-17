
package com.currency;

import java.net.*;
import java.util.Scanner;
import java.io.*;
import org.json.JSONObject;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base currency (e.g., USD): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g., INR): ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        try {
            String urlStr = "https://api.exchangerate.host/convert?from=" + baseCurrency +
                            "&to=" + targetCurrency + "&amount=" + amount;

            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder responseContent = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    responseContent.append(inputLine);
                }
                in.close();

                JSONObject json = new JSONObject(responseContent.toString());
                if (json.has("result")) {
                    double convertedAmount = json.getDouble("result");
                    System.out.println("✔ Converted amount: " + convertedAmount + " " + targetCurrency);
                } else {
                    System.out.println("✖ Error in response: " + json.toString());
                }
            } else {
                System.out.println("✖ HTTP Error Code: " + responseCode);
            }
        } catch (Exception e) {
            System.out.println("✖ Error: " + e.getMessage());
        }

        scanner.close();
    }
}
