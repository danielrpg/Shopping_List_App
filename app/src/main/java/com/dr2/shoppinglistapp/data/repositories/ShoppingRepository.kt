package com.dr2.shoppinglistapp.data.repositories

import com.dr2.shoppinglistapp.data.db.ShoppingDatabase
import com.dr2.shoppinglistapp.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}