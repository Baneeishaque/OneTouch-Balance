package com.ayedevelopers.onetouchbalance;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.Button;


/**
 * Implementation of App Widget functionality.
 */
public class otbwidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        //final int N = appWidgetIds.length;
        //for (int i = 0; i < N; i++) {
           //updateAppWidget(context, appWidgetManager, appWidgetIds[i]);
        //}

        //RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.otbwidget);
       // remoteViews.setOnClickPendingIntent(R.id.callbutt, buildButtonPendingIntent(context));

       // pushWidgetUpdate(context, remoteViews);

        for (int appWidgetId : appWidgetIds) {
            final GlobalClass globalVariable = (GlobalClass)context.getApplicationContext();
            Intent intent = new Intent(Intent.ACTION_CALL);
            Intent intentt = new Intent(Intent.ACTION_CALL);
            Intent intenttt = new Intent(Intent.ACTION_CALL);
            Intent intentttt = new Intent(Intent.ACTION_CALL);
            String ussdCode = globalVariable.getmCodecb();
            String ussdCodee = globalVariable.getmCodesb();
            String ussdCodeee = globalVariable.getmCodedb();
            String customerCare = globalVariable.getmCodecc();
            intent.setData(Uri.parse("tel:"+ussdCode));
            intentt.setData(Uri.parse("tel:"+ussdCodee));
            intenttt.setData(Uri.parse("tel:"+ussdCodeee));
            intentttt.setData(Uri.parse(customerCare));
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            PendingIntent pendingIntentt = PendingIntent.getActivity(context, 0, intentt, 0);
            PendingIntent pendingIntenttt = PendingIntent.getActivity(context, 0, intenttt, 0);
            PendingIntent pendingIntentttt = PendingIntent.getActivity(context, 0, intentttt, 0);

            // Get the layout for the App Widget and attach an on-click listener to the button
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.otbwidget);
            views.setOnClickPendingIntent(R.id.callbutt, pendingIntent);
            views.setOnClickPendingIntent(R.id.smsbutt, pendingIntentt);
            views.setOnClickPendingIntent(R.id.databutt, pendingIntenttt);
            views.setOnClickPendingIntent(R.id.splbutt, pendingIntentttt);

            //Intent intent = new Intent(Intent.ACTION_CALL);
           // String ussdCode = globalVariable.getmCodecb();
            //intent.setData(Uri.parse("tel:" + ussdCode));
           // PendingIntent pendingIntentt = PendingIntent.getActivity(context, 0, intent, 0);

            //get onclick to sms
            //RemoteViews viewss = new RemoteViews(context.getPackageName(), R.layout.otbwidget);
           // viewss.setOnClickPendingIntent(R.id.smsbutt,pendingIntentt);

            // Tell the AppWidgetManager to perform an update on the current App Widget
            appWidgetManager.updateAppWidget(appWidgetId, views);

    }}

  //  public static PendingIntent buildButtonPendingIntent(Context context) {
     //   Intent intent = new Intent();
     //   intent.setAction("widget.callbal");
    //    return PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
   // }

   // public static void pushWidgetUpdate(Context context, RemoteViews remoteViews) {
      //  ComponentName otbwidgett = new ComponentName(context, otbwidget.class);
     //   AppWidgetManager manager = AppWidgetManager.getInstance(context);
     //   manager.updateAppWidget(otbwidgett, remoteViews);
   // }


    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created


    }

    @Override
    public void onDisabled(Context context) {

        // Enter relevant functionality for when the last widget is disabled
    }

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        //final GlobalClass globalVariable = (GlobalClass)context.getApplicationContext();
        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
      // RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.otbwidget);
       //Intent intent = new Intent(context, MainActivity.class);
       //Intent callIntent = new Intent(Intent.ACTION_CALL);
       //callIntent.setAction("call");
        //String Customercare = globalVariable.getmCodecc();
       //callIntent.setData(Uri.parse("tel:198"));
      // PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, callIntent, 0);
      // views.setOnClickPendingIntent(R.id.callbutt, pendingIntent);
        //Intent callIntent = new Intent(Intent.ACTION_CALL);
       // String Customercare = globalVariable.getmCodecc();
       // callIntent.setData(Uri.parse(Customercare));
      //  callIntent.setFlags (Intent.FLAG_ACTIVITY_NEW_TASK);
       // context.startActivity (callIntent);
        //PendingIntent.getActivity(context, 0, callIntent, 0);
        // Instruct the widget manager to update the widget
       // appWidgetManager.updateAppWidget(appWidgetId, views);
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
}}


