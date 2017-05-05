package dk.dtu.ds.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("CoL")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(dk.dtu.ds.rest.Camps.class);
        resources.add(dk.dtu.ds.rest.Login.class);
        resources.add(dk.dtu.ds.rest.Messages.class);
        resources.add(dk.dtu.ds.rest.Users.class);
    }
    
}
