package fr.sandro642.github.main.lib;

import fr.sandro642.github.jobs.JobInformations;

public abstract class GetInformations extends JobInformations {

    public String GetName() {
        return this.name;
    }

    public String GetVersion() {
        return this.version;
    }

    public String GetDefaultUrl() {
        return this.defaultUrl;
    }

    public String GetDefaultPort() {
        return this.defaultPort;
    }

    public String GetDevUrl() {
        return this.devUrl;
    }

    public String GetDevPort() {
        return this.devPort;
    }

    // Test instance
    public void testInstance() {
        System.out.println("Instance of GetInformations");

        System.out.println("Name: " + GetName());
        System.out.println("Version: " + GetVersion());
        System.out.println("Default URL: " + GetDefaultUrl());
        System.out.println("Default Port: " + GetDefaultPort());
        System.out.println("Dev URL: " + GetDevUrl());
        System.out.println("Dev Port: " + GetDevPort());
    }

}
