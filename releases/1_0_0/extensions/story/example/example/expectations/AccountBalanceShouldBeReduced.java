/*
 * Created on 27-Aug-2004
 * 
 * (c) 2003-2004 ThoughtWorks Ltd
 *
 * See license.txt for license details
 */
package example.expectations;

import com.thoughtworks.jbehave.core.Verify;
import com.thoughtworks.jbehave.extensions.story.domain.Environment;
import com.thoughtworks.jbehave.extensions.story.domain.ExpectationUsingMiniMock;


/** balance = balance - 20 */
public class AccountBalanceShouldBeReduced extends ExpectationUsingMiniMock {

    public void setExpectationIn(Environment environment) {
    }
    
    public void verify(Environment context) {
        Verify.pending();
    }
}