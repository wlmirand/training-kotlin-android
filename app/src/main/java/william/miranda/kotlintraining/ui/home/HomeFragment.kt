package william.miranda.kotlintraining.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import william.miranda.kotlintraining.R
import william.miranda.kotlintraining.data.post.Post

class HomeFragment : Fragment() {

    /**
     * Presenter
     */
    private val presenter = HomePresenter(this)

    /**
     * Android callback to Render the Layout
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        inflater.inflate(R.layout.fragment_home, container, false)

    /**
     * After the Views are Rendered, we can do some stuff
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        context?.let {
            recyclerView.apply {
                val manager = LinearLayoutManager(it)
                layoutManager = manager
                addItemDecoration(DividerItemDecoration(it, manager.orientation))
                adapter = PostAdapter()
            }
        }
    }

    /**
     * When the Fragment is visible, we fetch the Data
     */
    override fun onResume() {
        super.onResume()
        presenter.getAllPosts()
    }

    /**
     * Update the Adapter with new Data
     */
    fun updatePosts(posts: List<Post>) {
        (recyclerView.adapter as PostAdapter).swap(posts)
    }
}
