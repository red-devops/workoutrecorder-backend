package pl.czerwinski.workoutrecorder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.czerwinski.workoutrecorder.model.Workout;
import pl.czerwinski.workoutrecorder.service.WorkoutService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
    private final WorkoutService workoutService;

    public WorkoutController (WorkoutService workoutService){
        this.workoutService = workoutService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Workout>> getAllWorkout () {
        List<Workout> workouts = workoutService.findAllWorkout();
        return new ResponseEntity<>(workouts, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Workout> addWorkout (@RequestBody Workout workout) {
        Workout newWorkout = workoutService.addWorkout(workout);
        return new ResponseEntity<>(newWorkout, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Workout> updateWorkout (@RequestBody Workout workout) {
        Workout updateWorkout = workoutService.updateWorkout(workout);
        return new ResponseEntity<>(updateWorkout, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Workout> deleteWorkout (@PathVariable("id") Long id){
        workoutService.deleteWorkout(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
