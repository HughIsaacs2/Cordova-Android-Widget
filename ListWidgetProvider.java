package com.hughisaacs2.cordova.plugins.androidwidgetplugin;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class ListWidgetProvider extends run.ace.AppWidgetProvider {
  @Override protected int getLayoutResourceId(android.content.Context context) {
    return run.ace.NativeHost.getResourceId("list_widget_layout", "layout", context);
  }

  @Override protected int getViewResourceId(android.content.Context context) {
    return run.ace.NativeHost.getResourceId("list_widget_view", "id", context);
  }

  @Override protected int getItemResourceId(android.content.Context context) {
    return run.ace.NativeHost.getResourceId("list_widget_item", "id", context);
  }

  @Override protected int getItemTextResourceId(android.content.Context context) {
    return run.ace.NativeHost.getResourceId("list_widget_item_text", "id", context);
  }

  @Override protected int getItemLayoutResourceId(android.content.Context context) {
    return run.ace.NativeHost.getResourceId("list_widget_item", "layout", context);
  }
}