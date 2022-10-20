package ba.nsoft.githubviewerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ba.nsoft.githubviewerexample.ui.main.RepoFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity(): AppCompatActivity() {

    @Inject
    lateinit var repoFragment: RepoFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, repoFragment)
                .commitNow()
        }
    }
}