package fr.sandro642.github.docs;

import fr.sandro642.github.main.routes.setter.SetRoutes;

public class UseSetRoutes {
    public static SetRoutes setRoutes = new SetRoutes()
            .addRoute(route -> {
                route.setRouteName("Add money");
                route.setRouteBranch("v1");
                route.setRouteUrl("money/add/money");
                route.setRouteMethod("POST");
                route.setRouteDescription("Ajouter de l'argent à un compte");
            })
            .addRoute(route -> {
                route.setRouteName("Get money");
                route.setRouteBranch("v2");
                route.setRouteUrl("money/get/money");
                route.setRouteMethod("GET");
                route.setRouteDescription("Récupérer l'argent d'un compte");
            });

    public SetRoutes.RoutesInstruction saveRoutes = setRoutes::SaveRoutes;
}
