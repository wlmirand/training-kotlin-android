package william.miranda.kotlintraining

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import william.miranda.kotlintraining.koin.koinModules

/**
 * Application class
 * Here we init the Room Database
 */
class KotlinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@KotlinApplication)
            // declare modules
            modules(koinModules)
        }
    }
}