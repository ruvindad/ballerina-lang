/*
 *  Copyright (c) 2019 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.ballerinalang.stdlib.task.listener.api;

import org.ballerinalang.stdlib.task.SchedulingException;

/**
 * Task listener server connector.
 */
public interface TaskServerConnector {
    /**
     * Start the server connector, which actually start the task.
     *
     * @throws SchedulingException if error occurred while starting the Task server connector.
     */
    void start() throws SchedulingException;

    /**
     * Stop the server connector which actually stops the task.
     *
     * @return returns whether the process is successful or not.
     * @throws SchedulingException if error occurred while stopping the Task server connector.
     */
    boolean stop() throws SchedulingException;
}
