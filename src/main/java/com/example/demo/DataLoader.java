package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    MessageRepository repository;

    @Override
    public void run(String ... strings) throws Exception{
        Message message;
        message = new Message("My First Message", "Tariq Bhatti", "October 28, 2019");
        repository.save(message);

        message = new Message("October has 31 days", "Janet", "March 10, 1999");
        repository.save(message);

        message = new Message("Montgomery College is great", "Frank Tineda", "June 30, 2008");
        repository.save(message);
    }
}
