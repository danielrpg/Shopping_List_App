package com.dr2.shoppinglistapp.ui.shoppinglist

import com.dr2.shoppinglistapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}