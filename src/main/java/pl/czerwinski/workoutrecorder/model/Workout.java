package pl.czerwinski.workoutrecorder.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "workout")
public class Workout implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name= "date")
    private LocalDate date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Column(name = "time")
    private Time time;

    @Column(name = "distance")
    private Double distance;

    @Column(name = "calories")
    private int calories;

    @Column(name = "comments")
    private String comments;

    public Workout(){}

    public Workout(Long id, LocalDate date, Double distance, Time time, int calories, String comments) {
        this.id = id;
        this.date = date;
        this.distance = distance;
        this.time = time;
        this.calories = calories;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", date=" + date +
                ", distance=" + distance +
                ", time='" + time + '\'' +
                ", calories='" + calories + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
