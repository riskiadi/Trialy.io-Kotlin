import io.trialy.library.Trialy

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TrialClass(this,"<YOUR API TOKEN>")

    }

}
