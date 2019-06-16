package william.miranda.kotlintraining.data

import william.miranda.kotlintraining.data.post.PostDao

object AppDatabaseWrapper {

    lateinit var postDao: PostDao
}