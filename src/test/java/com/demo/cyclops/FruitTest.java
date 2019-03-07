package com.demo.cyclops;


import static org.assertj.core.api.Assertions.assertThat;

import cyclops.control.Option;
import org.junit.jupiter.api.Test;

public class FruitTest {

  @Test
  public void test_some_from_not_null() {
    Orange a = new Orange();
    Option<Orange> b = Option.some(a);
    assertThat(b.isPresent()).isTrue();
  }
}