package PractiseAutomation.utils;

//import awesomecucumber.constants.EnvType;

import PractiseAutomation.Constants.EnvTypes;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader(){
        String env = System.getProperty("env",String.valueOf(EnvTypes.STAGE));
        switch (EnvTypes.valueOf(env.toUpperCase())){
            case PROD -> properties = PropertyUtils.propertyLoader("src/test/resources/prod_config.properties");
            case STAGE ->properties = PropertyUtils.propertyLoader("src/test/resources/stage_config.properties");
            default -> throw new IllegalStateException("Invalid Environment type"+env);
        }

    }

    public static ConfigLoader getInstance(){
        if(configLoader == null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl(String testName){
        String prop1 = properties.getProperty("baseURL1");
        String prop2 = properties.getProperty("baseURL2");
        if((prop1 != null)&&(prop2 != null)) {
            if(testName.equals("askomdch")) return prop2;
            else if (testName.equalsIgnoreCase("automationexercise")) {
                return prop1;
            }
            else throw new RuntimeException("property baseUrl is wrong");
        }
        else throw new RuntimeException("property baseUrl is not specified in the stage_config.properties file");
    }
}
