package ba.nsoft.githubviewerexample.di

import ba.nsoft.githubviewerexample.contract.MainContract
import ba.nsoft.githubviewerexample.ui.presenter.MainPresenter
import ba.nsoft.githubviewerexample.ui.main.RepoFragment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped

@InstallIn(ActivityComponent::class)
@Module
abstract class ContractModule {
    @Binds
    @ActivityScoped
    abstract fun bindPresenter(impl: MainPresenter): MainContract.Presenter

    @Binds
    @ActivityScoped
    abstract fun bindView(fragment: RepoFragment): MainContract.View
}