package william.miranda.kotlintraining.data.post

import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import william.miranda.kotlintraining.api.PostApi

/**
 * Repository class
 * According to Google, in here we handle with Local and Remote Databases
 */
class PostRepository(
    private val postApi: PostApi,
    private val postDao: PostDao
) {

    /**
     * Expose all saved Posts to upper layers
     */
    fun getAll(): LiveData<List<Post>> {
        postApi.getAllPosts().enqueue(object : Callback<List<Post>> {
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful) {
                    CoroutineScope(Dispatchers.IO).launch {
                        response.body()?.let { postDao.insert(it) }
                    }
                }
            }

        })

        //Return what we have locally
        return postDao.getAll()
    }

    /**
     * Expose one Saved Post
     */
    fun get(postId: Int): LiveData<Post> {
        return postDao.get(postId)
    }
}