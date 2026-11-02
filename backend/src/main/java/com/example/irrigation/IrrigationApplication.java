
package com.example.irrigation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IrrigationApplication {

    private final IrrigationService irrigationService;

    public IrrigationApplication(IrrigationService irrigationService) {
        this.irrigationService = irrigationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(IrrigationApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "AI Irrigation System is running!";
    }

    @GetMapping("/moisture")
    public String checkMoisture(@RequestParam int value) {
        return irrigationService.checkMoisture(value);
    }
}
