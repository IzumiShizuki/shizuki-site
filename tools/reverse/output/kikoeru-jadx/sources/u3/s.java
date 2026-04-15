package u3;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.cnl.kikoeru.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f21328a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f21329b = false;

    static {
        new WeakHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r6, int r7) {
        /*
            r0 = -1
            if (r7 != r0) goto L5
            r3 = -1
            goto L49
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 4
            r4 = 0
            r5 = 6
            if (r1 >= r2) goto L17
            switch(r7) {
                case 21: goto L16;
                case 22: goto L14;
                case 23: goto L16;
                case 24: goto L14;
                case 25: goto L12;
                case 26: goto L16;
                case 27: goto L14;
                default: goto L11;
            }
        L11:
            goto L17
        L12:
            r7 = 0
            goto L17
        L14:
            r7 = 4
            goto L17
        L16:
            r7 = 6
        L17:
            r2 = 30
            if (r1 >= r2) goto L30
            r2 = 12
            if (r7 == r2) goto L2e
            r2 = 13
            if (r7 == r2) goto L2c
            r2 = 16
            if (r7 == r2) goto L2e
            r2 = 17
            if (r7 == r2) goto L31
            goto L30
        L2c:
            r4 = 6
            goto L31
        L2e:
            r4 = 1
            goto L31
        L30:
            r4 = r7
        L31:
            r7 = 27
            if (r1 >= r7) goto L42
            r7 = 7
            if (r4 == r7) goto L41
            r7 = 8
            if (r4 == r7) goto L41
            r7 = 9
            if (r4 == r7) goto L41
            goto L42
        L41:
            r4 = -1
        L42:
            r7 = 23
            if (r1 >= r7) goto L48
            if (r4 == r5) goto L49
        L48:
            r3 = r4
        L49:
            if (r3 != r0) goto L4c
            return
        L4c:
            r6.performHapticFeedback(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.s.a(android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0029, B:17:0x0033), top: B:32:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.view.ViewGroup r4, u3.b r5) {
        /*
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L42
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto Lf
            android.view.View$AccessibilityDelegate r2 = u3.p.a(r4)
            goto L39
        Lf:
            boolean r2 = u3.s.f21329b
            if (r2 == 0) goto L14
            goto L38
        L14:
            java.lang.reflect.Field r2 = u3.s.f21328a
            if (r2 != 0) goto L29
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L26
            u3.s.f21328a = r2     // Catch: java.lang.Throwable -> L26
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            u3.s.f21329b = r1
            goto L38
        L29:
            java.lang.reflect.Field r2 = u3.s.f21328a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L36
            boolean r3 = r2 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L38
            android.view.View$AccessibilityDelegate r2 = (android.view.View.AccessibilityDelegate) r2     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            u3.s.f21329b = r1
        L38:
            r2 = r0
        L39:
            boolean r2 = r2 instanceof u3.a
            if (r2 == 0) goto L42
            u3.b r5 = new u3.b
            r5.<init>()
        L42:
            int r2 = r4.getImportantForAccessibility()
            if (r2 != 0) goto L4b
            r4.setImportantForAccessibility(r1)
        L4b:
            if (r5 != 0) goto L4e
            goto L50
        L4e:
            u3.a r0 = r5.f21270b
        L50:
            r4.setAccessibilityDelegate(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.s.b(android.view.ViewGroup, u3.b):void");
    }

    public static void c(View view, v vVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(vVar != null ? new b0(vVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = z.f21366e;
        View.OnApplyWindowInsetsListener yVar = vVar != null ? new y(view, vVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, yVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(yVar);
        }
    }
}
