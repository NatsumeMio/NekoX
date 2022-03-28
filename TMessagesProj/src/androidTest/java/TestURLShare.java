import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.stream.Collectors;

@RunWith(AndroidJUnit4.class)
public class TestURLShare {

    @Rule
    public ActivityTestRule<LaunchActivity> activityRule =
            new ActivityTestRule<>(LaunchActivity.class);


    @Test
    public void testOpenChatActivity() throws InterruptedException {
        LaunchActivity activity = activityRule.getActivity();
//        ActionBarLayout actionBarLayout = activity.getActionBarLayout();
        Thread.sleep(2500);

        Bundle args1 = new Bundle();
        args1.putLong("chat_id", 1408456729);
        AndroidUtilities.runOnUIThread(() -> activity.presentFragment(new ChatActivity(args1)));
        Thread.sleep(10000);

//        Log.e("test", dialogs.stream().map(dialog -> String.valueOf(dialog.id)).collect(Collectors.joining(",")));
    }
}
