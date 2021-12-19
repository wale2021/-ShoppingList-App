package com.wale.shoppinglistapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_item")
data class ShoppingItems(
    //name and amount attribute represent column in our database
    @ColumnInfo(name="item_name")
    val name:String,
    @ColumnInfo(name= "item_amount")
    val amount:Int,

) {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
}