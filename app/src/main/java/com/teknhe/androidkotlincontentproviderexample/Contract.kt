package com.teknhe.androidkotlincontentproviderexample

import android.net.Uri

class Contract {
    companion object {
        val AUTHORITY = "com.tekhne.contentprovider.provider"
        val CONTENT_PATH = "sentence"
        val CONTENT_URI = Uri.parse("content://$AUTHORITY/$CONTENT_PATH")
        val ALL_ITEMS = -2
        val WORD_ID = "id"
    }
}