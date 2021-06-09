package com.example.quartz.playground;

import com.example.quartz.info.TimerInfo;
import com.example.quartz.jobs.HelloWorldJob;
import com.example.quartz.timerservice.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaygroundService {
    private final SchedulerService scheduler;

    @Autowired
    public PlaygroundService(final SchedulerService scheduler){
        this.scheduler = scheduler;
    }

    public void runHelloWorldJob(){
        final TimerInfo info = new TimerInfo();
        info.setTotalFireCount(5);
        info.setRepeatIntervalMS(2000);
        info.setInitialOffsetMS(1000);
        info.setCallbackData("Callback Data Test");

        scheduler.schedule(HelloWorldJob.class, info);
    }
}
