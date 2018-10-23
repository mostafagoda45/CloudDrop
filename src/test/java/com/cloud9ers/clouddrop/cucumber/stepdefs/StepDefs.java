package com.cloud9ers.clouddrop.cucumber.stepdefs;

import com.cloud9ers.clouddrop.CloudDropApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CloudDropApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
