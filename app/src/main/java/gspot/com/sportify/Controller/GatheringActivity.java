package gspot.com.sportify.Controller;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import gspot.com.sportify.Model.Gathering;
import gspot.com.sportify.Model.SportLab;
import gspot.com.sportify.Model.SportType;
import gspot.com.sportify.R;
import gspot.com.sportify.utils.Constants;
import gspot.com.sportify.utils.App;


/**
 * Created by DannyChan on 5/8/16.
 */
public class GatheringActivity extends BaseNavBarActivity implements OnItemSelectedListener {

    private Gathering mgathering;
    private String m_hostID, mCurrentUser;

    @Bind(R.id.sport_title) EditText mTitleField;
    @Bind(R.id.sport_description) EditText mDescriptionField;
    @Bind(R.id.sport_location) EditText mLocationField;
    @Bind(R.id.sport_date) EditText mDateField;
    @Bind(R.id.sport_time) EditText mTimeField;

    @OnCheckedChanged(R.id.sport_status)
    void onCheckChanged (boolean isChecked) { mgathering.setIsPrivate(isChecked); }

    @OnClick(R.id.sport_submit)
    void onClick(Button button){submitGathering();}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gathering);

        ButterKnife.bind(this);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        m_hostID = prefs.getString(Constants.KEY_UID, "");
        mgathering = new Gathering();
        mgathering.setHostID(m_hostID);

        Spinner sportTypeSpinner = (Spinner) findViewById(R.id.sport_type_spinner);
        sportTypeSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> Adapter1 = ArrayAdapter.createFromResource(this.getApplicationContext(), R.array.sport_types, android.R.layout.simple_spinner_item);
        Adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sportTypeSpinner.setAdapter(Adapter1);

        Spinner skillLevelSpinner = (Spinner) findViewById(R.id.skill_lv_spinner);
        skillLevelSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> dataAdapter = ArrayAdapter.createFromResource(this.getApplicationContext(), R.array.skill_lv_array, android.R.layout.simple_spinner_item);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        skillLevelSpinner.setAdapter(dataAdapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getId()) {
            case R.id.sport_type_spinner:
                String sport = parent.getItemAtPosition(position).toString();
                mgathering.setSID(sport);
                break;

            case R.id.skill_lv_spinner:
                // On selecting a spinner item
                String item = parent.getItemAtPosition(position).toString();

                mgathering.setSkillLevel(mgathering.toSkillLevel(item));
                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Log.e(TAG, "onDestroy()");
        ButterKnife.unbind(this);
    }

    //TODO: Will refractor into gathering model
    private void submitGathering() {
        Firebase postID = new Firebase(Constants.FIREBASE_URL).child("Gatherings");

        /*Gets user's UID*/
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        /*Writes to myGathering list */
        mCurrentUser = prefs.getString(Constants.KEY_UID, "");
        Firebase sportRef = postID.push();
        Firebase myGatheringsID = new Firebase(Constants.FIREBASE_URL_MY_GATHERINGS).child(mCurrentUser).child("myGatherings");
        Map<String, Object> updates = new HashMap<String, Object>();
        updates.put(sportRef.getKey(), sportRef.getKey());
        myGatheringsID.updateChildren(updates);

        /*Writes the gathering to databse*/
        mgathering.setID(sportRef.getKey());
        mgathering.setDate(mDateField.getText().toString());
        mgathering.setSportTitle(mTitleField.getText().toString());
        mgathering.setDescription(mDescriptionField.getText().toString());
        mgathering.setLocation(mLocationField.getText().toString());
        mgathering.setTime(mTimeField.getText().toString());
       // mgathering.setSID("Dummy");
        mgathering.addAttendee(mCurrentUser);
        mgathering.addPending(mCurrentUser);
        sportRef.setValue(mgathering);
        Intent intent = new Intent(this, GatheringListActivity.class);
        finish();
        startActivity(intent);
    }
}
