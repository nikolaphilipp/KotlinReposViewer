package ba.nsoft.githubviewerexample.di
import ba.nsoft.githubviewerexample.data.DataModel
import ba.nsoft.githubviewerexample.data.remote.GithubApi
import ba.nsoft.githubviewerexample.domain.repository.GithubViewerRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideGithubApi(): GithubApi {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
            .create(GithubApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDataModel(githubViewerRepo: GithubViewerRepo): DataModel {
        return DataModel(githubViewerRepo)
    }
}