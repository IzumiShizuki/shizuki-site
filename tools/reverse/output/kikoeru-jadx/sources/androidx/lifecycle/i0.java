package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/i0;", "Landroid/app/Fragment;", "<init>", "()V", "androidx/lifecycle/v0", "a", "androidx/lifecycle/f0", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class i0 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f774b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f775a;

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final h0 Companion = new h0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            jc.l.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            jc.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            jc.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            jc.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            jc.l.e(activity, "activity");
            int i10 = i0.f774b;
            f0.a(activity, o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            jc.l.e(activity, "activity");
            int i10 = i0.f774b;
            f0.a(activity, o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            jc.l.e(activity, "activity");
            int i10 = i0.f774b;
            f0.a(activity, o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            jc.l.e(activity, "activity");
            int i10 = i0.f774b;
            f0.a(activity, o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            jc.l.e(activity, "activity");
            int i10 = i0.f774b;
            f0.a(activity, o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            jc.l.e(activity, "activity");
            int i10 = i0.f774b;
            f0.a(activity, o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            jc.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jc.l.e(activity, "activity");
            jc.l.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            jc.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            jc.l.e(activity, "activity");
        }
    }

    public final void a(o oVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            jc.l.d(activity, "getActivity(...)");
            f0.a(activity, oVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(o.ON_DESTROY);
        this.f775a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        v0 v0Var = this.f775a;
        if (v0Var != null) {
            ((e0) v0Var.f820a).b();
        }
        a(o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        v0 v0Var = this.f775a;
        if (v0Var != null) {
            e0 e0Var = (e0) v0Var.f820a;
            int i10 = e0Var.f762a + 1;
            e0Var.f762a = i10;
            if (i10 == 1 && e0Var.f765d) {
                e0Var.f767f.D1(o.ON_START);
                e0Var.f765d = false;
            }
        }
        a(o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(o.ON_STOP);
    }
}
