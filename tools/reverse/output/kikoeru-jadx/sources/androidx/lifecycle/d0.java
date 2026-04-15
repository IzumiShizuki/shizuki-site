package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends i {
    final /* synthetic */ e0 this$0;

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static final class a extends i {
        final /* synthetic */ e0 this$0;

        public a(e0 e0Var) {
            this.this$0 = e0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            jc.l.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            jc.l.e(activity, "activity");
            e0 e0Var = this.this$0;
            int i10 = e0Var.f762a + 1;
            e0Var.f762a = i10;
            if (i10 == 1 && e0Var.f765d) {
                e0Var.f767f.D1(o.ON_START);
                e0Var.f765d = false;
            }
        }
    }

    public d0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        jc.l.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = i0.f774b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            jc.l.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((i0) fragmentFindFragmentByTag).f775a = this.this$0.f769h;
        }
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        jc.l.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i10 = e0Var.f763b - 1;
        e0Var.f763b = i10;
        if (i10 == 0) {
            Handler handler = e0Var.f766e;
            jc.l.b(handler);
            handler.postDelayed(e0Var.f768g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        jc.l.e(activity, "activity");
        c0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        jc.l.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i10 = e0Var.f762a - 1;
        e0Var.f762a = i10;
        if (i10 == 0 && e0Var.f764c) {
            e0Var.f767f.D1(o.ON_STOP);
            e0Var.f765d = true;
        }
    }
}
