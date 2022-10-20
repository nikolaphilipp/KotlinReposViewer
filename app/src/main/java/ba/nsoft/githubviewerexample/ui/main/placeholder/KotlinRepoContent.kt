package ba.nsoft.githubviewerexample.ui.main.placeholder

import ba.nsoft.githubviewerexample.data.types.KotlinRepo
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object KotlinRepoContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<KotlinRepo> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, KotlinRepo> = HashMap()

    private fun addItem(item: KotlinRepo) {
        ITEMS.add(item)
        ITEM_MAP[item.id.toString()] = item
    }
}