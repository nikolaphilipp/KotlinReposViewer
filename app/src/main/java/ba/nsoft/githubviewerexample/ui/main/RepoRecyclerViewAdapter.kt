package ba.nsoft.githubviewerexample.ui.main

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ba.nsoft.githubviewerexample.R
import ba.nsoft.githubviewerexample.data.types.KotlinRepo
import ba.nsoft.githubviewerexample.databinding.RepoItemBinding

class RepoRecyclerViewAdapter(
    private val values: List<KotlinRepo>
) : RecyclerView.Adapter<RepoRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            RepoItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id.toString()
        holder.contentView.text = item.name
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: RepoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemNumber
        val contentView: TextView = binding.content

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}