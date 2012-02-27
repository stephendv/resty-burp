/*******************************************************************************
 * BDD-Security, application security testing framework
 * 
 * Copyright (C) `2012 Stephen de Vries`
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see `<http://www.gnu.org/licenses/>`.
 ******************************************************************************/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.continuumsecurity.restyburp;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import net.continuumsecurity.restyburp.model.HttpRequestResponseBean;
import net.continuumsecurity.restyburp.model.ScanIssueBean;

/**
 *
 * @author stephen
 */
public interface IBurpService {
    int scan(String target) throws MalformedURLException;   
    //0-100%
    int getPercentageComplete(int scanId);   
    List<ScanIssueBean> getIssues(int scanId); 
    List<HttpRequestResponseBean> getProxyHistory();
    List<HttpRequestResponseBean> getProxyHistory(String url) throws Exception;
    void reset() throws Exception;
    Map<String,String> getConfig();
    void setConfig(Map<String,String> newConfig);
    void updateConfig(Map<String,String> newConfig);
    void saveConfig(String filename);
    void loadConfig(String filename);
}
