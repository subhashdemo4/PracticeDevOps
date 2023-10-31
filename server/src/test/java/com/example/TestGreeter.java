package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;
     int totalNumberOfApplicants = 123;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

   @Test
  public void greeted() {
    String someone = "Wor";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }




     
    // @Before
    // public void setData(){
    //     this.totalNumberOfApplicants = 9;
    // }
     
    @Test
    public void testAssertThatEqual() {
        assertThat("123",is("123"));
    }
     
    @Test
    public void testAssertThatNotEqual() {
        assertThat(totalNumberOfApplicants,is(123));
    }
     
    // @Test
    // public void testAssertThatObject() {
    //     assertThat("123",isA(String.class));
    // }
     
    @Test
    public void testAssertThatWMessage(){
        assertThat("They are not equal!","123",is("123"));
    }

   
}
