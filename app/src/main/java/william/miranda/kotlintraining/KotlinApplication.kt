package william.miranda.kotlintraining

import android.app.Application
import androidx.room.Room
import william.miranda.kotlintraining.data.AppDatabase
import william.miranda.kotlintraining.data.AppDatabaseWrapper

/**
 * Application class
 * Here we init the Room Database
 */
class KotlinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "kotlin-training-db"
        ).build()

        AppDatabaseWrapper.postDao = db.postDao()
    }
}