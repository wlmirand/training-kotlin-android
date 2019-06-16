package william.miranda.kotlintraining.data.post

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import william.miranda.kotlintraining.api.Api
import william.miranda.kotlintraining.data.AppDatabaseWrapper

/**
 * Repository class
 * According to Google, in here we handle with Local and Remote Databases
 */
object PostRepository {

    private val postApi = Api.postApi
    private val postDao = AppDatabaseWrapper.postDao

    /**
     * Expose all saved Posts to upper layers
     */
    fun getAll(): List<Post> {
        //Fetch information from the API
        var postsFromApi = postApi.getAllPosts().enqueue(
            object : Callback<List<Post>> {

                override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                    //Nothing to do
                }

                override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                    //If got something valid, save locally
                    if (response.isSuccessful) {
                        response.body()?.let {
                            CoroutineScope(Dispatchers.IO).launch { postDao.insert(it) }
                        }
                    }
                }

            }
        )

        //Return what we have locally
        return postDao.getAll()
    }
}