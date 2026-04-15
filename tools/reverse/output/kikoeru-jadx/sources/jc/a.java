package jc;

import j2.h0;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f10808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10811e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10813g;

    public a(int i10, int i11, Class cls, Object obj, String str, String str2) {
        this.f10807a = obj;
        this.f10808b = cls;
        this.f10809c = str;
        this.f10810d = str2;
        this.f10812f = i10;
        this.f10813g = i11 >> 1;
    }

    @Override // jc.i
    public final int c() {
        return this.f10812f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10811e == aVar.f10811e && this.f10812f == aVar.f10812f && this.f10813g == aVar.f10813g && l.a(this.f10807a, aVar.f10807a) && this.f10808b.equals(aVar.f10808b) && this.f10809c.equals(aVar.f10809c) && this.f10810d.equals(aVar.f10810d);
    }

    public final int hashCode() {
        Object obj = this.f10807a;
        return ((((h0.e(h0.e((this.f10808b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.f10809c), 31, this.f10810d) + (this.f10811e ? 1231 : 1237)) * 31) + this.f10812f) * 31) + this.f10813g;
    }

    public final String toString() {
        return z.f10839a.h(this);
    }
}
