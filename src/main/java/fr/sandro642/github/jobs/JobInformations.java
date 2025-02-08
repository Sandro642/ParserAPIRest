package fr.sandro642.github.jobs;

public abstract class JobInformations {

    // Protected informations
    protected String name;
    protected String version;
    protected String defaultUrl;
    protected String defaultPort;
    protected String devUrl;
    protected String devPort;

    // Abstract methods
    public abstract void SetName(String name);
    public abstract void SetVersion(String version);
    public abstract void SetDefaultUrl(String defaultUrl);
    public abstract void SetDefaultPort(String defaultPort);
    public abstract void SetDevUrl(String devUrl);
    public abstract void SetDevPort(String devPort);

    // Getters
    public String GetName() {
        return name;
    }

    public String GetVersion() {
        return version;
    }

    public String GetDefaultUrl() {
        return defaultUrl;
    }

    public String GetDefaultPort() {
        return defaultPort;
    }

    public String GetDevUrl() {
        return devUrl;
    }

    public String GetDevPort() {
        return devPort;
    }
}
