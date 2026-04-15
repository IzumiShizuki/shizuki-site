package com.tencent.bugly.beta.tinker;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import com.tencent.tinker.loader.TinkerLoader;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class TinkerPatchReflectApplication extends TinkerApplication {
    private static final String TAG = "Tinker.ReflectApp";
    private boolean isReflectFailure;
    private String rawApplicationName;
    private Application realApplication;

    public TinkerPatchReflectApplication() {
        super(15, "com.tencent.bugly.beta.tinker.TinkerApplicationLike", TinkerLoader.class.getName(), false);
        this.rawApplicationName = null;
        this.isReflectFailure = false;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        try {
            String rawApplicationName = getRawApplicationName(context);
            if (rawApplicationName == null) {
                throw new RuntimeException("can get real realApplication from manifest!");
            }
            Application application = (Application) Class.forName(rawApplicationName, false, getClassLoader()).getConstructor(null).newInstance(null);
            this.realApplication = application;
            if (application != null) {
                try {
                    Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.realApplication, context);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            }
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i10) {
        Application application;
        return (!this.isReflectFailure || (application = this.realApplication) == null) ? super.bindService(intent, serviceConnection, i10) : application.bindService(intent, serviceConnection, i10);
    }

    public AssetManager getAssets() {
        Application application;
        return (!this.isReflectFailure || (application = this.realApplication) == null) ? super.getAssets() : application.getAssets();
    }

    public ClassLoader getClassLoader() {
        Application application;
        return (!this.isReflectFailure || (application = this.realApplication) == null) ? super.getClassLoader() : application.getClassLoader();
    }

    public ContentResolver getContentResolver() {
        Application application;
        return (!this.isReflectFailure || (application = this.realApplication) == null) ? super.getContentResolver() : application.getContentResolver();
    }

    public String getRawApplicationName(Context context) {
        String str = this.rawApplicationName;
        if (str != null) {
            return str;
        }
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("TINKER_PATCH_APPLICATION");
            if (obj != null) {
                this.rawApplicationName = String.valueOf(obj);
            } else {
                this.rawApplicationName = null;
            }
            Log.i(TAG, "with app realApplication from manifest applicationName:" + this.rawApplicationName);
            return this.rawApplicationName;
        } catch (Exception e10) {
            Log.e(TAG, "getManifestApplication exception:" + e10.getMessage());
            return null;
        }
    }

    public Resources getResources() {
        Application application;
        return (!this.isReflectFailure || (application = this.realApplication) == null) ? super.getResources() : application.getResources();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.onConfigurationChanged(configuration);
        } else {
            application.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        Class<?> cls;
        Field declaredField;
        if (this.realApplication != null) {
            try {
                Class<?> cls2 = Class.forName("android.app.ActivityThread");
                Object activityThread = ShareReflectUtil.getActivityThread(this, cls2);
                Field declaredField2 = cls2.getDeclaredField("mInitialApplication");
                declaredField2.setAccessible(true);
                Application application = (Application) declaredField2.get(activityThread);
                Application application2 = this.realApplication;
                if (application2 != null && application == this) {
                    declaredField2.set(activityThread, application2);
                }
                if (this.realApplication != null) {
                    Field declaredField3 = cls2.getDeclaredField("mAllApplications");
                    declaredField3.setAccessible(true);
                    List list = (List) declaredField3.get(activityThread);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (list.get(i10) == this) {
                            list.set(i10, this.realApplication);
                        }
                    }
                }
                try {
                    cls = Class.forName("android.app.LoadedApk");
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName("android.app.ActivityThread$PackageInfo");
                }
                Field declaredField4 = cls.getDeclaredField("mApplication");
                declaredField4.setAccessible(true);
                try {
                    declaredField = Application.class.getDeclaredField("mLoadedApk");
                } catch (NoSuchFieldException e10) {
                    e10.printStackTrace();
                    declaredField = null;
                }
                String[] strArr = {"mPackages", "mResourcePackages"};
                for (int i11 = 0; i11 < 2; i11++) {
                    Field declaredField5 = cls2.getDeclaredField(strArr[i11]);
                    declaredField5.setAccessible(true);
                    Iterator it = ((Map) declaredField5.get(activityThread)).entrySet().iterator();
                    while (it.hasNext()) {
                        Object obj = ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                        if (obj != null && declaredField4.get(obj) == this) {
                            Application application3 = this.realApplication;
                            if (application3 != null) {
                                declaredField4.set(obj, application3);
                            }
                            Application application4 = this.realApplication;
                            if (application4 != null && declaredField != null) {
                                declaredField.set(application4, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.e(TAG, "Error, reflect Application fail, result:" + th2);
                this.isReflectFailure = true;
            }
            if (!this.isReflectFailure) {
                try {
                    Class<?> cls3 = Class.forName("com.tencent.bugly.beta.tinker.TinkerApplicationLike", false, getClassLoader());
                    StringBuilder sb = new StringBuilder();
                    sb.append("replaceApplicationLike delegateClass:");
                    sb.append(cls3);
                    Log.e(TAG, sb.toString());
                    ShareReflectUtil.findField(cls3, "application").set(cls3.getDeclaredMethod("getTinkerPatchApplicationLike", null).invoke(cls3, null), this.realApplication);
                } catch (Throwable th3) {
                    Log.e(TAG, "replaceApplicationLike exception:" + th3.getMessage());
                }
            }
        }
        super.onCreate();
        Application application5 = this.realApplication;
        if (application5 != null) {
            application5.onCreate();
        }
    }

    public void onLowMemory() {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.onLowMemory();
        } else {
            application.onLowMemory();
        }
    }

    public void onTerminate() {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.onTerminate();
        } else {
            application.onTerminate();
        }
    }

    public void onTrimMemory(int i10) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.onTrimMemory(i10);
        } else {
            application.onTrimMemory(i10);
        }
    }

    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        } else {
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.registerComponentCallbacks(componentCallbacks);
        } else {
            application.registerComponentCallbacks(componentCallbacks);
        }
    }

    public void registerOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.registerOnProvideAssistDataListener(onProvideAssistDataListener);
        } else {
            application.registerOnProvideAssistDataListener(onProvideAssistDataListener);
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Application application;
        return (!this.isReflectFailure || (application = this.realApplication) == null) ? super.registerReceiver(broadcastReceiver, intentFilter) : application.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void unbindService(ServiceConnection serviceConnection) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.unbindService(serviceConnection);
        } else {
            application.unbindService(serviceConnection);
        }
    }

    public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        } else {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.unregisterComponentCallbacks(componentCallbacks);
        } else {
            application.unregisterComponentCallbacks(componentCallbacks);
        }
    }

    public void unregisterOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.unregisterOnProvideAssistDataListener(onProvideAssistDataListener);
        } else {
            application.unregisterOnProvideAssistDataListener(onProvideAssistDataListener);
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            super.unregisterReceiver(broadcastReceiver);
        } else {
            application.unregisterReceiver(broadcastReceiver);
        }
    }
}
