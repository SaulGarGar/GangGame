package com.gdg.saul.gamggame


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.gdg.saul.gamggame.deals.DealsFragment
import com.gdg.saul.gamggame.owned.MostOwnedFragment
import com.gdg.saul.gamggame.rated.TopRatedFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     companion object {
         const val DEFAULT_ITEM = R.id.action_deal
     }

    val fragments = hashMapOf<Int, Fragment>(
            Pair(R.id.action_deal, DealsFragment()),
            Pair(R.id.top_rated, TopRatedFragment()),
            Pair(R.id.most_owned, MostOwnedFragment())
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.navigation_view
        navigation_view.selectedItemId = DEFAULT_ITEM
        navigation_view.setOnNavigationItemSelectedListener {
            item ->  showFragment(item.itemId)
            true
        }

    }

    private fun initView(){
        val fragment = fragments[DEFAULT_ITEM]

        supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
    }

    private fun  showFragment(itemId: Int) {
        val fragment = fragments[itemId]

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
    }
}
