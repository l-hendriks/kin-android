// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  enum CreateAccountResultCode
//  {
//      // codes considered as "success" for the operation
//      CREATE_ACCOUNT_SUCCESS = 0, // account was created
//
//      // codes considered as "failure" for the operation
//      CREATE_ACCOUNT_MALFORMED = -1,   // invalid destination
//      CREATE_ACCOUNT_UNDERFUNDED = -2, // not enough funds in source account
//      CREATE_ACCOUNT_LOW_RESERVE =
//          -3, // would create an account below the min reserve
//      CREATE_ACCOUNT_ALREADY_EXIST = -4 // account already exists
//  };
//  ===========================================================================
enum class CreateAccountResultCode(val value: Int) {
    CREATE_ACCOUNT_SUCCESS(0),
    CREATE_ACCOUNT_MALFORMED(-1),
    CREATE_ACCOUNT_UNDERFUNDED(-2),
    CREATE_ACCOUNT_LOW_RESERVE(-3),
    CREATE_ACCOUNT_ALREADY_EXIST(-4);

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): CreateAccountResultCode {
            val value = stream.readInt()
            return when (value) {
                0 -> CREATE_ACCOUNT_SUCCESS
                -1 -> CREATE_ACCOUNT_MALFORMED
                -2 -> CREATE_ACCOUNT_UNDERFUNDED
                -3 -> CREATE_ACCOUNT_LOW_RESERVE
                -4 -> CREATE_ACCOUNT_ALREADY_EXIST
                else -> throw RuntimeException("Unknown enum value: $value")
            }
        }

        @JvmStatic
        @Throws(IOException::class)
        fun encode(stream: XdrDataOutputStream, value: CreateAccountResultCode) {
            stream.writeInt(value.value)
        }
    }
}