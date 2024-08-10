module com.okta.developer.modules.bird {

    requires java.annotation;
    requires spring.beans;
    requires spring.context;
    requires spring.data.commons;
    requires spring.data.mongodb;
    requires spring.web;

    exports com.okta.developer.animals.bird;

}