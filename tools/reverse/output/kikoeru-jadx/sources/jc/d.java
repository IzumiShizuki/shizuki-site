package jc;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements pc.b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient pc.b f10818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f10820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10823f;

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f10819b = obj;
        this.f10820c = cls;
        this.f10821d = str;
        this.f10822e = str2;
        this.f10823f = z10;
    }

    public pc.b f() {
        pc.b bVar = this.f10818a;
        if (bVar != null) {
            return bVar;
        }
        pc.b bVarH = h();
        this.f10818a = bVarH;
        return bVarH;
    }

    @Override // pc.b
    public final String getName() {
        return this.f10821d;
    }

    public abstract pc.b h();

    public final pc.e i() {
        Class cls = this.f10820c;
        if (cls == null) {
            return null;
        }
        return this.f10823f ? z.f10839a.c(cls) : z.f10839a.b(cls);
    }

    public abstract pc.b j();

    @Override // pc.b
    public final pc.v n() {
        return j().n();
    }

    @Override // pc.b
    public final List o() {
        return j().o();
    }
}
