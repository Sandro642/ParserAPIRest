package fr.sandro642.github.main.routes.getter;

import fr.sandro642.github.jobs.JobRoutes;

public abstract class GetRoutes extends JobRoutes {

    public String getRouteName() {
        return this.routeName;
    }

    public String getRouteBranch() {
        return this.routeBranch;
    }

    public String getRouteUrl() {
        return this.routeUrl;
    }

    public String getRouteMethod() {
        return this.routeMethod;
    }

    public String getRouteDescription() {
        return this.routeDescription;
    }

    // Test instance
    public void testInstance() {
        System.out.println("Instance of GetRoutes");

        System.out.println("Route Name: " + getRouteName());
        System.out.println("Route Branch: " + getRouteBranch());
        System.out.println("Route URL: " + getRouteUrl());
        System.out.println("Route Method: " + getRouteMethod());
        System.out.println("Route Description: " + getRouteDescription());
    }
}
