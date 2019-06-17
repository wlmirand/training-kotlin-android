package william.miranda.kotlintraining.ui.home

import androidx.lifecycle.ViewModel
import william.miranda.kotlintraining.data.post.PostRepository

/**
 * Presenter class for HomeFragment
 */
class HomeViewModel(
    private val postRepository: PostRepository
): ViewModel() {

    val posts = postRepository.getAll()
}