package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_BigSizeLeft_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("namenamenamenamenamenamenamenamenamenamenamen" +
                "amenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamen" +
                "amenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamename" +
                "namenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamena" +
                "menamenamenamenamenamenamename@email.com"))
    }

    @Test
    fun emailValidator_BigSizeRight_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email.americanexpressamericanexpressameri" +
                "canexpressamericanexpressamericanexpress"))
    }

    @Test
    fun emailValidator_NotAt_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("nameemail.com"))
    }

    @Test
    fun emailValidator_NotSpaceLeft_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("na me@email.com"))
    }

    @Test
    fun emailValidator_NotSpaceRight_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@e mail.com"))
    }

    @Test
    fun emailValidator_ShortNotAt_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name"))
    }

    @Test
    fun emailValidator_NonPrintChar_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("\"test\rblah\"@example.com"))
    }

    @Test
    fun emailValidator_ManyQuotes_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("\"\"test\"\"blah\"\"@example.com"))
    }
}