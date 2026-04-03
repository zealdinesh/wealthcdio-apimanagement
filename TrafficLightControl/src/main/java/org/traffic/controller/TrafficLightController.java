package org.traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.traffic.model.SignalSequence;
import org.traffic.model.TrafficLightHistory;
import org.traffic.service.TrafficLightService;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TrafficLightController {
    @Autowired
    private TrafficLightService service;

    @GetMapping("/status")
    public ResponseEntity<?> status() {
        return ResponseEntity.ok(service.getStatus());
    }

    @PostMapping("/sequence")
    public ResponseEntity<?> setSequence(@RequestBody SignalSequence req) {
        service.setSequence(req);
        return ResponseEntity.ok("Sequence updated");
    }

    @GetMapping("/pause")
    public ResponseEntity<?> pause() {
        service.pause();
        return ResponseEntity.ok("Paused");
    }

    @GetMapping("/resume")
    public ResponseEntity<?> resume() {
        service.resume();
        return ResponseEntity.ok("Resumed");
    }

    @GetMapping("/history")
    public List<TrafficLightHistory> getHistory() {
        return service.getTimingHistory();
    }
}
//http://localhost:8081/swagger-ui.html