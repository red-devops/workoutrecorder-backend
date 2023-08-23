package pl.czerwinski.workoutrecorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.czerwinski.workoutrecorder.model.Workout;
import pl.czerwinski.workoutrecorder.repository.WorkoutRepository;

import java.util.List;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout addWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> findAllWorkout(){
        return workoutRepository.findAll();
    }

    public Workout updateWorkout(Workout workout){
        return workoutRepository.save(workout);
    }

    public void deleteWorkout(Long id){
        workoutRepository.deleteWorkoutById(id);
    }
}
