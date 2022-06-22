package dev.exercise.keepfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePageActivity : AppCompatActivity() {
    lateinit var bNav: BottomNavigationView
    lateinit var fcvHome: FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        castViews()
        setBottomNav()

    }

    fun castViews() {
        bNav = findViewById(R.id.bNav)
        fcvHome = findViewById(R.id.fcvHome)
    }

    fun setBottomNav() {
        bNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.plan -> {
                    val transaction = supportFragmentManager.beginTransaction()
                        .replace(R.id.fcvHome, PlanFragment())
                    transaction.commit()
                    true
                }
                R.id.track -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcvHome, TrackFragment()).commit()
                    true
                }
                R.id.Profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcvHome, ProfileFragment()).commit()
                    true
                }
                else -> false
            }
        }
    }
}
//fun castViews() {
//        bNav=findViewById(R.id.bNav)
//        fcvHome=findViewById(R.id.fcvHome)
//    }
//fun setupBottomNav(){
//    bNav.setOnItemSelectedListener { item->
//        when(item.itemId){
//            R.id.plan->{
//                supportFragmentManager.beginTransaction().replace(R.id.fcvHome,PlanFragment()).commit()
//                true
//            }
//            R.id.track->{
//                supportFragmentManager.beginTransaction().replace(R.id.fcvHome,TrackFragment()).commit()
//                true
//            }
//            R.id.Profile->{
//                supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
//                true
//            }
//            else->false
//
//        }
//    }
//
//}
//    }