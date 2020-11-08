package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {
    AnimalsCage animalsCage;

    private Long nanoTime = System.nanoTime();


    public Long getTime() {
        return nanoTime;
    }



}
