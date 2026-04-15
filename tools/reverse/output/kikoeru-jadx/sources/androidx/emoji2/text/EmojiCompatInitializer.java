package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import c4.k;
import c4.l;
import c4.n;
import c4.u;
import d8.a;
import d8.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // d8.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // d8.b
    public final Object b(Context context) {
        u uVar = new u(new n(context));
        uVar.f3367a = 1;
        if (k.f3374k == null) {
            synchronized (k.f3373j) {
                try {
                    if (k.f3374k == null) {
                        k.f3374k = new k(uVar);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f5544e) {
            try {
                objB = aVarC.f5545a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        q qVarF = ((x) objB).f();
        qVarF.W0(new l(this, qVarF));
    }
}
