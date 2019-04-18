package net.gtl.libtest

val libregClassTest = LibRegClassTest()

fun justAnotherFunction() = "Called without a class"

fun callMethodFromClass() = libregClassTest.regFuncCall()