package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ld8/b;", "Landroidx/lifecycle/x;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements d8.b {
    @Override // d8.b
    public final List a() {
        return vb.r.f22819a;
    }

    @Override // d8.b
    public final Object b(Context context) {
        jc.l.e(context, "context");
        d8.a aVarC = d8.a.c(context);
        jc.l.d(aVarC, "getInstance(...)");
        if (!aVarC.f5546b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!u.f818a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            jc.l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new t());
        }
        e0 e0Var = e0.f761i;
        e0Var.getClass();
        e0Var.f766e = new Handler();
        e0Var.f767f.D1(o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        jc.l.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new d0(e0Var));
        return e0Var;
    }
}
