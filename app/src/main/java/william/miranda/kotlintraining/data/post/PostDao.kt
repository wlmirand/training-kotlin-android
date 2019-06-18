package william.miranda.kotlintraining.data.post

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Interface that exposes all methods that our Post Database can do
 */
@Dao
interface PostDao {

    @Query("SELECT * FROM posts")
    fun getAll(): LiveData<List<Post>>

    @Query("SELECT * FROM posts WHERE id=:id")
    fun get(id: Int): LiveData<Post>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(post: List<Post>)
}