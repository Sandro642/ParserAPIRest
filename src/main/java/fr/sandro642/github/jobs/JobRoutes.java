package fr.sandro642.github.jobs;

import fr.sandro642.github.main.routes.setter.SetRoutes;

public abstract class JobRoutes {

    protected String routeName;
    protected String routeBranch;
    protected String routeUrl;
    protected String routeMethod;
    protected String routeDescription;

    public abstract void setRouteName(String routeName);
    public abstract void setRouteBranch(String routeBranch);
    public abstract void setRouteUrl(String routeUrl);
    public abstract void setRouteMethod(String routeMethod);
    public abstract void setRouteDescription(String routeDescription);
    public abstract void SaveRoutes(SetRoutes setRoutes);

    public String getRouteName() {
        return routeName;
    }

    public String getRouteBranch() {
        return routeBranch;
    }

    public String getRouteUrl() {
        return routeUrl;
    }

    public String getRouteMethod() {
        return routeMethod;
    }

    public String getRouteDescription() {
        return routeDescription;
    }
}
