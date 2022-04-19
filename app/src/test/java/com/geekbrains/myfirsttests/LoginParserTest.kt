package com.geekbrains.myfirsttests

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertSame
import org.junit.Test

class LoginParserTest {

    @Test
    fun loginParser_ValidEmail_FirstElem_ReturnEquals() {
        assertEquals("name", LoginParser.parseEmail("name@email.com")?.first())
    }

    @Test
    fun loginParser_ValidEmail_FirstElemNotCorrect_ReturnNotEquals() {
        assertNotEquals("email", LoginParser.parseEmail("name@email.com")?.first())
    }

    @Test
    fun loginParser_ValidEmail_ReturnsNotNullAndArrayEquals() {
        assertNotNull(LoginParser.parseEmail("name@email.com"))

        assertArrayEquals(
            arrayOf("name","email","com"),
            LoginParser.parseEmail("name@email.com"))
    }

    @Test
    fun loginParser_InvalidEmail_ReturnNull() {
        assertNull(LoginParser.parseEmail("nameemail.com"))
    }

    @Test
    fun loginParser_ValidEmail_CountOfElements_ReturnItsSame() {
        assertSame(
            3,
            LoginParser.parseEmail("name@email.com")?.size)
    }
}