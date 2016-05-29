package gspot.com.sportify.Controller;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import gspot.com.sportify.Model.MySport;
import gspot.com.sportify.Model.Profile;
import gspot.com.sportify.Model.SportTypes;
import gspot.com.sportify.R;
import gspot.com.sportify.utils.Constants;

/** Add Sport Fragment Class
 * Represents a list of sports for the user to
 * add a sport to their profiles. Once a user clicks on
 * a sport, this fragments adds the sport to their profile
 * with default values which the user can modify.
 */
public class AddSportFragment extends DialogFragment {

    private Profile mProfile;

    public interface OnDataPass {
        public void onDataPass(String data);
    }

    OnDataPass dataPasser;
    private static final String TAG = AddSportFragment.class.getSimpleName();

    String mCurrentUser;

    /** On Create Method
     * Called when Add Button is Pressed. (To be continued)
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate()");
        return super.onCreateDialog(savedInstanceState);
    }

    /** On Create View Method
     * Generates the view of the fragment. (Also to be continued)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView()");

        Resources res = getResources();
        TextView title = (TextView) getDialog().findViewById(android.R.id.title);
        title.setText("Choose a sport");
        title.setTextColor( res.getColor(R.color.colorPrimaryText));

        final int titleDividerId = res.getIdentifier("titleDivider", "id", "android");
        final View titleDivider = getDialog().findViewById(titleDividerId);
        if (titleDivider != null) {
            titleDivider.setBackgroundColor(res.getColor(R.color.colorPrimary));
        }

        View v = inflater.inflate(R.layout.fragment_add_sport, container, false);
        ButterKnife.bind(this, v);

        List<String> sport_types = new SportTypes().getSportTypes();
        Collections.sort(sport_types);
        ProfileActivity activity = (ProfileActivity) getActivity();
        List<String> currentSports = activity.getMySportList();
        mProfile = activity.getProfile();

        //I user shouldn't be able to have two basketball profiles, so hide all the sports they
        //already have a profile for
        if (currentSports != null) {
            sport_types.removeAll(currentSports);
        }

        ListView listView = (ListView) v.findViewById(R.id.sport_type_list);


        ArrayAdapter<String> sportTypeListAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_sport_type, sport_types);
        listView.setAdapter(sportTypeListAdapter);

        setSportListListeners(listView, sport_types);

        return v;
    }

    /** Set Sport Listeners Method
     * Creates listeners for each sport in the list.
     */
    private void setSportListListeners(ListView lv, final List<String> sport_types) {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.i(TAG, "onItemClick()");

                if (mProfile.getmMySports() == null) {
                    mProfile.setmMySports(new ArrayList<MySport>());
                }
                //get the title of the sport from sport_type, then make a new MySport and add
                //it to the users profile
                mProfile.getmMySports().add(new MySport(sport_types.get(position)));
                ProfileActivity activity = (ProfileActivity) getActivity();
                Context context = activity.getApplicationContext();
                activity.setMySportsAdapter(context);
                activity.getFragManager().beginTransaction().remove(AddSportFragment.this).commit();
            }
        });
    }

}
