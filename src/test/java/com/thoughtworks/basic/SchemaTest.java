package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchemaTest {
    @Test
    public void should_return_type_when_given_flag_l(){
        FlagSchema flagSchema = new FlagSchema("l",Boolean.TYPE);
        Set<FlagSchema> flagsSchema =  new HashSet<FlagSchema>();
        flagsSchema.add(flagSchema);
        Schema schema = new Schema(flagsSchema);

        String flag = "l";
        System.out.println(schema.getTypeOf(flag));

        Assert.assertEquals(schema.getTypeOf(flag),Boolean.TYPE);
    }

    @Test
    public void should_return_string_list_when_scan_given_string(){
        String argsText = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsText);
        List<String> keyValues = args.scan();
        keyValues.forEach(keyValue -> System.out.println(keyValue));

        Assert.assertEquals(3,keyValues.size());
        Assert.assertTrue(keyValues.contains("l true"));
    }

    @Test
    public void should_return_string_list_when_scan_given_keyvaluePair(){
        String argsText = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsText);
        List<KeyValuePair> keyValuePairs = args.scan2();

        Assert.assertEquals(3,keyValuePairs.size());
        Assert.assertTrue(keyValuePairs.contains(new KeyValuePair("l","true")));
        Assert.assertTrue(keyValuePairs.contains(new KeyValuePair("p","8080")));
        Assert.assertTrue(keyValuePairs.contains(new KeyValuePair("d","usr/logs")));    }
}
