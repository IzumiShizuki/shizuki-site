package na;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f15738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15740f;

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15739e = obj;
        this.f15740f |= Integer.MIN_VALUE;
        Serializable serializableF = c.f(null, null, this);
        return serializableF == zb.a.f26667a ? serializableF : new ub.n(serializableF);
    }
}
