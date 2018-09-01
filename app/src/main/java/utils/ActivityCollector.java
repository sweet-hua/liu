package utils;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by liujie on 2018/8/4.
 */

public class ActivityCollector {

    public  static ArrayList<Activity> activitys = new ArrayList<>();

    public static void addActivity(Activity activity){
        activitys.add(activity);
    }

    public static void removeActivty(Activity activity){
        activitys.remove(activity);
    }

    public static void finshAll(){
        for (Activity activity:activitys){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activitys.clear();
    }

}
