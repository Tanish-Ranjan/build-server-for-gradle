/*
 * Copyright 2015-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

class ErrorsCreator {

  private void createMethodDoesNotExistError() {
    methodDoesNotExist();
  }

  private void createMissingSemiColonError() {
    createMissingSemiColonError()
  }

  private void createMultiLineError() {
    String str = "
    
        ";
  }
}
