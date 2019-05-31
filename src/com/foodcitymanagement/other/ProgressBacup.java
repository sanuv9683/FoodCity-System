/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.other;

import java.io.IOException;

/**
 *
 * @author Sumed
 */
public class ProgressBacup {

    public static int restoreBackup(String path) throws IOException, InterruptedException {
        String[] executeCmd = new String[]{"mysql", "foodcity", "--user=root", "--password=sanu9683", "-e", " source " + path};
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int res = runtimeProcess.waitFor();
        return res;
    }

    public static int writeBackup(String path) throws IOException, InterruptedException {
        Runtime runTime = Runtime.getRuntime();
        Process runtimeProcess = runTime.exec("mysqldump -u" + "root" + " -p" + "sanu9683" + " --database " + "foodcity" + " -r " + path);
        //String executeCmd = "mysqldump -u" + "root" + " -p" + "sanu9683" + " --database " + "foodcity" + " -r " + path;
        int res = runtimeProcess.waitFor();
        return res;
    }
}
