package ba.nsoft.githubviewerexample.contract

interface MainContract {
    interface View {
        fun populateRepoList()
    }

    interface Presenter {
        fun onViewCreated()
        fun getKotlinRepoData()
    }
}