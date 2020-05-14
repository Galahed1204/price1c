package `fun`.gladkikh.app.price1c.framework.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.price1c.room.entity.ItemPriceDB

@Dao
interface ItemPriceDao {
    @Insert
    fun insert(item: ItemPriceDB)

    @Insert
    fun insert(item: List<ItemPriceDB>)

    @Query("DELETE FROM ItemPriceDB")
    fun dellALL()

    @Query("SELECT * FROM ItemPriceDB")
    fun getAll(): LiveData<List<ItemPriceDB>>

    @Query("SELECT * FROM ItemPriceDB WHERE name LIKE:search AND valuta =:value")
    fun getAllWithNameLike(search: String,value:String): LiveData<List<ItemPriceDB>>

}