package com.transitAlarm.transitAlarm.transit.test_data;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Arrays;

public class TestData {

    @Profile("local")
    @Component
    @RequiredArgsConstructor
    public class TestMemberData {

        private final InitMemberService initMemberService;

        @PostConstruct
        public void init() {
            initMemberService.init();
        }


        @Component
        @RequiredArgsConstructor
        static class InitMemberService {
            @PersistenceContext
            private EntityManager em;


            @Transactional
            public void init() {


            }
        }
    }


}
