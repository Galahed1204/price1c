package `fun`.gladkikh.app.price1c.framework.room


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.price1c.room.entity.ItemPriceDB


@Database(entities = arrayOf(ItemPriceDB::class), version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getItemPriceDao(): ItemPriceDao
}