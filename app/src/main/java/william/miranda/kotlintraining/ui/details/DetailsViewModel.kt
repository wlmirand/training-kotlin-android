package william.miranda.kotlintraining.ui.details

import androidx.lifecycle.ViewModel
import william.miranda.kotlintraining.data.post.PostRepository

/**
 * ViewModel class for the DetailsFragment
 * Differently from the HomeFragment, in here we need to receive the PostID,
 * so we expose the LiveData<Post> of the Post user selected on the list
 *
 * Note we have one parameter that we pass on constructor, so we will need to inform
 * Koin how to create this ViewModel with the parameter we are going to pass
 */
class DetailsViewModel(
    postId: Int,
    postRepository: PostRepository
): ViewModel() {

    val post = postRepository.get(postId)
}