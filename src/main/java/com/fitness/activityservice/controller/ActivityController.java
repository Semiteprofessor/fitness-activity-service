package com.fitness.activityservice.controller;

import com.fitness.activityservice.dto.ActivitResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @PostMapping
    public ResponseEntity<ActivitResponse> trackActivities(@RequestBody ActivityRequest response) {
        return ResponseEntity.ok(trackActivities())
    }
}
