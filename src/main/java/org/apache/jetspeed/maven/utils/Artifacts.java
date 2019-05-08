/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jetspeed.maven.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.artifact.Artifact;

/**
 * @version $Id: Artifacts.java 1052136 2010-12-23 02:06:10Z ate $
 *
 */
public class Artifacts
{
    private Map<String, Artifact> artifactsMap = new HashMap<>();
    
    public Artifacts(List<Artifact> artifacts)
    {
        if (artifacts != null)
        {
            for (Artifact artifact : artifacts) {                
                artifactsMap.put(artifact.getGroupId()+":"+artifact.getArtifactId()+":"+artifact.getType(), artifact);
            }
        }        
    }
    
    public int size()
    {
        return artifactsMap.size();
    }
    
    public Artifact getFirstArtifact()
    {
        return artifactsMap.values().iterator().next();
    }
    
    public Artifact get(String key)
    {
        return artifactsMap.get(key);
    }
}