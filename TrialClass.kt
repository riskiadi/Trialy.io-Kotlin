
import android.content.Context
import io.trialy.library.Constants.*
import io.trialy.library.TrialyCallback
import io.trialy.library.Trialy

class TrialClass(contex: Context, api: String) {

    private val mContext: Context
    private val mApi: String

    private val mTrialyCallback = TrialyCallback { status, timeRemaining, sku ->
        when (status) {
            STATUS_TRIAL_JUST_ENDED -> System.exit(0)
            STATUS_TRIAL_OVER -> System.exit(0)
            STATUS_TRIAL_NOT_YET_STARTED -> startTrial()
        }
    }

    init {
        this.mContext = contex
        this.mApi = api
        Trialy(mContext, mApi).checkTrial("default", mTrialyCallback)
    }

    private fun startTrial() {
        Trialy(mContext, mApi).startTrial("default", mTrialyCallback)
    }

}


