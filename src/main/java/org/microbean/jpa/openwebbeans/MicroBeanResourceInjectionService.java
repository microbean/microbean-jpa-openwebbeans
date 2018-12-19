/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil; coding: utf-8-unix -*-
 *
 * Copyright © 2018 microBean.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.microbean.jpa.openwebbeans;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.lang.annotation.Annotation;

import javax.enterprise.inject.spi.Bean;

import org.apache.webbeans.config.WebBeansContext;

import org.apache.webbeans.spi.ResourceInjectionService;

import org.apache.webbeans.spi.api.ResourceReference;

import org.apache.webbeans.resource.spi.se.StandaloneResourceInjectionService;

public class MicroBeanResourceInjectionService implements ResourceInjectionService {

  public MicroBeanResourceInjectionService(final WebBeansContext context) {
    super();
    System.out.println("*** hello!");
  }

  @Override
  public void clear() {

  }

  @Override
  public <X, T extends Annotation> X getResourceReference(final ResourceReference<X, T> resourceReference) {
    X returnValue = null;
    if (resourceReference != null) {
      final Class<X> resourceType = resourceReference.getResourceType();
      assert resourceType != null;
      System.out.println("*** resource type: " + resourceType);
    }
    return returnValue;
  }

  @Override
  public void injectJavaEEResources(final Object managedBeanInstance) {
    if (managedBeanInstance != null) {

    }
  }
  
  @Override
  public <T> void writeExternal(final Bean<T> bean, final T actualResource, final ObjectOutput out) throws IOException {
    
  }

  @Override
  public <T> T readExternal(final Bean<T> bean, final ObjectInput out) throws IOException, ClassNotFoundException {
    throw new UnsupportedOperationException("Not sure yet how to implement");
  }

  
}
