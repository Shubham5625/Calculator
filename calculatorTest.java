package com.example.shubham.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Shubham on 21-09-2016.
 */
public class calculatorTest
    {
        calculator cal;
    @Before
    public void setUp() throws Exception
    {
        cal = new calculator();
    }

    @Test
        //test Identifier 1.1.1
        //test Description Add 20+10
        //Method of execution
        //Test Data 20,10
        //Expected Output 30
        //Generated Output 30 Passed
        // Action: Report test case failed
    public void addition_1() throws Exception
    {
        //1. Arrange
        double i = 20;
        double j = 10;

        //2. Act
        double result = cal.addition(i,j);

        //3. Assert
        assertEquals(30, result,0);
    }
        
        @Test
        //test Identifier 1.1.2
        //test Description Add 30+10
        //Method of execution
        //Test Data 30,10
        //Expected Output 40
        //Generated Output 40 Passed
        // Action: Report test case failed
        public void addition_2() throws Exception
        {
            //1. Arrange
            double i = 30;
            double j = 10;

            //2. Act
            double result = cal.addition(i,j);

            //3. Assert
            assertEquals(40, result,0);
        }
        
        
        @Test
        //test Identifier 1.1.3
        //test Description Add 40+10
        //Method of execution
        //Test Data 40,10
        //Expected Output 50
        //Generated Output 50 Passed
        // Action: Report test case failed
        public void addition_3() throws Exception
        {
            //1. Arrange
            double i = 40;
            double j = 10;

            //2. Act
            double result = cal.addition(i,j);

            //3. Assert
            assertEquals(50, result,0);
        }
        
        
        @Test
        //test Identifier 1.1.4
        //test Description Add 50+10
        //Method of execution
        //Test Data 50,10
        //Expected Output 60
        //Generated Output 60 Passed
        // Action: Report test case failed

        public void addition_4() throws Exception
        {
            //1. Arrange
            double i = 50;
            double j = 10;

            //2. Act
            double result = cal.addition(i,j);

            //3. Assert
            assertEquals(60, result,0);
        }
        
        
        @Test
        //test Identifier 1.1.5
        //test Description Add 60+10
        //Method of execution
        //Test Data 60,10
        //Expected Output 70
        //Generated Output 70 Passed
        // Action: Report test case failed

        public void addition_5() throws Exception
        {
            //1. Arrange
            double i = 60;
            double j = 10;

            //2. Act
            double result = cal.addition(i,j);

            //3. Assert
            assertEquals(70, result,0);
        }

        
         @Test
        //test Identifier 1.2.1
        //test Description Add 20-10
        //Method of execution
        //Test Data 20,10
        //Expected Output 10
        //Generated Output 10 Passed
        // Action: Report test case failed
        public void subtraction_1() throws Exception
        {
            //1. Arrange
            double i = 20;
            double j = 10;
    
            //2. Act
            double result = cal.subtraction(i,j);
    
            //3. Assert
            assertEquals(10, result,0);
        }
        
        
        @Test
        //test Identifier 1.2.2
        //test Description Add 30-10
        //Method of execution
        //Test Data 30,10
        //Expected Output 20
        //Generated Output 20 Passed
        // Action: Report test case failed
        public void subtraction_2() throws Exception
        {
            //1. Arrange
            double i = 30;
            double j = 10;

            //2. Act
            double result = cal.subtraction(i,j);

            //3. Assert
            assertEquals(20, result,0);
        }
        
        
        @Test
        //test Identifier 1.2.3
        //test Description Add 40-10
        //Method of execution
        //Test Data 40,10
        //Expected Output 30
        //Generated Output 30 Passed
        // Action: Report test case failed
        public void subtraction_3() throws Exception
        {
            //1. Arrange
            double i = 40;
            double j = 10;

            //2. Act
            double result = cal.subtraction(i,j);

            //3. Assert
            assertEquals(30, result,0);
        }
        
        
        @Test
        //test Identifier 1.2.4
        //test Description Add 50-10
        //Method of execution
        //Test Data 50,10
        //Expected Output 40
        //Generated Output 40 Passed
        // Action: Report test case failed
        public void subtraction_4() throws Exception
        {
            //1. Arrange
            double i = 50;
            double j = 10;

            //2. Act
            double result = cal.subtraction(i,j);

            //3. Assert
            assertEquals(40, result,0);
        }
        
        
        @Test
        //test Identifier 1.2.5
        //test Description Add 60-10
        //Method of execution
        //Test Data 60,10
        //Expected Output 50
        //Generated Output 50 Passed
        // Action: Report test case failed
        public void subtraction_5() throws Exception
        {
            //1. Arrange
            double i = 60;
            double j = 10;

            //2. Act
            double result = cal.subtraction(i,j);

            //3. Assert
            assertEquals(50, result,0);
        }

        
        @Test
        //test Identifier 1.3.1
        //test Description Add 20*10
        //Method of execution
        //Test Data 20,10
        //Expected Output 200
        //Generated Output 200 Passed
        // Action: Report test case failed
        public void multiplication_1() throws Exception
        {
            //1. Arrange
            double i = 20;
            double j = 10;
    
            //2. Act
            double result = cal.multiplication(i,j);
    
            //3. Assert
            assertEquals(200, result,0);
        }
        
        
        @Test
        //test Identifier 1.3.2
        //test Description Add 30*10
        //Method of execution
        //Test Data 30,10
        //Expected Output 300
        //Generated Output 300 Passed
        // Action: Report test case failed
        public void multiplication_2() throws Exception
        {
            //1. Arrange
            double i = 30;
            double j = 10;

            //2. Act
            double result = cal.multiplication(i,j);

            //3. Assert
            assertEquals(300, result,0);
        }
        
        
        @Test
        //test Identifier 1.3.3
        //test Description Add 40*10
        //Method of execution
        //Test Data 40,10
        //Expected Output 400
        //Generated Output 400 Passed
        // Action: Report test case failed
        public void multiplication_3() throws Exception
        {
            //1. Arrange
            double i = 40;
            double j = 10;

            //2. Act
            double result = cal.multiplication(i,j);

            //3. Assert
            assertEquals(400, result,0);
        }
        
        
        @Test
        //test Identifier 1.3.4
        //test Description Add 50*10
        //Method of execution
        //Test Data 50,10
        //Expected Output 500
        //Generated Output 500 Passed
        // Action: Report test case failed
        public void multiplication_4() throws Exception
        {
            //1. Arrange
            double i = 50;
            double j = 10;

            //2. Act
            double result = cal.multiplication(i,j);

            //3. Assert
            assertEquals(500, result,0);
        }
        
        
        @Test
        //test Identifier 1.3.5
        //test Description Add 60*10
        //Method of execution
        //Test Data 60,10
        //Expected Output 600
        //Generated Output 600 Passed
        // Action: Report test case failed
        public void multiplication_5() throws Exception
        {
            //1. Arrange
            double i = 60;
            double j = 10;

            //2. Act
            double result = cal.multiplication(i,j);

            //3. Assert
            assertEquals(600, result,0);
        }

        
        @Test
        //test Identifier 1.4.1
        //test Description Add 20/10
        //Method of execution
        //Test Data 20,10
        //Expected Output 2
        //Generated Output 2 Passed
        // Action: Report test case failed
        public void division_1() throws Exception
        {
            //1. Arrange
            double i = 20;
            double j = 10;
    
            //2. Act
            double result = cal.division(i,j);
    
            //3. Assert
            assertEquals(2, result,0);
        }
        
        
        @Test
        //test Identifier 1.4.2
        //test Description Add 30/10
        //Method of execution
        //Test Data 30,10
        //Expected Output 3
        //Generated Output 3 Passed
        // Action: Report test case failed
        public void division_2() throws Exception
        {
            //1. Arrange
            double i = 30;
            double j = 10;

            //2. Act
            double result = cal.division(i,j);

            //3. Assert
            assertEquals(3, result,0);
        }

        
        @Test
        //test Identifier 1.4.3
        //test Description Add 40/10
        //Method of execution
        //Test Data 40,10
        //Expected Output 4
        //Generated Output 4 Passed
        // Action: Report test case failed
        public void division_3() throws Exception
        {
            //1. Arrange
            double i = 40;
            double j = 10;

            //2. Act
            double result = cal.division(i,j);

            //3. Assert
            assertEquals(4, result,0);
        }

        
        @Test
        //test Identifier 1.4.4
        //test Description Add 50*10
        //Method of execution
        //Test Data 50,10
        //Expected Output 5
        //Generated Output 5 Passed
        // Action: Report test case failed
        public void division_4() throws Exception
        {
            //1. Arrange
            double i = 50;
            double j = 10;

            //2. Act
            double result = cal.division(i,j);

            //3. Assert
            assertEquals(5, result,0);
        }

        
        @Test
        //test Identifier 1.4.5
        //test Description Add 60/10
        //Method of execution
        //Test Data 60,10
        //Expected Output 6
        //Generated Output 6 Passed
        // Action: Report test case failed
        public void division_5() throws Exception
        {
            //1. Arrange
            double i = 60;
            double j = 10;

            //2. Act
            double result = cal.division(i,j);

            //3. Assert
            assertEquals(6, result,0);
        }

}