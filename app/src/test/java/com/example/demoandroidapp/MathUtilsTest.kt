package com.example.demoandroidapp

import org.junit.Assert.assertEquals
import org.junit.Test

class MathUtilsTest {

    @Test
    fun checkSum() {
        assertEquals(4, MathUtils.sum(2,2))
    }
}