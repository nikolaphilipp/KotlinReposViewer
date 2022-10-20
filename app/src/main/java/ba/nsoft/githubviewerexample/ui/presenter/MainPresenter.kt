package ba.nsoft.githubviewerexample.ui.presenter

import ba.nsoft.githubviewerexample.contract.MainContract
import ba.nsoft.githubviewerexample.domain.repository.GithubViewerRepo
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val view: MainContract.View,
    private val githubViewerRepo: GithubViewerRepo
) : MainContract.Presenter {

    override fun onViewCreated() {
        githubViewerRepo.getKotlinRepos()
    }

    override fun getKotlinRepoData() {

    }
}
