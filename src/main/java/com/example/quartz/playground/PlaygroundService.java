package com.example.quartz.playground;

import com.example.quartz.info.TimerInfo;
import com.example.quartz.jobs.HelloWorldJob;
import com.example.quartz.timerservice.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        info.setRemainingFirecount(info.getTotalFireCount());
        info.setRepeatIntervalMS(2000);
        info.setInitialOffsetMS(1000);
        info.setCallbackData("Callback Data Test");

        scheduler.schedule(HelloWorldJob.class, info);
    }

    public Boolean deleteTimer(final String timerId){
        return scheduler.deleteTimer(timerId);
    }

    public List<TimerInfo> getAllRunningTasks(){
        return scheduler.getAllRunningTimers();
    }

    public TimerInfo getRunningTimer(String timerId){
        return scheduler.getRunningTimer(timerId);
    }
}
