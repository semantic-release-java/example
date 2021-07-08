package gg.nils.semanticrelease.example;

import gg.nils.semanticrelease.example.utils.MavenPluginProperties;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Version: " + MavenPluginProperties.getVersion());
    }
}
