package william.miranda.kotlintraining.koin

import androidx.room.Room
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import william.miranda.kotlintraining.api.PostApi
import william.miranda.kotlintraining.data.AppDatabase
import william.miranda.kotlintraining.data.post.PostRepository
import william.miranda.kotlintraining.ui.home.HomeViewModel

val koinModules =  module {

    single {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create<PostApi>(PostApi::class.java)
    }

    single {
        val db = Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            "kotlin-training-db"
        ).build()

        db.postDao()
    }

    single { PostRepository(get(), get()) }

    viewModel { HomeViewModel(get()) }
}