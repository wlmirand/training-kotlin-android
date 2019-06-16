package william.miranda.kotlintraining.data.post

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data Class for Post.
 * We use this either to receive the JSON from API
 * and for save in our Local DB
 */
@Entity(tableName = "posts")
data class Post(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val userId: Int,
    val title: String,
    val body: String
)
