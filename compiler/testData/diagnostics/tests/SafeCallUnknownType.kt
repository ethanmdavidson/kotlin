// !WITH_NEW_INFERENCE
import <!UNRESOLVED_REFERENCE!>com<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>unknown<!>

fun ff() {
    val a = <!UNRESOLVED_REFERENCE!>unknown<!>()
    val <!UNUSED_VARIABLE!>b<!> = <!TYPE_MISMATCH{OI}!><!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>a<!>?.<!DEBUG_INFO_MISSING_UNRESOLVED!>plus<!>(42)<!>
}