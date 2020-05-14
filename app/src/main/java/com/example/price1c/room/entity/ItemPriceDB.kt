package com.example.price1c.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ItemPriceDB(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val code:String,
    val name:String,
    val valuta: String,
    val storePrice:Float,
    val dealerPrice:Float,
    val partnerPrice:Float,
    val vat: String,
    val storage:String,
    val startSale: Long,
    val comment: String) {
}