package ba.nsoft.githubviewerexample.data.repository

import ba.nsoft.githubviewerexample.data.remote.GithubApi
import ba.nsoft.githubviewerexample.domain.repository.GithubViewerRepo
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class GithubRepoImpl @Inject constructor(
    private val api: GithubApi
): GithubViewerRepo {
    override fun getKotlinRepos() {
        val observable = api.getKotlinRepos()
        observable
            .subscribeOn(Schedulers.io())
            .subscribe {
                print("Vozi")
                print(it)
            }
    }

    override fun getRepoDetails() {
        TODO("Not yet implemented")
    }
}