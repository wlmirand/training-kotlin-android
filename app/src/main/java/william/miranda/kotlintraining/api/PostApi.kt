package william.miranda.kotlintraining.api

import retrofit2.Call
import retrofit2.http.GET
import william.miranda.kotlintraining.data.post.Post

/**
 * Retrofit interface with API Endpoints
 */
interface PostApi {

    @GET("posts")
    fun getAllPosts(): Call<List<Post>>
}