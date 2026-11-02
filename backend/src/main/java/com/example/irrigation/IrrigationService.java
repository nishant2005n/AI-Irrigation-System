
package com.example.irrigation;

import org.springframework.stereotype.Service;

@Service
public class IrrigationService {

    public String checkMoisture(int moisture) {

        if (moisture < 0 || moisture > 100) {
            return "Invalid moisture value.";
        }

        if (moisture < 30) {
            return "Water needed!";
        } else {
            return "No watering needed.";
        }
    }
}
