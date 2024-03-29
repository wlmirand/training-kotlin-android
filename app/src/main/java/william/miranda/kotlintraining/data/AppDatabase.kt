package william.miranda.kotlintraining.data

import androidx.room.Database
import androidx.room.RoomDatabase
import william.miranda.kotlintraining.data.post.Post
import william.miranda.kotlintraining.data.post.PostDao

/**
 * Application Database class
 * The implementation of this will be generated by Room Library
 */
@Database(
    version = 1,
    entities = [
        Post::class
    ]
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun postDao(): PostDao
}