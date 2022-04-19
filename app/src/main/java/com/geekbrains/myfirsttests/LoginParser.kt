package com.geekbrains.myfirsttests

class LoginParser {
    companion object {
        fun parseEmail(email: String): Array<String>? {
            val splitList = email.split("@", ".")
            if (splitList.size != 3) {
                return null
            }
            return splitList.toTypedArray()
        }
    }
}