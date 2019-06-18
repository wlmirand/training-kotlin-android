package william.miranda.kotlintraining.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import william.miranda.kotlintraining.databinding.FragmentDetailsBinding

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
        /*
            Note we use the class generated by databind library to inflate.
            We also pass variables to the "layout" so we dont need to Observe.
            The databind library will take care of put the data into layout fields
         */
        return with (FragmentDetailsBinding.inflate(inflater, container, false)) {
            //our layout variable
            viewModel = this@DetailsFragment.viewModel

            //need to pass this.... its the Fragment lifecycle, so the layout know when it should "render"
            lifecycleOwner = this@DetailsFragment

            //in the end, return the root view
            root
        }
    }
}