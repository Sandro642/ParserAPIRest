package fr.sandro642.github.main.init;

import fr.sandro642.github.jobs.JobInformations;

public class SetInformations extends JobInformations {
    @Override
    public void SetName(String name) {
        this.name = name;
    }

    @Override
    public void SetVersion(String version) {
        this.version = version;
    }

    @Override
    public void SetDefaultUrl(String defaultUrl) {
        this.defaultUrl = defaultUrl;
    }

    @Override
    public void SetDefaultPort(String defaultPort) {
        this.defaultPort = defaultPort;
    }

    @Override
    public void SetDevUrl(String devUrl) {
        this.devUrl = devUrl;
    }

    @Override
    public void SetDevPort(String devPort) {
        this.devPort = devPort;
    }
}
