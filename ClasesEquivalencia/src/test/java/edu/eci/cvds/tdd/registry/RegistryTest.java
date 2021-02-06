package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResultValid() {

        Person person = new Person("JP espinosa", 2161336, 19, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateRegistryResultUnderAge() {

        Person person = new Person("Sara", 2161337, 12, Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateRegistryResultInvalidAge() {

        Person person = new Person("Matilde", 2161338, 150, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateRegistryResultDead() {

        Person person = new Person("Ricardo", 2161335, 20, Gender.UNIDENTIFIED,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateRegistryResultDuplicate() {
    	Person person1 = new Person("Ricardo", 2161335, 20, Gender.UNIDENTIFIED,false);
    	Person person = new Person("Ricardo", 2161335, 20, Gender.UNIDENTIFIED,false);
    	registry.registerVoter(person1);
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED,result);
    }
    

    // TODO Complete with more test cases
}