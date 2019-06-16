package william.miranda.kotlintraining.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * object is a simple way to give us a Singleton
 * I here, we create the Retrofit object to be used in the Repositories
 */
object Api {

    val postApi: PostApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        postApi = retrofit.create<PostApi>(PostApi::class.java)
    }
}