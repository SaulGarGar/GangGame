import android.app.Fragment

/**
 * Created by saul on 30/07/17.
 */
abstract class BaseFragment : Fragment(){
    abstract fun getLayout() : Int
}