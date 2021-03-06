/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.api.exceptions;

/**
 * Exception that is thrown when a Service Endpoint cannot be found for the user specified Region
 * 
 * @author Jeremy Unruh
 *
 */
public class RegionEndpointNotFoundException extends OS4JException {

    private static final long serialVersionUID = 1L;
    private static final String EXCEPT_FORMAT = "Endpoint for '%s' service could not be found for region: '%s'";
    
    public RegionEndpointNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegionEndpointNotFoundException(String message) {
        super(message);
    }

    public static RegionEndpointNotFoundException create(String region, String serviceName) {
        return new RegionEndpointNotFoundException(String.format(EXCEPT_FORMAT, serviceName, region));
    }
    
}
