package william.miranda.kotlintraining.ui.home

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import william.miranda.kotlintraining.data.post.PostRepository

/**
 * Presenter class for HomeFragment
 */
class HomePresenter(private val view: HomeFragment) {

    fun getAllPosts() {

        //Get the Data from a background thread
        CoroutineScope(Dispatchers.IO).launch {
            val posts = PostRepository.getAll {
                view.updatePosts(it)
            }

            //Switch to main thread and post the result
            CoroutineScope(Dispatchers.Main).launch {
                view.updatePosts(posts)
            }
        }

    }
}