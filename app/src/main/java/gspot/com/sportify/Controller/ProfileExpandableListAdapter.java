package gspot.com.sportify.Controller;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import gspot.com.sportify.Model.MySport;
import gspot.com.sportify.Model.Profile;
import gspot.com.sportify.R;
import gspot.com.sportify.utils.StateWrapper;

/**
 * Created by patrickhayes on 5/6/16.
 * Adapter class for the expandable list widget. We pass it in a list of parents and
 * a hash map that maps the parents to their children.
 * Handles retriving the location of a button when a user clicks on a specific child.
 */
public class ProfileExpandableListAdapter extends BaseExpandableListAdapter {

    private Context mContext;
    private List<String> mListDataHeader; // header titles
    // child data in format of header title, child title
    private Map<String, MySport> mListDataChild;
    private StateWrapper mState;
    private Profile mProfile;

    public ProfileExpandableListAdapter(Context context, List<String> listDataHeader,
                                 Map<String, MySport> listChildData,
                                 StateWrapper state, Profile profile) {
        this.mContext = context;
        this.mListDataHeader = listDataHeader;
        this.mListDataChild = listChildData;
        this.mState = state;
        this.mProfile = profile;
    }

    /*Returns the MySport that was just clicked on */
    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this.mListDataChild.get(this.mListDataHeader.get(groupPosition));
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    /* Returns the view of the child needed for rendering the expandable list */
    @Override
    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {


        final MySport childSport = (MySport) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.prolife_expandable_list_item, null);
        }

        //bind
        final Spinner skillLevelSpinner = (Spinner) convertView.findViewById(R.id.skill_lv_spinner);
        TextView skillLevelText = (TextView) convertView.findViewById(R.id.skill_lv_text);
        EditText sportBioContent = (EditText) convertView.findViewById(R.id.sport_bio_content);
        Button deleteSport = (Button) convertView.findViewById(R.id.delete_sport_button);
        //always set the bio
        sportBioContent.setText(childSport.getmBio());

        //If we are in the editable state, enable everything
        if (mState.getState() == StateWrapper.State.EDIT) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(mContext, R.array.skill_lv_array, R.layout.spinner_style);
            adapter.setDropDownViewResource(R.layout.spinner_style);
            skillLevelSpinner.setAdapter(adapter);
            skillLevelSpinner.setVisibility(View.VISIBLE);
            String defaultSelection = mProfile.getmMySports().get(groupPosition).getmSkillLevel().getSkillLevel();
            if (!defaultSelection.equals(null)) {
                int spinnerPosition = adapter.getPosition(defaultSelection);
                skillLevelSpinner.setSelection(spinnerPosition);
            }

            //whenever they selected a skill level save it
            skillLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    Log.e("TAGGGG", skillLevelSpinner.getSelectedItem().toString());
                    mProfile.getmMySports().get(groupPosition).setSkillLevelString(skillLevelSpinner.getSelectedItem().toString());
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                    // your code here
                }

            });

            skillLevelText.setVisibility(View.GONE);
            sportBioContent.setEnabled(true);
            deleteSport.setVisibility(View.VISIBLE);

            deleteSport.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mProfile.getmMySports().size() > 0) {
                        mProfile.getmMySports().remove(groupPosition);

                        mListDataChild.remove(mListDataHeader.get(groupPosition));
                        mListDataHeader.remove(groupPosition);
                        notifyDataSetChanged();
                    }
                }
            });

            //save what they write immediatly so if they scroll away the recycler doesn't eat it up
            sportBioContent.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    //don't do anything
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    //don't do anything
                }

                @Override
                public void afterTextChanged(Editable editable) {

                    if(mProfile.getmMySports().size() > 0 ) {
                        if(editable.toString().length() == 0) {
                            mProfile.getmMySports().get(groupPosition ).setmBio("Write about yourself with respect to this sport.");
                        } else if (editable.toString().length() > 200){
                            mProfile.getmMySports().get(groupPosition).setmBio("Please keep your bio shorter than 200 character.");
                        } else {
                            mProfile.getmMySports().get(groupPosition).setmBio(editable.toString());
                        }
                    }
                }
            });
        }

        //if we are in view mode, then disable everything
        else {
            skillLevelSpinner.setVisibility(View.GONE);
            skillLevelText.setVisibility(View.VISIBLE);
            skillLevelText.setText(childSport.skillLevelToString());
            sportBioContent.setEnabled(false);
            deleteSport.setVisibility(View.GONE);
        }
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.mListDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this.mListDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    /* Return the view for each parent */
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.profile_expandable_list_group, null);
        }


        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

}
