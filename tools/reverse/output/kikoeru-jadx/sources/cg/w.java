package cg;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f4135b;

    public w(Context context, ExoPlayer exoPlayer) {
        jc.l.e(context, "context");
        this.f4134a = context;
        this.f4135b = exoPlayer;
    }

    @Override // androidx.lifecycle.u0
    public final s0 a(Class cls) {
        if (cls.isAssignableFrom(v.class)) {
            return new v(this.f4134a, this.f4135b);
        }
        throw new RuntimeException("unknown class :".concat(cls.getName()));
    }

    @Override // androidx.lifecycle.u0
    public final s0 b(pc.c cVar, i4.e eVar) {
        jc.l.e(cVar, "modelClass");
        return c(g8.a.D(cVar), eVar);
    }

    @Override // androidx.lifecycle.u0
    public final s0 c(Class cls, i4.e eVar) {
        return a(cls);
    }
}
