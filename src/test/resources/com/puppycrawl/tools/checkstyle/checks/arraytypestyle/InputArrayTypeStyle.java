////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.arraytypestyle;

/* Config: default
 */
public class InputArrayTypeStyle
{
    private int[] javaStyle = new int[0];
    private int cStyle[] = new int[0]; // violation
    private int c[] = new int[0]; // violation

    public static void mainJava(String[] aJavaStyle)
    {
    }

    public static void mainC(String aCStyle[]) // violation
    {
        final int[] blah = new int[0];
        final boolean isOK1 = aCStyle instanceof String[];
        final boolean isOK2 = aCStyle instanceof java.lang.String[];
        final boolean isOK3 = blah instanceof int[];
    }

    public class Test
    {
        public Test[]
            variable;

        public Test[]
            getTests()
        {
            return null;
        }

        public Test[] getNewTest()
        {
            return null;
        }

        public Test getOldTest()[] // violation
        {
            return null;
        }

        public Test getOldTests()[][] // violation
        {
            return null;
        }

        public Test[]
            getMoreTests()[][] // violation
        {
            return null;
        }

        public Test[][] getTests2()
        {
            return null;
        }
    }
    public static void foo(java.util.Collection < ? extends InputArrayTypeStyle[] > collection) {}
}
