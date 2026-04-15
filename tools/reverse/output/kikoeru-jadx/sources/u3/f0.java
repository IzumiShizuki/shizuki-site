package u3;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f21287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f21288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f21289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f21290d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f21287a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f21288b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f21289c = declaredField3;
            declaredField3.setAccessible(true);
            f21290d = true;
        } catch (ReflectiveOperationException e10) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }
}
