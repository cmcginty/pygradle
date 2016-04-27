/*
 * Copyright 2016 LinkedIn Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linkedin.gradle.python.spec.component.internal;

import com.linkedin.gradle.python.internal.platform.PythonVersion;

import com.linkedin.gradle.python.spec.component.PythonEnvironment;
import java.util.Collection;
import java.util.Map;


public interface PythonEnvironmentContainer {

    void register(String environment);

    void register(Collection<String> environment);

    Map<PythonVersion, PythonEnvironment> getPythonEnvironments();

    PythonEnvironment getPythonEnvironment(String name);

    PythonEnvironment getDefaultPythonEnvironment();

    boolean isEmpty();

    int size();
}
