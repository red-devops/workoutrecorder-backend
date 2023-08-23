package pl.czerwinski.workoutrecorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import pl.czerwinski.workoutrecorder.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    @Transactional
    void deleteWorkoutById(Long id);
}
