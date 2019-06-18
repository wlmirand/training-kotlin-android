package william.miranda.kotlintraining.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_details.*
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import william.miranda.kotlintraining.R

/**
 * This Fragment will display all the Information of One Post
 */
class DetailsFragment: Fragment() {

    /**
     * Arguments that comes from the Navigation
     */
    private val args: DetailsFragmentArgs by navArgs()

    /**
     * ViewModel for the DetailsFragment
     * We inform Koin that this ViewModel will have one parameter set by us
     */
    private val viewModel: DetailsViewModel by viewModel { parametersOf(args.postId) }

    /**
     * OnCreateView
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    /**
     * OnViewCreated
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Observe data and set the Views
        viewModel.post.observe({ viewLifecycleOwner.lifecycle }) {
            it?.let {
                postId.text = "PostID: ${it.id}"
                userId.text = "UserID: ${it.userId}"
                title.text = "Post Title: ${it.title}"
                body.text = "Post Body: ${it.body}"
            }
        }
    }
}