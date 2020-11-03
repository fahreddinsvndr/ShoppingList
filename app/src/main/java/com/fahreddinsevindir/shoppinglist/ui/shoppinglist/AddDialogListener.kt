package com.fahreddinsevindir.shoppinglist.ui.shoppinglist

import com.fahreddinsevindir.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}