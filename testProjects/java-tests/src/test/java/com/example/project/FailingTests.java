// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license.

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FailingTests {

  @Test
  void failingTest() {
    assertTrue(false);
  }
}
