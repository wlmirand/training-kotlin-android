package william.miranda.kotlintraining.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_post.view.*
import william.miranda.kotlintraining.R
import william.miranda.kotlintraining.data.post.Post

/**
 * Adapter to provide data to RecyclerView
 */
class PostAdapter(
    private val data: MutableList<Post> = mutableListOf()
): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    /**
     * Called when a new ViewHolder is necessary
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_post, parent, false)

        return PostViewHolder(view)
    }

    /**
     * Called to populate a ViewHolder
     */
    override fun onBindViewHolder(holder: PostViewHolder, position: Int) = holder.setData(data[position])

    /**
     * Return the number of elements
     */
    override fun getItemCount() = data.size

    /**
     * Put a new dataset into this adapter
     */
    fun swap(newData: List<Post>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    /**
     * Inner class for ViewHolder
     */
    inner class PostViewHolder(view: View): RecyclerView.ViewHolder(view) {

        /**
         * Fill the ViewHolder with new Data
         */
        fun setData(data: Post) {
            itemView.title.text = data.title
            itemView.body.text = data.body
        }
    }
}