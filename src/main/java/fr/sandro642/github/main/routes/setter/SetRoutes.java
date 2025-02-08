package fr.sandro642.github.main.routes.setter;

import fr.sandro642.github.jobs.JobRoutes;

import java.util.ArrayList;
import java.util.List;

public class SetRoutes extends JobRoutes {

    private SetRoutes setRoutes;

    private final List<JobRoutes> routes = new ArrayList<>();

    public SetRoutes addRoute(SetRoutes.RouteConfigurer configurer) {
        SetRoutes route = new SetRoutes();
        configurer.configure(route);
        routes.add(route);
        return this;
    }

    public SetRoutes then(SetRoutes newRoutes) {
        routes.addAll(newRoutes.routes);
        return this;
    }

    public List<JobRoutes> getRoutes() {
        return routes;
    }

    public interface RouteConfigurer {
        void configure(SetRoutes route);
    }

    public interface RoutesInstruction {
        void SaveRoutes(SetRoutes setRoutes);
    }

    @Override
    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @Override
    public void setRouteBranch(String routeBranch) {
        this.routeBranch = routeBranch;
    }

    @Override
    public void setRouteUrl(String routeUrl) {
        this.routeUrl = routeUrl;
    }

    @Override
    public void setRouteMethod(String routeMethod) {
        this.routeMethod = routeMethod;
    }

    @Override
    public void setRouteDescription(String routeDescription) {
        this.routeDescription = routeDescription;
    }

    @Override
    public void SaveRoutes(SetRoutes setRoutes) {
        this.setRoutes = setRoutes;
    }

}
