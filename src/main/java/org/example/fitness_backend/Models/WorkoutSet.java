package org.example.fitness_backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="workout_set")
public class WorkoutSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_set_id")
    private Workout workouts;

    @Column(nullable = false)
    private long setCount;

    @Column(nullable = false)
    private long reps;

    @Column(nullable = false)
    private long weight;

    @OneToMany
    @JoinColumn(name = "exercise_id")
    private List<Exercise> exercises;
}
