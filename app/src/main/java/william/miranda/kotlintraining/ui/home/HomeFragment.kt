package william.miranda.kotlintraining.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.viewmodel.ext.android.viewModel
import william.miranda.kotlintraining.R

/**
 * This Fragment will display a List of Posts
 */
class HomeFragment : Fragment() {

    /**
     * Item Click Listener for Adapter
     * Called by the ViewHolder passing the ID of the Post that will be displayed
     */
    private val itemClickListener: (Int) -> Unit = {
        //Navigate to the Details fragment passing the PostID
        findNavController().navigate(
            //Note the Navigation Library creates a function that encapsulates the destination and the arguments we should pass
            HomeFragmentDirections.actionToDetailsFragment(it)
        )
    }

    /**
     * ViewModel
     */
    private val viewModel: HomeViewModel by viewModel()

    /**
     * Android callback to Render the Layout
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_home, container, false)

    /**
     * After the Views are Rendered, we can do some stuff
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Check null on Context
        context?.let {
            //Set the scope to the RecyclerView
            recyclerView?.apply {
                //Create and set the LayoutManager
                val manager = LinearLayoutManager(it)
                layoutManager = manager

                //Add the Item Separator (the line between items)
                addItemDecoration(DividerItemDecoration(it, manager.orientation))

                //Set the Adapter with no Data
                adapter = PostAdapter(
                    clickListener = itemClickListener
                )
            }
        }

        //Observe the LiveData on ViewModel
        viewModel.posts.observe( { viewLifecycleOwner.lifecycle }) {
            //if the List (it) is not Null, put it into the Adapter
            it?.let {
                (recyclerView?.adapter as PostAdapter).swap(it)
            }
        }
    }
}
