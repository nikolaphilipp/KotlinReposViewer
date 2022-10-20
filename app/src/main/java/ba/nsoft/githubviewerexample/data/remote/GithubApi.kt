package ba.nsoft.githubviewerexample.data.remote

import ba.nsoft.githubviewerexample.data.types.KotlinRepo
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {
    @GET("search/repositories?q=language:kotlin&order=desc&sort=stars")
    fun getKotlinRepos(): Observable<Result<KotlinRepo>>

    @GET("repos/{owner}/{name}")
    suspend fun getRepoDetails(@Path("owner") repoOwner: String, @Path("name") repoName: String)
}