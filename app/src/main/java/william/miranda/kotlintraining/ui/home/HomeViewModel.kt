package william.miranda.kotlintraining.ui.home

import androidx.lifecycle.ViewModel
import william.miranda.kotlintraining.data.post.PostRepository

/**
 * ViewModel class for HomeFragment
 */
class HomeViewModel(postRepository: PostRepository): ViewModel() {

    /**
     * Expose the LiveData coming from the Repository
     */
    val posts = postRepository.getAll()
}