package ba.nsoft.githubviewerexample.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ba.nsoft.githubviewerexample.R
import ba.nsoft.githubviewerexample.contract.MainContract
import ba.nsoft.githubviewerexample.ui.presenter.MainPresenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * A fragment representing a list of Items.
 */
@AndroidEntryPoint
class RepoFragment @Inject constructor(
    private var presenter: dagger.Lazy<MainContract.Presenter>
) : Fragment(), MainContract.View {

    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.repo_item_list, container, false)

        // Set the adapter
        /* if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = RepoRecyclerViewAdapter()
            }
        } */
        (presenter.get()).onViewCreated()
        return view
    }

    override fun populateRepoList() {
    }
}